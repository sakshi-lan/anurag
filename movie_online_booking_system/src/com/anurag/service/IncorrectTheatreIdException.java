package com.anurag.service;

public class IncorrectTheatreIdException extends Exception {
	public IncorrectTheatreIdException(String error_msg) {
		super(error_msg);
	}
}
