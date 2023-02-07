package com.Keebori.Keyboards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class KeyboardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeyboardsApplication.class, args);
	}

}
