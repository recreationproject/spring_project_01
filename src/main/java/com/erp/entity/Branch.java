package com.erp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ADMIN_BRANCH")
public class Branch {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BRANCH_ID")
	private Integer id;	
	@Column(name = "BRANCH_NAME")
	private String branchName;	
	@Column(name = "BRANCH_SHORTNAME")
	private String branchShortName;	
	@Column(name = "BRANCH_DESCRIPTION")
	private String branchDescription;
	@Column(name = "COMPANY_ID")
	private Integer companyId;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchShortName() {
		return branchShortName;
	}
	public void setBranchShortName(String branchShortName) {
		this.branchShortName = branchShortName;
	}
	public String getBranchDescription() {
		return branchDescription;
	}
	public void setBranchDescription(String branchDescription) {
		this.branchDescription = branchDescription;
	}
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	
	
}
