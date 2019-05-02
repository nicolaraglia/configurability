package com.nr.patient.service;

import com.nr.patient.to.PatientFilterTO;
import com.nr.patient.to.PatientListTO;
import com.nr.patient.to.PatientTO;


public interface Patient {
	
	public void patientCreation(PatientTO patient);
	
	public PatientListTO patientSearch(PatientFilterTO patientFilter);
	
	public void show();

}
