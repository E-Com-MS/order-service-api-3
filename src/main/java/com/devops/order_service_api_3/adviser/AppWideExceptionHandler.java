package com.devops.order_service_api_3.adviser;

import com.devops.order_service_api_3.exception.EntryNotFoundException;
import com.devops.order_service_api_3.util.StandardResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppWideExceptionHandler {
    @ExceptionHandler( EntryNotFoundException.class )
    public ResponseEntity<StandardResponse> handleEntryNotFoundException(EntryNotFoundException entryNotFoundException){
        return new ResponseEntity<>(
                new StandardResponse(404,entryNotFoundException.getMessage(),entryNotFoundException),
                HttpStatus.NOT_FOUND
        );
    }
}
