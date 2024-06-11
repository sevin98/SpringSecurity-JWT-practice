package com.example.springjwt.service;

import com.example.springjwt.dto.JoinDTO;
import com.example.springjwt.entity.UserEntity;
import com.example.springjwt.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class JoinService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;


   public JoinService(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
       this.userRepository = userRepository;
       this.bCryptPasswordEncoder = new BCryptPasswordEncoder();
   }

    public void joinProcess(JoinDTO joinDTO){
        String username = joinDTO.getUsername();
        String password = joinDTO.getPassword();

        Boolean isExist = userRepository.existsByUsername(username);

        if(isExist) return;

        UserEntity user = new UserEntity();

        user.setUsername(username);
        user.setPassword(bCryptPasswordEncoder.encode(password));
        user.setRole("ROLE_ADMIN");

        userRepository.save(user);
    }

}
