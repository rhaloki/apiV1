package com.example.demo;

public class Book {
	int index;
	String bookName;
	String bookPictureUrl;
	String bookDesc;
	String bookTitle;
	
	public Book(){
	}
	
	public Book(int index, String bookName, String bookDesc, String bookTitle, String bookPictureUrl){
		this.index = index;
		this.bookName = bookName;
		this.bookDesc = bookDesc;
		this.bookTitle = bookTitle;
		this.bookPictureUrl = bookPictureUrl;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookPictureUrl() {
		return bookPictureUrl;
	}

	public void setBookPictureUrl(String bookPictureUrl) {
		this.bookPictureUrl = bookPictureUrl;
	}

	public String getBookDesc() {
		return bookDesc;
	}

	public void setBookDesc(String bookDesc) {
		this.bookDesc = bookDesc;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	
}
