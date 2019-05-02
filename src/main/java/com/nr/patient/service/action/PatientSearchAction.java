package com.nr.patient.service.action;

import com.nr.patient.to.PatientFilterTO;
import com.nr.patient.to.PatientListTO;

public interface PatientSearchAction {
	
	public PatientListTO patientSearch(PatientFilterTO patientFilter);

}
