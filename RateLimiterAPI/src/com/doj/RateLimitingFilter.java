/**
 * 
 */
package com.doj;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * @author Dinesh.Rajput
 *
 */
public class RateLimitingFilter {
	
	private boolean enabled;
	
	private Map<String, SimpleRateLimiter> limiters = new ConcurrentHashMap<>();
	
	public APIUsageStatus checkRateLimit(APIClinet client){
		
		APIUsageStatus apiUsageStatus = new APIUsageStatus(); 
		if (!enabled) {
			apiUsageStatus.setAllow(true);
            return apiUsageStatus;
        }
		
		if (client == null) {
			apiUsageStatus.setAllow(true);
            return apiUsageStatus;
        }
		
		SimpleRateLimiter rateLimiter = getRateLimiter(client);
        boolean allowRequest = rateLimiter.tryAcquire();
        if (!allowRequest) {
        	apiUsageStatus.setStatus("TOO MANY REQUESTS");
        }
        apiUsageStatus.setAllow(allowRequest);
        apiUsageStatus.setAllowedLimit(LicenseType.HIGH);
        return apiUsageStatus;
     
	}
	
	private SimpleRateLimiter getRateLimiter(APIClinet client) {
		if (limiters.containsKey(client.clientId)) {
			return limiters.get(client.clientId);
        } else {
            synchronized(client.clientId.intern()) {
                // double-checked locking to avoid multiple-reinitializations
                if (limiters.containsKey(client.clientId)) {
                    return limiters.get(client.clientId);
                }
                SimpleRateLimiter rateLimiter = createRateLimiter(client.clientId);
                limiters.put(client.clientId, rateLimiter);
                return rateLimiter;
            }
        }
    }

	private SimpleRateLimiter createRateLimiter(String clientId) {
		SimpleRateLimiter rateLimiter = SimpleRateLimiter.create(50, TimeUnit.MINUTES);
		return rateLimiter;
	}
}
