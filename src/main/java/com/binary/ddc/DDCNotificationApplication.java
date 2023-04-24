package com.binary.ddc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@ServletComponentScan
@SpringBootApplication
public class DDCNotificationApplication {
	public static void main(String[] args) {
		SpringApplication.run(DDCNotificationApplication.class, args);
	}
}
