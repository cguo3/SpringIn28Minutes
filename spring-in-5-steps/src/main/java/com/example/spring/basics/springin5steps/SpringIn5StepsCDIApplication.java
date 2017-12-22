//package com.example.spring.basics.springin5steps;
//
//import com.example.spring.basics.springin5steps.cdi.SomeCDIBusiness;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.Configuration;
//
////@SpringBootApplication
//@Configuration
//public class SpringIn5StepsCDIApplication {
//	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCDIApplication.class);
//	public static void main(String[] args) {
//
//
//		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsCDIApplication.class, args);
//
//		// The @RequestScoped doesn't work here
//		SomeCDIBusiness someCDIBusiness1 = applicationContext.getBean(SomeCDIBusiness.class);
//		LOGGER.info("{} dao -> {} -> {}", someCDIBusiness1);
//		SomeCDIBusiness someCDIBusiness2 = applicationContext.getBean(SomeCDIBusiness.class);
//		LOGGER.info("{} dao -> {} -> {}", someCDIBusiness2);
//	}
//}
