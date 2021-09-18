package com.erp.entity.admin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="ADMIN_USER")
public class AdminUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private Integer id;	
	@Column(name = "USER_NAME")
	private String userName;	
	@Column(name = "USER_LOGINNAME")
	private String userLoginName;	
	@Column(name = "USER_PASSWORD")
	private String userPassword;
	@Column(name="BRANCH_ID")
	private Integer branchId;
	@Column(name="COMPANY_ID")
	private Integer companyId;

	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name = "RESPONSIBILITY_ID", nullable = false)
	private AdminResponsibility responsibility;
	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserLoginName() {
		return userLoginName;
	}
	public void setUserLoginName(String userLoginName) {
		this.userLoginName = userLoginName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public AdminResponsibility getResponsibility() {
		return responsibility;
	}
	public void setResponsibility(AdminResponsibility responsibility) {
		this.responsibility = responsibility;
	}
	public Integer getBranchId() {
		return branchId;
	}
	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}


	
}
