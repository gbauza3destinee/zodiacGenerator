package com.zodiac.Zodiac.Exception;

public class ZodiacNotFoundException extends RuntimeException {

    public ZodiacNotFoundException(String message) {
        super(message);
    }

    public ZodiacNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ZodiacNotFoundException(Throwable cause) {
        super(cause);
    }
}
