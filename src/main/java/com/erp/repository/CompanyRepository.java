package com.erp.repository.admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.entity.admin.AdminCompany;


@Repository
public interface CompanyRepository extends JpaRepository <AdminCompany,Integer>{

}
