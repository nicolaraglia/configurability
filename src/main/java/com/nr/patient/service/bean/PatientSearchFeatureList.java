package com.nr.patient.service.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nr.patient.service.feature.PatientSearchFeature;

@Component
public class PatientSearchFeatureList {
	@Autowired
	List<PatientSearchFeature> patientSearchFeatureList;

	public List<PatientSearchFeature> getPatientSearchFeatureList() {
		return patientSearchFeatureList;
	}

	public void setPatientSearchFeatureList(List<PatientSearchFeature> patientSearchFeatureList) {
		this.patientSearchFeatureList = patientSearchFeatureList;
	}

	
	

	
	
	

}
