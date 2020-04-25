package com.lalit.security.jwtsecurity.controller;


import com.lalit.security.jwtsecurity.model.UserDetailModel;
import com.lalit.security.jwtsecurity.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecureAppController {

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private AuthenticationManager authenticationManager;


    @GetMapping("/")
    public String access(){
        return "YaY...!!!! You got an access... :)";
    }

    @PostMapping("/getToken")
    public String getToken(@RequestBody UserDetailModel userDetailModel){
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(userDetailModel.getUserName(), userDetailModel.getPassword())
        );
        return jwtUtil.generateToken(userDetailModel.getUserName());
    }
}
