package com.pva.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pva.user.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	 boolean existsByEmployeeId(String employeeId);

	    boolean existsByPhoneNumber(String phoneNumber);

	    boolean existsByBusinessMail(String businessMail);

}
