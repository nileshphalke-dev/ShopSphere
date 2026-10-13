package com.shopsphere.common.exception;

/** Thrown for business rule violations (insufficient stock, duplicate payment, ...). */
public class BusinessException extends RuntimeException {

    public BusinessException(String message) {
        super(message);
    }
}
