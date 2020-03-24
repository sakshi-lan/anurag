package com.anurag.service;

import java.util.HashMap;

import com.anurag.dao.MovieDao;
import com.anurag.entity.Movie;
import com.anurag.entity.Register;
import com.anurag.entity.Screen;
import com.anurag.entity.Show;
import com.anurag.entity.Theatre;


public class MovieService implements MovieServiceinterface {
	MovieDao dao=new MovieDao();

	public boolean addMovie(Movie mov) {

		return dao.addMovie(mov);
	}

	public HashMap<Integer, Movie> display() {

		return dao.display();
	}
	public HashMap<Integer, Theatre> display1() {

		return dao.display1();
	}

	public Movie delete(int mid1) {

		return dao.delete(mid1);
	}

	public boolean addTheatre(Theatre th) {

		return dao.addTheatre(th);
	}

	public Theatre delete1(int mth1) {
		return dao.delete1(mth1);
	}

	public boolean addShow(Show s) {

		return dao.addShow(s);
	}

	public HashMap<Integer, Show> display2() {

		return dao.display2() ;
	}

	public Show delete2(int sid) {

		return dao.delete2(sid);
	}

	public boolean addScreen(Screen scr) {

		return dao.addScreen(scr);
	}

	public HashMap<Integer, Screen> display3() {

		return dao.display3();
	}

	public Screen delete3(int scid) {

		return dao.delete3(scid);
	}

	// Checking mobile number
	public void contact_Number_Validity(String manager_contact) throws IncorrectContactNumberException {

		if(manager_contact.length() == 10)
		{
			char arr[]=manager_contact.toCharArray();
			String first_numeric_digit = String.valueOf(arr[0]);
			int i = Integer.parseInt(first_numeric_digit);
			if(i>5 && i<10){

			}
			else{
				throw new IncorrectContactNumberException("incorrect mobile number");
			}
		}
	}
	//    Checking theatre id (20-30)
	public void theatreId_Validity(int theatre_id) throws IncorrectTheatreIdException {
		if(theatre_id<20 || theatre_id>30) {
			throw new IncorrectTheatreIdException("please enter a valid theatre id netween the range (20-30)");
		}
	}

	public void movie_Validity(int movie_id) throws IncorrectMovieIdException {
		if(movie_id<40 ||movie_id>50) {
			throw new IncorrectMovieIdException("please enter a valid movie id between the range(40-50)");
		}
		
	}

	public void show_Validate(int show_id) throws IncorrectShowIdException {
	
		if(show_id<70 ||show_id>80) {
			throw new IncorrectShowIdException("please enter a valid show id between the range(70-80)");
		}
	}

	public void screenid_Validity(int screen_id) throws IncorrectScreenIdException {
		
		if(screen_id<120 ||screen_id>140) {
			throw new IncorrectScreenIdException("please enter a valid screen id between the range(120-140)");
		}
	}

	public boolean adduser(Register reg) {
           
		return dao.adduser(reg);
	}

}
