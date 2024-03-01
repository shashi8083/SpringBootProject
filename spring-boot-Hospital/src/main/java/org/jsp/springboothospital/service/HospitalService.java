package org.jsp.springboothospital.service;

import org.jsp.springboothospital.dao.HospitalDao;
import org.jsp.springboothospital.dto.Hospital;
import org.jsp.springboothospital.dto.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class HospitalService {
	@Autowired
	private HospitalDao hospitalDao;
	
//	public ResponseEntity<ResponseStructure<Hospital>> saveHospital(Hospital hospital,int admin_id){
//		
//	}
}
