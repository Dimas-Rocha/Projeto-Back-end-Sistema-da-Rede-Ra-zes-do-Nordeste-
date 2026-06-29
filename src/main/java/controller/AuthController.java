package controller;

import dto.LoginRequest;
import dto.LoginResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import security.AuthService;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor

public class AuthController {


    private final AuthService service;



    @PostMapping("/login")
    public LoginResponse login(
            @RequestBody LoginRequest request){


        return service.login(request);


    }


}
