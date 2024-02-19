package com.smartfore.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.smartfore.common.entity", "com.smartfore.admin.user"})
public class SmartForeBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartForeBackEndApplication.class, args);
	}

}
