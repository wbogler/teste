package com.aula.testesautomatizados.controller.auth;

import com.aula.testesautomatizados.service.LoginService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest) {
        if (loginRequest == null) {
            throw new IllegalArgumentException("Login request cannot be null");
        }
        return loginService.login(loginRequest);
    }
}
