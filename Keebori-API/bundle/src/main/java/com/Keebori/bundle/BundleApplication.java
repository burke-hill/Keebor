package com.Keebori.bundle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
		"com.Keebori.Keyboards"
})
public class BundleApplication {

	public static void main(String[] args) {
		SpringApplication.run(BundleApplication.class, args);
	}

}
