package com.dreamtown.clusterdaun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.dreamtown.clusterdaun.config.PasswordEncode;

@SpringBootApplication
public class ClusterDaunApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClusterDaunApplication.class, args);
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new PasswordEncode();
	}
}
