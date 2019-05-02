package com.nr.patient.service.feature.validator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import com.nr.patient.to.PatientFilterTO;

@Component
@ConditionalOnProperty(value="PatientSearchByPhoneNumber")
public class PatientSearchByPhoneNumberValidator implements PatientSearchFeatureValidator {
	
	private static final Logger logger = LogManager.getLogger(PatientSearchByPhoneNumberValidator.class);
	
	private String command = "PhoneNumber";
	
	@Override
	public void validate(PatientFilterTO patientFilter) {
		// TODO Auto-generated method stub
		logger.info("PatientSearchByPhoneNumberValidator Begin");
		if(patientFilter.getCommand().equals(command)) {
			logger.info("PatientSearchByPhoneNumberValidator execute");
		} else {
			logger.info("pass to the next");
		}
		logger.info("PatientSearchByPhoneNumberValidator End");
		
	}

}
