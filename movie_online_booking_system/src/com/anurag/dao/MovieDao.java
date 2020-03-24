package com.anurag.dao;

import java.util.HashMap;

import com.anurag.entity.Movie;
import com.anurag.entity.Register;
import com.anurag.entity.Screen;
import com.anurag.entity.Show;
import com.anurag.entity.Theatre;

public class MovieDao implements MovieDaoInterface {
	HashMap<Integer,Movie> hm=new HashMap<Integer,Movie>();
	HashMap<Integer,Theatre> hm1 = new HashMap<Integer, Theatre>();
	HashMap<Integer,Show> hm2 = new HashMap<Integer, Show>();
	HashMap<Integer,Screen>hm3=new HashMap<Integer, Screen>();
	HashMap<Integer,Register>hm4=new HashMap<Integer, Register>();
	
	@Override
	public boolean addMovie(Movie mov) {
		
		hm.put(mov.getMovieId(), mov);
		Movie m1=hm.get(mov.getMovieId());
		if(m1==null){
			return false;
		}else{
		return true;
	}
	}

	@Override
	public HashMap<Integer, Movie> display() {
		return hm;
	}

	@Override
	public Movie delete(int mid1) {
		return hm.remove(mid1);
	}
	
	@Override
	public boolean addTheatre(Theatre th) {
		
		hm1.put(th.getTheatreId(), th);
		Theatre t1=hm1.get(th.getTheatreId());
		if(t1==null) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public HashMap<Integer, Theatre> display1() {
		return hm1;
	}

	@Override
	public Theatre delete1(int mth1) {
		return hm1.remove(mth1);
	}

	@Override
	public boolean addShow(Show s) {
		hm2.put(s.getShowId(), s);
		Show s1=hm2.get(s.getShowId());
		if(s1==null) {
		return false;
	}else {
		return true;
	}
}

	@Override
	public HashMap<Integer, Show> display2() {
		return hm2;
	}

	@Override
	public Show delete2(int sid) {
		
		return hm2.remove(sid);
	}

	@Override
	public boolean addScreen(Screen scr) {
		hm3.put(scr.getScreenId(),scr);
		Screen scr1=hm3.get(scr.getScreenId());
		if(scr1==null) {
		return false;
		}else {
			return true;
		}
	}

	@Override
	public HashMap<Integer, Screen> display3() {
	
		return hm3;
	}

	@Override
	public Screen delete3(int scid) {
	
		return hm3.remove(scid);
	}

	public boolean adduser(Register reg) {
		
		
		Register reg1=hm4.get(reg.getName());
		if(reg1==null) {
		}else {
			return true;
		}
		return false;
	}
	}
