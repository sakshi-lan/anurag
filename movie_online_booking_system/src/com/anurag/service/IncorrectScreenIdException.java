package com.anurag.service;

public class IncorrectScreenIdException extends Exception {
	public IncorrectScreenIdException(String error_msg) {
		super(error_msg);
	}
}