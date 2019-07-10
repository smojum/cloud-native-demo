package com.landsend.demoservice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "data not found in MESSAGE")
public class MessageNotFoundException extends RuntimeException {
}
