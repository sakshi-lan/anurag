package com.anurag.entity;

import com.anurag.service.IncorrectTheatreIdException;
import com.anurag.service.MovieService;

public class Theatre {
	
	MovieService service=new MovieService();
	
	private int theatreId;
	private String theatreName;
	private String theatreCity;
	private String theatreMovie;
	private String theatreScreen;
	private String managerName;
	private String contact;
	public int getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public String getTheatreCity() {
		return theatreCity;
	}
	public void setTheatreCity(String theatreCity) {
		this.theatreCity = theatreCity;
	}
	public String getTheatreMovie() {
		return theatreMovie;
	}
	public void setTheatreMovie(String theatreMovie) {
		this.theatreMovie = theatreMovie;
	}
	public String getTheatreScreen() {
		return theatreScreen;
	}
	public void setTheatreScreen(String theatreScreen) {
		this.theatreScreen = theatreScreen;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Theatre [theatreId=" + theatreId + ", theatreName=" + theatreName + ", theatreCity=" + theatreCity
				+ ", theatreMovie=" + theatreMovie + ", theatreScreen=" + theatreScreen + ", managerName=" + managerName
				+ ", contact=" + contact + "]";
	}
	public Theatre(int theatreId, String theatreName, String theatreCity, String theatreMovie, String theatreScreen,
			String managerName, String contact) throws IncorrectTheatreIdException {
		super();
		this.theatreId = theatreId;
		service.theatreId_Validity(theatreId);
		this.theatreName = theatreName;
		this.theatreCity = theatreCity;
		this.theatreMovie = theatreMovie;
		this.theatreScreen = theatreScreen;
		this.managerName = managerName;
		this.contact = contact;
	}
}
