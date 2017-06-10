package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HajibootApplication {

	@GetMapping
	String home() {
		System.out.println("テスト：" + substring("abc", -1));
		return "Hello Spring!";
	}

	public static void main(String[] args) {
		SpringApplication.run(HajibootApplication.class, args);
	}
	
	public static String substring(String str, int start){
		if (str == null || str.isEmpty()) {
			return str;
		}

		if (str.length() < start) {
			return "";
		}else if (start < 0) {
			start += str.length();
		}
		return str.substring(start); 

	}
}
