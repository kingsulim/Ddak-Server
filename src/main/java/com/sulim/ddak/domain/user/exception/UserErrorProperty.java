package com.sulim.ddak.domain.user.exception;

import com.sulim.ddak.shared.error.ErrorProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum UserErrorProperty implements ErrorProperty {
    USER_ERROR_PROPERTY(HttpStatus.CONFLICT, "이미 존재하는 학생입니다.");

    private final HttpStatus status;
    private final String message;
}
