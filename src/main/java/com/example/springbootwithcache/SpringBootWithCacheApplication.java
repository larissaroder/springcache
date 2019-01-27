package com.example.springbootwithcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching //enables Spring Caching functionality
public class SpringBootWithCacheApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithCacheApplication.class, args);
	}

}

