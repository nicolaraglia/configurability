package com.nr.patient.service.feature;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import com.nr.patient.to.PatientFilterTO;
import com.nr.patient.to.PatientListTO;

@Component
@ConditionalOnProperty(value="PatientSearchByFirstNameLastName")

public class PatientSearchByFirstNameLastName implements PatientSearchFeature {
	
	private static final Logger logger = LogManager.getLogger(PatientSearchByFirstNameLastName.class);

	private String command = "FirstNameLastName";
	
	
	@Override
	public PatientListTO patientSearch(PatientFilterTO patientFilter) {
		// TODO Auto-generated method stub
		logger.info("PatientSearchByFirstNameLastName Begin");
		if(patientFilter.getCommand().equals(command)) {
			//execute the logic
			logger.info("Patient search by FirstNameLastName");
			
		} else {
			logger.info("PatientSearchByFirstNameLastName: pass to the next");
		}
		System.out.println("PatientSearchByFirstNameLastName End");
		return null;
	}

}
