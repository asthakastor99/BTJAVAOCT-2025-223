package com.asthakastor.project.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class ApiError {
private int errorCode;
private String errorMessage;
}