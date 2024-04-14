package com.in28.learningSpringFramework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {};
record Address(String firstline, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Kranth";
	}
	@Bean
	public Person person() {
		return new Person("Sai", 28);
	}
	@Bean
	public Address address() {
		return new Address("Mopal", "mahalaxmi Nagar");
	}
}
