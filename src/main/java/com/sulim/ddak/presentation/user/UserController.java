package com.sulim.ddak.presentation.user;

import com.sulim.ddak.application.user.CreatUserUseCase;
import com.sulim.ddak.presentation.user.dto.CreateUserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/user")
@RestController
public class UserController {

    private final CreatUserUseCase creatUserUseCase;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestBody @Validated CreateUserRequest request) {
        creatUserUseCase.execute(request);
    }



}
