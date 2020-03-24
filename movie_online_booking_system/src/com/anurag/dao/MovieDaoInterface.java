package com.anurag.dao;

import java.util.HashMap;

import com.anurag.entity.Movie;
import com.anurag.entity.Screen;
import com.anurag.entity.Show;
import com.anurag.entity.Theatre;

interface MovieDaoInterface {

	boolean addMovie(Movie mov);

	HashMap<Integer, Movie> display();

	Movie delete(int mid1);

	boolean addTheatre(Theatre th);

	HashMap<Integer, Theatre> display1();

	Theatre delete1(int mth1);

	boolean addShow(Show s);

	HashMap<Integer, Show> display2();

	Show delete2(int sid);

	boolean addScreen(Screen scr);

	HashMap<Integer, Screen> display3();

	Screen delete3(int scid);

}
