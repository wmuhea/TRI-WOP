package com.doclink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class DoclinkApplication {
	public static void main(String[] args) {
		SpringApplication.run(DoclinkApplication.class, args);
	}

}
