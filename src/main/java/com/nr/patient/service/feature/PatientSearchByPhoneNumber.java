package com.nr.patient.service.feature;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import com.nr.patient.to.PatientFilterTO;
import com.nr.patient.to.PatientListTO;

@Component
//@Profile("US")
@ConditionalOnProperty(value="PatientSearchByPhoneNumber")

public class PatientSearchByPhoneNumber implements PatientSearchFeature {
	
	private static final Logger logger = LogManager.getLogger(PatientSearchByPhoneNumber.class);
	
	private String command = "PhoneNumber";
	 @Value("${PatientSearchByPhoneNumber.order}")
	    private int myOrder;

	    @Override
	    public int getOrder() {
	        return myOrder;
	    }
	
	@Override
	public PatientListTO patientSearch(PatientFilterTO patientFilter) {
		// TODO Auto-generated method stub
		logger.info("PatientSearchByPhoneNumber Begin");
		if(patientFilter.getCommand().equals(command)) {
			//execute the logic
			logger.info("Patient search by PhoneNumber");
			
		} else {
			logger.info("PatientSearchByPhoneNumber pass to the next");
		}
		logger.info("PatientSearchByPhoneNumber End");
		return null;
	}

}
