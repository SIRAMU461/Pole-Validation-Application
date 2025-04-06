package com.pva.user.dto;

import com.pva.user.enums.CompanyName;
import com.pva.user.enums.Role;
import com.pva.user.enums.Status;

import jakarta.validation.constraints.*;

import java.sql.Timestamp;

public class UserDTO {

    private Long userId;

    @NotBlank(message = "EmployeeID cannot be empty")
    @Pattern(regexp = "^[0-9]{8}$", message = "Employee ID must be exactly 8 digits and numeric only")
    private String employeeId;

    @NotBlank(message = "First Name cannot be empty")
    @Size(min = 2, max = 50, message = "First Name must be between 2 and 50 characters")
    private String firstName;

    @NotBlank(message = "Last Name cannot be empty")
    @Size(min = 2, max = 50, message = "Last Name must be between 2 and 50 characters")
    private String lastName;

    @NotBlank(message = "Business Email cannot be empty")
    @Email(message = "Invalid email format")
    private String businessMail;

    @NotBlank(message = "Phone Number cannot be empty")
    @Pattern(regexp = "^[0-9]{10}$", message = "Phone Number must be exactly 10 digits")
    private String phoneNumber;

    @NotBlank(message = "Password cannot be empty")
    @Pattern(
        regexp = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
        message = "Password must be at least 8 characters long, contain one uppercase letter, one digit, and one special character"
    )
    private String password;

    @NotNull(message = "Role cannot be null")
    private Role role;

    @NotNull(message = "Company Name cannot be null")
    private CompanyName companyName;

    @NotNull(message = "Status cannot be null")
    private Status status = Status.ACTIVE;

    private Timestamp createdAt;
    private Timestamp updatedAt;

    public UserDTO() {
        super();
    }

    public UserDTO(Long userId,
                   String employeeId,
                   String firstName,
                   String lastName,
                   String businessMail,
                   String phoneNumber,
                   String password,
                   Role role,
                   CompanyName companyName,
                   Status status,
                   Timestamp createdAt,
                   Timestamp updatedAt) {
        this.userId = userId;
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.businessMail = businessMail;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.role = role;
        this.companyName = companyName;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "UserDTO [userId=" + userId +
                ", employeeId=" + employeeId +
                ", firstName=" + firstName +
                ", lastName=" + lastName +
                ", businessMail=" + businessMail +
                ", phoneNumber=" + phoneNumber +
                ", password=****" +
                ", role=" + role +
                ", companyName=" + companyName +
                ", status=" + status +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt + "]";
    }
}
