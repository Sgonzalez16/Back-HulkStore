package com.msvc.store.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException() {
        super("No se ha encontrado!!");
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
