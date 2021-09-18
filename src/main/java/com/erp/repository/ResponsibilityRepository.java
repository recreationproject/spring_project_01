package com.erp.repository.admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.entity.admin.AdminCompany;
import com.erp.entity.admin.AdminResponsibility;

@Repository
public interface ResponsibilityRepository extends JpaRepository <AdminResponsibility,Integer>{

}
