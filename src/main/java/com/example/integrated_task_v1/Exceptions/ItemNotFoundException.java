package com.example.integrated_task_v1.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class ItemNotFoundException extends ResponseStatusException {
    public ItemNotFoundException(String massage){
        super(HttpStatus.NOT_FOUND,massage);
    }
}