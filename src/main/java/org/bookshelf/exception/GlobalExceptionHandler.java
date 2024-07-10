package org.bookshelf.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.ResponseEntity.status;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BookException.class)
    public ResponseEntity<ErrorResponse> handleBookException(final BookException exception){
        log.error("error on book occured");
        return status(INTERNAL_SERVER_ERROR).body(new ErrorResponse(exception.getMessage(),INTERNAL_SERVER_ERROR));
    }

    record ErrorResponse(String error, HttpStatusCode httpStatusCode){}
}
