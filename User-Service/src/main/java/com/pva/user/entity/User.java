package com.pva.user.entity;

import java.security.Timestamp;

import com.pva.user.enums.CompanyName;
import com.pva.user.enums.Role;
import com.pva.user.enums.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	private Long userId;
	
	private String fristName;
	
	private String lastName;
	
	private String businessMail;
	
	private String phoneNumber;
	
	private Role role;
	
	private CompanyName companyName;
	
	private Timestamp createdAt;
	
	private Timestamp updateAt;
	
	private Status status;

	public User() {
		super();
	}

	public User(Long userId, String fristName, String lastName, String businessMail, String phoneNumber, Role role,
			CompanyName companyName, Timestamp createdAt, Timestamp updateAt, Status status) {
		super();
		this.userId = userId;
		this.fristName = fristName;
		this.lastName = lastName;
		this.businessMail = businessMail;
		this.phoneNumber = phoneNumber;
		this.role = role;
		this.companyName = companyName;
		this.createdAt = createdAt;
		this.updateAt = updateAt;
		this.status = status;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFristName() {
		return fristName;
	}

	public void setFristName(String fristName) {
		this.fristName = fristName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBusinessMail() {
		return businessMail;
	}

	public void setBusinessMail(String businessMail) {
		this.businessMail = businessMail;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public CompanyName getCompanyName() {
		return companyName;
	}

	public void setCompanyName(CompanyName companyName) {
		this.companyName = companyName;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Timestamp getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Timestamp updateAt) {
		this.updateAt = updateAt;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", fristName=" + fristName + ", lastName=" + lastName + ", businessMail="
				+ businessMail + ", phoneNumber=" + phoneNumber + ", role=" + role + ", companyName=" + companyName
				+ ", createdAt=" + createdAt + ", updateAt=" + updateAt + ", status=" + status + "]";
	}
	
}
