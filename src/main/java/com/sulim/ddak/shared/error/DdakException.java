package com.sulim.ddak.shared.error;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public abstract class DdakException extends RuntimeException {

    private final ErrorProperty errorProperty;

}
