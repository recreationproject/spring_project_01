package com.erp.entity.admin;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="ADMIN_RESPONSIBILITY")
public class AdminResponsibility {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RESPO_ID")
	private Integer id;	
	@Column(name = "RESPO_NAME")
	private String respoName;	
	@Column(name = "RESPO_DESCRIPTION")
	private String respoDescription;
	@Column(name = "BRANCH_ID")
	private Integer branchId;
	@Column(name = "COMPANY_ID")
	private Integer companyId;
	
	@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "responsibility", fetch = FetchType.LAZY)
	private Set<AdminUser> users = new HashSet<>();
	

	public Set<AdminUser> getUsers() {
		return users;
	}
	public void setUsers(Set<AdminUser> users) {
		this.users = users;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRespoName() {
		return respoName;
	}
	public void setRespoName(String respoName) {
		this.respoName = respoName;
	}
	public String getRespoDescription() {
		return respoDescription;
	}
	public void setRespoDescription(String respoDescription) {
		this.respoDescription = respoDescription;
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
