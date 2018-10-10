/**
 * 
 */
package com.doj.test

/**
 * @author Dinesh.Rajput
 *
 */
class AccountGatlingSimulation extends Simulation{
	val scn = scenario("AddAndFindAccount").repeat(500, "n") {
        exec(
          http("AddAccount-API")
            .post("http://localhost:1111/account")
            .header("Content-Type", "application/json")
            .body(StringBody("""{"accountId":${n}, "name":"Arnav${n}","email":"arnav${n}@mail.com","mobile":"9334343${n}",
                "address": "Noida:${n}"}"""))
            .check(status.is(200))
        ).pause(2)
  }.repeat(500, "n") {
        exec(
          http("GetAccount-API")
            .get("http://localhost:8090/account/${n}")
            .check(status.is(200))
        )
  }
  setUp(scn.inject(atOnceUsers(30))).maxDuration(FiniteDuration.apply(5, "minutes"))
}