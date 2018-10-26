/**
 * 
 */
package com.dineshonjava.bookshop.shopfrontui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Dinesh.Rajput
 *
 */
@Controller
public class BookShopController {
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
}
