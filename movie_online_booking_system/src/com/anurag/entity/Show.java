package com.anurag.entity;

public class Show {
	
	private int showId;
	private String showStartTime;
	private String showEndTime;
	private int showSeat ;
	private String showName;
	private String showMovieName;
	private int showScreenId;
	private int showTheatreId;
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public String getShowStartTime() {
		return showStartTime;
	}
	public void setShowStartTime(String showStartTime) {
		this.showStartTime = showStartTime;
	}
	public String getShowEndTime() {
		return showEndTime;
	}
	public void setShowEndTime(String showEndTime) {
		this.showEndTime = showEndTime;
	}
	public int getShowSeat() {
		return showSeat;
	}
	public void setShowSeat(int showSeat) {
		this.showSeat = showSeat;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public String getShowMovieName() {
		return showMovieName;
	}
	public void setShowMovieName(String showMovieName) {
		this.showMovieName = showMovieName;
	}
	public int getShowScreenId() {
		return showScreenId;
	}
	public void setShowScreenId(int showScreenId) {
		this.showScreenId = showScreenId;
	}
	public int getShowTheatreId() {
		return showTheatreId;
	}
	public void setShowTheatreId(int showTheatreId) {
		this.showTheatreId = showTheatreId;
	}
	@Override
	public String toString() {
		return "Show [showId=" + showId + ", showStartTime=" + showStartTime + ", showEndTime=" + showEndTime
				+ ", showSeat=" + showSeat + ", showName=" + showName + ", showMovieName=" + showMovieName
				+ ", showScreenId=" + showScreenId + ", showTheatreId=" + showTheatreId + "]";
	}
	public Show(int showId, String showStartTime, String showEndTime, int showSeat, String showName,
			String showMovieName, int showScreenId, int showTheatreId) {
		super();
		this.showId = showId;
		this.showStartTime = showStartTime;
		this.showEndTime = showEndTime;
		this.showSeat = showSeat;
		this.showName = showName;
		this.showMovieName = showMovieName;
		this.showScreenId = showScreenId;
		this.showTheatreId = showTheatreId;
	}
	
	


}
