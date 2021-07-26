package br.com.trainner.alluraforum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport

public class AlluraforumApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlluraforumApplication.class, args);
	}

}
