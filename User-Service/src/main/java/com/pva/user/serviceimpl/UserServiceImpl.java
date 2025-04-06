package com.pva.user.serviceimpl;

import com.pva.user.dto.UserDTO;
import com.pva.user.entity.User;
import com.pva.user.repository.UserRepository;
import com.pva.user.service.UserService;
import com.pva.user.vaildation.UserValidator;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserValidator userValidator;

    public UserServiceImpl(UserRepository userRepository, UserValidator userValidator) {
        this.userRepository = userRepository;
        this.userValidator = userValidator;
    }
     
    
    //Create Use-Method 
    @Override
    public UserDTO createUser(UserDTO userDTO) {
        userValidator.validate(userDTO);

        User user = new User();
        user.setEmployeeId(userDTO.getEmployeeId());
        user.setFristName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setBusinessMail(userDTO.getBusinessMail());
        user.setPhoneNumber(userDTO.getPhoneNumber());
        user.setPassword(userDTO.getPassword()); 
        user.setRole(userDTO.getRole());
        user.setCompanyName(userDTO.getCompanyName());
        user.setStatus(userDTO.getStatus());

        Timestamp now = Timestamp.from(Instant.now());
        user.setCreatedAt(now);
        user.setUpdateAt(now);

        User savedUser = userRepository.save(user);

        return new UserDTO(
            savedUser.getUserId(),
            savedUser.getEmployeeId(),
            savedUser.getFristName(),
            savedUser.getLastName(),
            savedUser.getBusinessMail(),
            savedUser.getPhoneNumber(),
            savedUser.getPassword(), 
            savedUser.getRole(),
            savedUser.getCompanyName(),
            savedUser.getStatus(),
            savedUser.getCreatedAt(),
            savedUser.getUpdateAt()
        );
    }
    
    // UserLogin-Method
}
