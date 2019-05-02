package com.nr.patient.service.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nr.patient.service.bean.PatientSearchFeatureList;
import com.nr.patient.service.bean.PatientSearchFeatureValidatorList;
import com.nr.patient.service.feature.PatientSearchFeature;
import com.nr.patient.service.feature.validator.PatientSearchFeatureValidator;
import com.nr.patient.to.PatientFilterTO;
import com.nr.patient.to.PatientListTO;

@Component
@Qualifier("patientSearch")
public class PatientSearchActionImpl implements PatientSearchAction {
	@Autowired
	PatientSearchFeatureList patientSearchFeatureList;
	@Autowired
	PatientSearchFeatureValidatorList patientSearchFeatureValidatorList;
	
	
	private PatientListTO patientList; 
	
	
	@Override
	public PatientListTO patientSearch(PatientFilterTO patientFilter) {
		// TODO Auto-generated method stub
		validate(patientFilter);
		execute(patientFilter);
		return patientList;
	}

	private void execute(PatientFilterTO patientFilter) {
		// TODO Auto-generated method stub
		for(PatientSearchFeature PatientSearchFeature: patientSearchFeatureList.getPatientSearchFeatureList()) {
			patientList = PatientSearchFeature.patientSearch(patientFilter);
		}
		
	}

	private void validate(PatientFilterTO patientFilter) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
		for(PatientSearchFeatureValidator patientSearchFeatureValidator: 
			patientSearchFeatureValidatorList.getPatientSearchFeatureValidatorList()) {
			
			patientSearchFeatureValidator.validate(patientFilter);
		}
			
	
	}

	
}
