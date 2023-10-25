package com.sulim.ddak.presentation.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserRequest {

    private Long ogId;
    private Long zoId;
    private String name;

}
