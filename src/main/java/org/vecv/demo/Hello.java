package org.vecv.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	
	@RequestMapping("/")
	public String demo()
	{
	return "This is a Rest Service -> VECV";
	}
}
