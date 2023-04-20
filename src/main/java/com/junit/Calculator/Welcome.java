package com.junit.Calculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Welcome {
	@GetMapping("/")
	public String wel() {
		return "Welcome Vivek";
	}
}
