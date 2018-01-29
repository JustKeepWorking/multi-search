package com.github.nduyhai.multisearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class MultiSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiSearchApplication.class, args);
	}
}
