package com.erp.repository.admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.entity.admin.AdminBranch;

@Repository
public interface BranchRepository extends JpaRepository <AdminBranch,Integer> {

}
