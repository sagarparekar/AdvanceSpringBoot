package com.schneider.controller;

import com.schneider.jwt.JwtTokenUtil;
import com.schneider.model.AuthRequest;
import com.schneider.model.AuthResponse;
import com.schneider.model.User;
import com.schneider.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private static final Logger log = LoggerFactory.getLogger(AuthController.class);

    @Autowired
    AuthenticationManager authManager;
    @Autowired
    JwtTokenUtil jwtUtil;
    @Autowired
    UserService service;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AuthRequest request) {
        try {
//            Authentication authentication = authManager.authenticate(
//                    new UsernamePasswordAuthenticationToken(
//                            request.getUsername(), request.getPassword())
//            );

            User user = service.validateUser(request.getUsername(), request.getPassword());
            String accessToken = jwtUtil.generateAccessToken(user);
            log.info("Token generated : " + accessToken);
            AuthResponse response = new AuthResponse(user.getUsername(), accessToken, user.getRole().getRoleName());
            return ResponseEntity.ok().body(response);

        } catch (BadCredentialsException ex) {
            log.warn("Username or passward is wrong");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }

}
