package com.example.spring_rest_api;

import org.springframework.boot.SpringApplication;
import com.example.spring_rest_api.entity.Book;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@SpringBootApplication
public class SpringRestApiApplication implements RepositoryRestConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApiApplication.class, args);
	}

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
		config.exposeIdsFor(Book.class);
		cors.addMapping("/books/**")
				.allowedOrigins("http://localhost:3000")
				.allowedMethods("GET", "POST", "PUT", "DELETE");
	}
}
