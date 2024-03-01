package org.jsp.springboothospital.repository;

import org.jsp.springboothospital.dto.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital,Integer> {

}
