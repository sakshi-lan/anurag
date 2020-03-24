package com.anurag.ui;

import java.util.HashMap;

import java.util.Scanner;
import com.anurag.entity.Movie;
import com.anurag.entity.Register;
import com.anurag.entity.Screen;
import com.anurag.entity.Show;
import com.anurag.entity.Theatre;
import com.anurag.service.IncorrectContactNumberException;
import com.anurag.service.IncorrectMovieIdException;
import com.anurag.service.IncorrectScreenIdException;
import com.anurag.service.IncorrectShowIdException;
import com.anurag.service.IncorrectTheatreIdException;
import com.anurag.service.MovieService;

public class Main_Ui {

	static MovieService service=new MovieService();
	static MovieService service1=new MovieService();
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("1.Add Movie");
			System.out.println("2.Delete Movie");
			System.out.println("3.Add Theatre");
			System.out.println("4.Delete Theatre");
			System.out.println("5.Add Show");
			System.out.println("6.Delete Show");
			System.out.println("7.Add Screen");
			System.out.println("8.Delete Screen");
			System.out.println("9.Registeration");
			System.out.println("10.Exit");
			int ch=sc.nextInt();

			switch(ch){
			case 1:{
				try {
				System.out.println("PLEASE FILL IN THE FOLLOWING DETAILS TO ADD MOVIE");
				System.out.println("enter movie id");
				int movie_id=sc.nextInt();
				System.out.println("enter movie name");
				String movie_name=sc.next();
				System.out.println("enter movie genre");
				String movie_genre=sc.next();
				System.out.println("enter movie director");
				String movie_director=sc.next();
				System.out.println("enter the length of the movie");
				String movie_length=sc.next();
				System.out.println("enter language");
				String movie_language=sc.next();
				System.out.println("enter movie release date");
				String movie_release_date=sc.next();
				service.movie_Validity(movie_id);

				Movie mov=new Movie(movie_id, movie_name, movie_genre, movie_director, movie_length, movie_language, movie_release_date);
				boolean res=service.addMovie(mov);
				if(res==true){
					System.out.println("your movie is added..!");
				}}
				catch (IncorrectMovieIdException e)
				{
                    System.out.println("please enter a valid movie id between the range (40-50)");
                    }}
				
			break;
			
			case 2:
				HashMap<Integer,Movie> h=service.display();
				if(h==null){
					System.out.println(" no records");
				}else{
					System.out.println(h);
				}
				System.out.println("enter movie id which you want to delete");
				int mid1=sc.nextInt();
				Movie resl=service.delete(mid1);
				if(resl==null){
					System.out.println("deleted");
				}
			break;
			case 3:{
				try {
				System.out.println("PLEASE FILL IN THE FOLLOWING DETAILS TO ADD THEATRE");
				System.out.println("enter theatre id");
				int theatre_id=sc.nextInt();
				System.out.println("enter theatre name");
				String theatre_name=sc.next();
				System.out.println("enter theatre city");
				String theatre_city=sc.next();
				System.out.println("enter the movie");
				String movie=sc.next();
				System.out.println("enter the screen");
				String theatre_screen=sc.next();
				System.out.println("enter manager name");
				String manager_name=sc.next();
				System.out.println("enter manager contact number");
				String manager_contact=sc.next();
				service.theatreId_Validity(theatre_id);
				service.contact_Number_Validity(manager_contact);

				Theatre th=new Theatre(theatre_id, theatre_name, theatre_city, movie, theatre_screen, manager_name, manager_contact);
				boolean res1=service.addTheatre(th);
				if(res1==true){
					System.out.println("your theatre is added..!");
				}}
				catch (IncorrectContactNumberException e)
				{
                    System.out.println("Mobile number is not a correct mobile number");
                    }
				catch(IncorrectTheatreIdException e) 
				{
					System.out.println("please enter a valid theatre id between the range (20-30)");
				}}
			break;
			
			case 4: 
				HashMap<Integer,Theatre> h1=service.display1();
				if(h1==null){
					System.out.println(" no records");
				}else{
					System.out.println(h1);
				}
				System.out.println("enter theatre id which you want to delete");
				int mth1=sc.nextInt();
				Theatre resl1=service.delete1(mth1);
				if(resl1==null){
					System.out.println("deleted");

				}
			break;
		case 5:{
			try {
			System.out.println("PLEASE FILL IN THE FOLLOWING DETAILS TO ADD SHOW");
			System.out.println("enter show id");
			int show_id=sc.nextInt();
			System.out.println("enter show start time");
			String show_start_time=sc.next();
			System.out.println("enter show end time");
			String show_end_time=sc.next();
			System.out.println("enter number of seats");
			int seats=sc.nextInt();
			System.out.println("enter the show name");
			String show_name=sc.next();
			System.out.println("enter movie ");
			String movies=sc.next();
			System.out.println("enter screen id");
			int screen=sc.nextInt();
			System.out.println("enter theatre id");
			int theatre_id=sc.nextInt();
			service.show_Validate(show_id);
			service.theatreId_Validity(theatre_id);
			
			Show s=new Show(show_id, show_start_time, show_end_time, seats, show_name, movies, screen, theatre_id);
			boolean res11=service.addShow(s);
			if(res11==true){
				System.out.println("your show is added..!");
			}}
			catch(IncorrectShowIdException e) 
			{
				System.out.println("please enter a valid theatre id between the range (70-80)");
			}
			catch(IncorrectTheatreIdException e) 
			{
				System.out.println("please enter a valid theatre id between the range (20-30)");
			}}
				
		break;
		case 6: 
			HashMap<Integer,Show> h2=service.display2();
			if(h2==null){
				System.out.println(" no records");
			}else{
				System.out.println(h2);
			}
			System.out.println("enter show id which you want to delete");
			int sid=sc.nextInt();
			Show resl11=service.delete2(sid);
			if(resl11==null){
				System.out.println("deleted");
			}
			break;
		case 7:{
			try {
			System.out.println("PLEASE FILL IN THE FOLLOWING DETAILS TO ADD SCREEN");
			System.out.println("enter screen id");
			int screen_id=sc.nextInt();
			System.out.println("enter theatre id");
			int theatre_id2=sc.nextInt();
			System.out.println("enter screen name");
			String screen_name=sc.next();
			System.out.println("enter show name");
			String show_name1=sc.next();
			System.out.println("enter the number of rows");
			int no_of_rows=sc.nextInt();
			System.out.println("enter the number of columns");
			int no_of_columns=sc.nextInt();
			service.screenid_Validity(screen_id);
			
			Screen scr=new Screen(screen_id, theatre_id2, screen_name, show_name1, no_of_rows, no_of_columns);
			boolean res12=service.addScreen(scr);
			if(res12==true){
				System.out.println("your screen is added..!");
			}}
			catch(IncorrectScreenIdException e) 
			{
				System.out.println("please enter a valid screen id between the range (120-140)");
			}}
			break;
		case 8: 
			HashMap<Integer,Screen> h3=service.display3();
			if(h3==null){
				System.out.println(" no records");
			}else{
				System.out.println(h3);
			}
			System.out.println("enter screen id which you want to delete");
			int scid=sc.nextInt();
			Screen resl13=service.delete3(scid);
			if(resl13==null){
				System.out.println("deleted");
			}
			break;
		case 9:{
			System.out.println("please enter the following details to register");
			System.out.println("enter your name");
			String name=sc.next();
			System.out.println("enter password");
			String password=sc.next();
			System.out.println("enter your phone number");
			String num=sc.next();
			
			Register reg=new Register(name,password,num);
			boolean res13=service.adduser(reg);
			if(res13==true){
				System.out.println("your user is added...!");
			}
			
		}
		break;
		case 10:
			
			System.out.println("thank you!! have a good day");
			System.exit(0);
			
		
		}
	}
	}
	}

