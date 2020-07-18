package com.montran.pojo;

public class Book {
	private int Book_No;
	private String Book_Title;
	private double Price;
	
	
	public double TotalCost(int NumberOfCopies) {
		if(NumberOfCopies > 0) {
			return Price * NumberOfCopies;
		}
		return -1;	
	}
	
	public void Input(String bookTitle, int bookNo, double bookPrice ) {
		this.Book_No = bookNo;
		this.Book_Title = bookTitle;
		this.Price = bookPrice;
	}
	
	public double Purchase(int NoOfBooksForPurchase) {
		if(NoOfBooksForPurchase > 0) {
			return TotalCost(NoOfBooksForPurchase);
	
		}
		return -1;
	}

	@Override
	public String toString() {
		return "Book [Book_No=" + Book_No + ", Book_Title=" + Book_Title + ", Price=" + Price + "]";
	}
	
	

}
