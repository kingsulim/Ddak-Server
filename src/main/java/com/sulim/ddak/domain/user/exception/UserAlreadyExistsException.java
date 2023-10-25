package com.sulim.ddak.domain.user.exception;

import com.sulim.ddak.shared.error.DdakException;

public class UserAlreadyExistsException extends DdakException {

    public UserAlreadyExistsException(){
        super(UserErrorProperty.USER_ERROR_PROPERTY);
    }

}
