package com.pva.user.dto;

import com.pva.user.enums.CompanyName;
import com.pva.user.enums.Role;
import com.pva.user.enums.Status;

import jakarta.validation.constraints.*;

public class UserDTO {

    private Long userId;

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

    @NotNull(message = "Role cannot be null")
    private Role role;

    @NotNull(message = "Company Name cannot be null")
    private CompanyName companyName;

    @NotNull(message = "Status cannot be null")
    private Status status = Status.ACTIVE;
    
    
    
    
    
    
    
    
    
    
}
