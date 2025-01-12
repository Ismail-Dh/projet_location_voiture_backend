package com.example.demo.dto;

public class ExeceptionDto {
	private String message;

    public ExeceptionDto(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
