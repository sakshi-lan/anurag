package com.anurag.service;

public class IncorrectContactNumberException extends Exception {
	public IncorrectContactNumberException(String error_msg) {
		super(error_msg);
	}
}
