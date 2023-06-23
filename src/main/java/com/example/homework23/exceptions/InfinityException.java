package com.example.homework23.exceptions;

public class InfinityException extends IllegalArgumentException{
    public InfinityException() {
    }

    public InfinityException(String s) {
        super(s);
    }

    public InfinityException(String message, Throwable cause) {
        super(message, cause);
    }
}
