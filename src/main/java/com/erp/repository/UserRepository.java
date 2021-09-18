package com.erp.repository.admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.entity.admin.AdminUser;

@Repository
public interface UserRepository extends JpaRepository <AdminUser,Integer> {
	
	
}
