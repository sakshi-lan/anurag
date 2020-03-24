package com.anurag.dao;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.Test;

import com.anurag.entity.Movie;
import com.anurag.entity.Show;
import com.anurag.entity.Theatre;
import com.anurag.service.IncorrectMovieIdException;
import com.anurag.service.IncorrectShowIdException;
import com.anurag.service.IncorrectTheatreIdException;
import com.anurag.service.MovieService;

@SuppressWarnings("unused")
public class Testing {

		@Test
		public void check() throws SQLException, IncorrectTheatreIdException, IncorrectShowIdException, IncorrectMovieIdException {
			@SuppressWarnings("unused")
			MovieDao dao = new MovieDao();
			
			Theatre o=new Theatre(22,"imax", "delhi", "roja", "a", "ramya","1987613191");
			boolean result = dao.addTheatre(o);
			
			Movie m=new Movie(41,"hum tum","romantic","subhash","3 hrs","hindi","14 feb");
			boolean result1=dao.addMovie(m);
			
			Show sh=new Show(76,"3:40","5:40",13,"morning show","panipat",55,24);
			boolean result2=dao.addShow(sh);
			
			boolean k=true;
			System.out.println(result);
			assertEquals(result,k);
			
			System.out.println(result1);
			assertEquals(result1,k);
			
			System.out.println(result2);
			assertEquals(result2,k);
			
			
		}
	}
