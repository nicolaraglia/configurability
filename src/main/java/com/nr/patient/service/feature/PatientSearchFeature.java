package com.nr.patient.service.feature;

import com.nr.patient.to.PatientFilterTO;
import com.nr.patient.to.PatientListTO;

public interface PatientSearchFeature {
	public PatientListTO patientSearch(PatientFilterTO patientFilter);

}
