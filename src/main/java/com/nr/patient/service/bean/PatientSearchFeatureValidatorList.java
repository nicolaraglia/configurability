package com.nr.patient.service.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nr.patient.service.feature.validator.PatientSearchFeatureValidator;

@Component
public class PatientSearchFeatureValidatorList {
	@Autowired
	List<PatientSearchFeatureValidator> patientSearchFeatureValidatorList;

	public List<PatientSearchFeatureValidator> getPatientSearchFeatureValidatorList() {
		return patientSearchFeatureValidatorList;
	}

	public void setPatientSearchFeatureValidatorList(
			List<PatientSearchFeatureValidator> patientSearchFeatureValidatorList) {
		this.patientSearchFeatureValidatorList = patientSearchFeatureValidatorList;
	}

	
	
}
