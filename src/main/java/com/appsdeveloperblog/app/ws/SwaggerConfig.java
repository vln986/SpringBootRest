package com.appsdeveloperblog.app.ws;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.wordnik.swagger.models.Contact;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
/*	Contact contact = new Contact(
		"Laxminarayana",
		"http://appsdeveloperblog.com",
		"laxminarayanaveggalam@gmail.com"
	);*/
	
	@Bean
	public Docket apiDocket() {
		
		Docket docket = new Docket(DocumentationType.SWAGGER_2)
				.protocols(new HashSet<>(Arrays.asList("HTTP","HTTPs")))
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.appsdeveloperblog.app.ws"))
				.paths(PathSelectors.any())
				.build();
		return docket;
	}
}
