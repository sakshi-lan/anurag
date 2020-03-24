package com.anurag.service;

public class IncorrectShowIdException extends Exception {
	public IncorrectShowIdException(String error_msg) {
		super(error_msg);
	}
}

