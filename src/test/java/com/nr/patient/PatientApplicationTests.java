package com.nr.patient;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nr.patient.service.Patient;
import com.nr.patient.to.PatientFilterTO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientApplicationTests {
	@Autowired 
	Patient patient;

	@Test
	public void contextLoads() {
		PatientFilterTO patientFilter = new PatientFilterTO();
		patientFilter.setCommand("Pin");
		patient.patientSearch(patientFilter);
	}

}
