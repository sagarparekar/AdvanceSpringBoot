package com.schneider.service;

import com.schneider.model.User;
import com.schneider.model.UserDTO;
import com.schneider.repository.RoleRepository;
import com.schneider.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    private PasswordEncoder passwordEncoder;
    @Autowired
    RoleRepository roleRepository;

    public User save(UserDTO userDTO) {
        User user = new User();
        user.setUserId(userDTO.getId());
        user.setUsername(userDTO.getUsername());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
//        String encodedPassword = passwordEncoder.encode(userDTO.getPassword());
       // user.setPassword(encodedPassword);
        user.setPassword(userDTO.getPassword());
        user.setRole(roleRepository.getByRoleName(userDTO.getRole()));
        user.setCreatedDate(new Date());
        user.setModifiedDate(new Date());
        return userRepository.save(user);
    }

    public User validateUser(String username, String password) {
        return userRepository.validateUser(username,password);
    }

}
