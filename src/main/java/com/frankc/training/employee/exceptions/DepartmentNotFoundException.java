package com.frankc.training.employee.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exception for when Employee not found.
 * 
 * Sets HTTP status code to 404 with sensible message.
 */
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Department Not Found")
public class DepartmentNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 5614347460510295487L;
}
