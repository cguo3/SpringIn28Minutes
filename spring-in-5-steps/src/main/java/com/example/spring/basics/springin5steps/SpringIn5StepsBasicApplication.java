package com.example.spring.basics.springin5steps;


import com.example.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.example.spring.basics.springin5steps.service.SomeExternalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//@SpringBootApplication
@Configuration
@ComponentScan(value = "com.example.spring.basics.springin5steps")
@PropertySource("application.properties")
public class SpringIn5StepsBasicApplication {
	private static Logger logger = LoggerFactory.getLogger(SpringIn5StepsBasicApplication.class);

	public static void main(String[] args) {
//		AnnotationConfigApplicationContext applicationContext =
//				new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class);

		try (AnnotationConfigApplicationContext applicationContext =
					 new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class)) {
			BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
			int result = binarySearch.binarySearch(new int[] {12, 45, 5}, 3);
			logger.info("******************* HELLO WORLD *******************");

			SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);
			logger.info(someExternalService.returnServiceURL());
		}

	}
}
