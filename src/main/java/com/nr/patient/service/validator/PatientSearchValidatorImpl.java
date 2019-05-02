package com.nr.patient.service.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nr.patient.service.bean.PatientSearchFeatureValidatorList;
import com.nr.patient.service.feature.validator.PatientSearchFeatureValidator;
import com.nr.patient.to.PatientFilterTO;


public class PatientSearchValidatorImpl implements PatientSearchValidator {
	@Autowired
	PatientSearchFeatureValidatorList patientSearchFeatureValidatorList;
	@Override
	public void validate(PatientFilterTO patientFilter) {
		// TODO Auto-generated method stub
		for(PatientSearchFeatureValidator patientSearchFeatureValidator: patientSearchFeatureValidatorList.getPatientSearchFeatureValidatorList()) {
			patientSearchFeatureValidator.validate(patientFilter);
		}
		
	}

}
