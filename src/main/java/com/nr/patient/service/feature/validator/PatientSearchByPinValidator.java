package com.nr.patient.service.feature.validator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import com.nr.patient.to.PatientFilterTO;

@Component
@ConditionalOnProperty(value="PatientSearchByPin")
public class PatientSearchByPinValidator implements PatientSearchFeatureValidator {
	private static final Logger logger = LogManager.getLogger(PatientSearchByPinValidator.class);
	
	private String command = "Pin";
	
	
	@Override
	public void validate(PatientFilterTO patientFilter) {
		// TODO Auto-generated method stub
		logger.info("PatientSearchByPinValidator Begin");
		if(patientFilter.getCommand().equals(command)) {
			logger.info("PatientSearchByPinValidator execute");
		} else {
			logger.info("pass to the next");
		}
		logger.info("PatientSearchByPinValidator End");
	}

}
