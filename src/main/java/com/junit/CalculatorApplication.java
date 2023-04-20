package com.junit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.junit.Calculator.Calculator;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
		
		Calculator c=new Calculator();
		int add = c.add(10, 20);
		int sub = c.sub(20, 10);
		int mul = c.mul(20, 20);
		int div = c.div(30, 2);
			
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		
		
		
		
	}
	
	public String msgFirst() {
		
		return "This is First msg";
	}

}
