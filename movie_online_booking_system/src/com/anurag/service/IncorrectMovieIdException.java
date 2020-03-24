package com.anurag.service;

public class IncorrectMovieIdException extends Exception {
	public IncorrectMovieIdException(String error_msg) {
		super(error_msg);
	}
}
