package com.jean.hexabank.exception;

public class ContaNotFoundException extends RuntimeException{
    public ContaNotFoundException(String message) {
        super(message);
    }
}
