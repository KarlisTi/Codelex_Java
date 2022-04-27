package io.codelex.Exceptions.practice.Exercise4;

public class NonPositiveNumberException extends Exception {

    public NonPositiveNumberException() {
        super("Invalid number. It should be a positive number");
    }

    public NonPositiveNumberException(String message) {
        super(message);
    }
}


