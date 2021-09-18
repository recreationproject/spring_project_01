package com.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.entity.Company;
import com.erp.entity.Responsibility;

@Repository
public interface ResponsibilityRepository extends JpaRepository <Responsibility,Integer>{

}
