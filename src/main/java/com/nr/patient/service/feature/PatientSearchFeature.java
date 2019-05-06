package com.nr.patient.service.feature;

import org.springframework.core.Ordered;

import com.nr.patient.to.PatientFilterTO;
import com.nr.patient.to.PatientListTO;

public interface PatientSearchFeature extends Ordered {
	public PatientListTO patientSearch(PatientFilterTO patientFilter);
	
	
	

}
