package com.config.servernew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringbootConfigServernew1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootConfigServernew1Application.class, args);
	}

}
