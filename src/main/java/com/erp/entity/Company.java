package com.erp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADMIN_COMPANY")
public class Company {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COMPANY_ID")
	private Integer id;	
	@Column(name = "COMPANY_NAME")
	private String companyName;	
	@Column(name = "COMPANY_SHORTNAME")
	private String companyShortName;	
	@Column(name = "COMPANY_DESCRIPTION")
	private String companyDescription;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyShortName() {
		return companyShortName;
	}
	public void setCompanyShortName(String companyShortName) {
		this.companyShortName = companyShortName;
	}
	public String getCompanyDescription() {
		return companyDescription;
	}
	public void setCompanyDescription(String companyDescription) {
		this.companyDescription = companyDescription;
	}
	@Override
	public String toString() {
		return "AdminCompany [id=" + id + ", companyName=" + companyName + ", companyShortName=" + companyShortName
				+ ", companyDescription=" + companyDescription + "]";
	}
	
	
	
	
}
