package com.sever.BookStore;

import java.util.Date;

public class Book {
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getOwner() {
		return Owner;
	}
	public void setOwner(String owner) {
		Owner = owner;
	}
	public String getCurrentUSer() {
		return CurrentUSer;
	}
	public void setCurrentUSer(String currentUSer) {
		CurrentUSer = currentUSer;
	}
	public String getCurrentStatus() {
		return CurrentStatus;
	}
	public void setCurrentStatus(String currentStatus) {
		CurrentStatus = currentStatus;
	}
	public Date getDueDate() {
		return DueDate;
	}
	public void setDueDate(Date dueDate) {
		DueDate = dueDate;
	}
	private int ID;
	private String Author, Title, Owner, CurrentUSer, CurrentStatus;
	private Date DueDate;

}
