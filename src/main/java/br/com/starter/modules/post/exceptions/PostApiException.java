package br.com.starter.modules.post.exceptions;

import org.springframework.http.HttpStatus;

public class PostApiException extends RuntimeException {

    private HttpStatus status;
    private String message;

    public PostApiException(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public PostApiException(String message, HttpStatus status, String message2) {
        super(message);
        this.status = status;
        message = message2;
    }

    public PostApiException(Throwable cause, HttpStatus status, String message) {
        super(cause);
        this.status = status;
        this.message = message;
    }

    public PostApiException(String message, Throwable cause, HttpStatus status, String message2) {
        super(message, cause);
        this.status = status;
        message = message2;
    }

    public PostApiException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace,
            HttpStatus status, String message2) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.status = status;
        message = message2;
    }
}
