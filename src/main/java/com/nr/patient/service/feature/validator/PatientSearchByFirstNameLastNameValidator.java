package com.nr.patient.service.feature.validator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import com.nr.patient.to.PatientFilterTO;

@Component
@ConditionalOnProperty(value="PatientSearchByFirstNameLastName")
public class PatientSearchByFirstNameLastNameValidator implements PatientSearchFeatureValidator {
	
	private static final Logger logger = LogManager.getLogger(PatientSearchByFirstNameLastNameValidator.class);
	
	private String command = "FirstNameLastName";
	
	
	@Override
	public void validate(PatientFilterTO patientFilter) {
		// TODO Auto-generated method stub
		logger.info("PatientSearchByFirstNameLastNameValidator Begin");
		if(patientFilter.getCommand().equals(command)) {
			logger.info("PatientSearchByFirstNameLastNameValidator exexute");
		} else {
			logger.info("pass to the next");
		}
		logger.info("PatientSearchByFirstNameLastNameValidator End");
	}

}
