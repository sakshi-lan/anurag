package com.anurag.entity;

public class Screen {
	
	private int screenId ;
	private int theatreid ;
	private String screenName ;
	private String show;
	private int no_of_rows;
	private int no_of_column;
	public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
	public int getTheatreid() {
		return theatreid;
	}
	public void setTheatreid(int theatreid) {
		this.theatreid = theatreid;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public String getShow() {
		return show;
	}
	public void setShow(String show) {
		this.show = show;
	}
	public int getNo_of_rows() {
		return no_of_rows;
	}
	public void setNo_of_rows(int no_of_rows) {
		this.no_of_rows = no_of_rows;
	}
	public int getNo_of_column() {
		return no_of_column;
	}
	public void setNo_of_column(int no_of_column) {
		this.no_of_column = no_of_column;
	}
	@Override
	public String toString() {
		return "Screen [screenId=" + screenId + ", theatreid=" + theatreid + ", screenName=" + screenName + ", show="
				+ show + ", no_of_rows=" + no_of_rows + ", no_of_column=" + no_of_column + "]";
	}
	public Screen(int screenId, int theatreid, String screenName, String show, int no_of_rows, int no_of_column) {
		super();
		this.screenId = screenId;
		this.theatreid = theatreid;
		this.screenName = screenName;
		this.show = show;
		this.no_of_rows = no_of_rows;
		this.no_of_column = no_of_column;
	}
	
	

}
