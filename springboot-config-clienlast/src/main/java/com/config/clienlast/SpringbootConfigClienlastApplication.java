package com.config.clienlast;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@RestController
@SpringBootApplication
public class SpringbootConfigClienlastApplication {
	  @Value("${welcome.message}")
	   String welcomeText;
	   
	public static void main(String[] args) {
		SpringApplication.run(SpringbootConfigClienlastApplication.class, args);
	}
	  @RequestMapping("/message")
	   public String welcomeText() {
	      return welcomeText;
	   }

}
