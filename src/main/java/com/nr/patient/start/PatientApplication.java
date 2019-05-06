package com.nr.patient.start;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nr.patient.service.Patient;
import com.nr.patient.service.PatientServiceImpl;
import com.nr.patient.service.feature.validator.PatientSearchByPinValidator;
import com.nr.patient.to.PatientFilterTO;

@SpringBootApplication
@RestController
@ComponentScan("com.nr.patient")

public class PatientApplication {
	
	private static final Logger logger = LogManager.getLogger(PatientApplication.class);
	@RequestMapping("/")
	String home() {
		return "Hello World Spring Boot";
	}
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(PatientApplication.class, args);
		String profile = applicationContext.getEnvironment().getProperty("spring.profiles.active");
		logger.info("-------                                   --------------------");
		logger.info("			------------------------------");
		
		logger.info("--------    THE LIST OF ACTIVE BEAN start	------------------");
		logger.info("----------------------");
		
		printListOfBean(applicationContext);
		logger.info("-------                                   --------------------");
		logger.info("			------------------------------");
		
		logger.info("--------    THE LIST OF ACTIVE BEAN end	------------------");
		logger.info("----------------------");
		
		Patient patient = applicationContext.getBean(PatientServiceImpl.class);
		PatientFilterTO patientFilter = new PatientFilterTO();
		patientFilter.setCommand("Pin");
		patient.patientSearch(patientFilter);
		
		
		
	}

	private static void printListOfBean(ConfigurableApplicationContext applicationContext) {
		String[] beanNames = applicationContext.getBeanDefinitionNames();
      Arrays.sort(beanNames);
      for (String beanName : beanNames) {
      		if(beanName.contains("patient"))
      			logger.info(beanName);
      }

	}
}
