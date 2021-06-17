package com.kyriba.sample.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class APIExceptionHandler {


    @ExceptionHandler(value = BadRequestException.class)
    public ResponseEntity<BadRequestException> getErrorResponse(BadRequestException e) {
        return new ResponseEntity<>(e, HttpStatus.BAD_REQUEST);
    }
}
