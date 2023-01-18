package com.bilgeadam.exception;

import lombok.Getter;

@Getter
public class ManagerException extends  RuntimeException {

    private final ErrorType errorType;


    public ManagerException(ErrorType errorType) {
        this.errorType = errorType;
    }

    public ManagerException(ErrorType errorType, String customMessage) {
        super(customMessage);
        this.errorType = errorType;
    }
}
