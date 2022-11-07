package com.gitTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KrupalController {
	
	@GetMapping("/reboot")
	public String refresh()
	{
		System.out.println("Get Refresh...!!!");
		return "energy";
	}
}
