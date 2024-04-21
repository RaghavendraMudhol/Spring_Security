package com.Demo.Simple.Security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Slf4j
@SpringBootApplication
@EnableWebSecurity
public class SimpleSecurityApplication {

	public static void main(String[] args) {

		SpringApplication.run(SimpleSecurityApplication.class, args);

		log.info(" Security Application Demo");
		log.info(" Server port configured");
		log.info(" Default Security configured");
		log.info(" Role based Security configured");


	}

}
