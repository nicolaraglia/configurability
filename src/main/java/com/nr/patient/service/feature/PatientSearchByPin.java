package com.nr.patient.service.feature;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import com.nr.patient.to.PatientFilterTO;
import com.nr.patient.to.PatientListTO;

@Component
@ConditionalOnProperty(value="PatientSearchByPin")
public class PatientSearchByPin implements PatientSearchFeature {
	
	private static final Logger logger = LogManager.getLogger(PatientSearchByPin.class);
	private final String command = "Pin"; 

	@Override
	public PatientListTO patientSearch(PatientFilterTO patientFilter) {
		// TODO Auto-generated method stub
		logger.info("PatientSearchByPin Begin");
		PatientListTO result = null;
		if(patientFilter.getCommand().equals(command)) {
			//execute the logic
			logger.info("Patient search by Pin");
			
		} else {
			logger.info("PatientSearchByPhoneNumber pass to the next");
		}
		logger.info("PatientSearchByPin End");
		return result;
	}

}
