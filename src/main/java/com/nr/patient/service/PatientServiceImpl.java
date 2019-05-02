package com.nr.patient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;

import com.nr.patient.service.action.PatientSearchAction;
import com.nr.patient.to.PatientFilterTO;
import com.nr.patient.to.PatientListTO;
import com.nr.patient.to.PatientTO;

@Component
@EnableAutoConfiguration
public class PatientServiceImpl implements Patient {
//	@Autowired
//	PatientSearchList patientSearchList;

	@Autowired
	@Qualifier("patientSearch")
	PatientSearchAction patientSearchAction;
	
	public void show() {
		System.out.println("Class Patient initialised");
	}

	@Override
	public void patientCreation(PatientTO patient) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PatientListTO patientSearch(PatientFilterTO patientFilter) {
		// TODO Auto-generated method stub
//		
//		PatientListTO patientList = null;
//		for(PatientSearchAction patientSearchAction: patientSearchList.getPatientSearchActions()) {
//			patientList = patientSearchAction.patientSearch(patientFilter);
//		}
		PatientListTO result = patientSearchAction.patientSearch(patientFilter);
		return result;
	}
}
