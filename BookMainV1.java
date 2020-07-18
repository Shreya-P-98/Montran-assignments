package com.montran.main;

import com.montran.pojo.Book;

public class BookMainV1 {

	public static void main(String[] args) {
		Book b1 = new Book();
		
		b1.Input("The Secret",101,5000);
		System.out.println(b1);
		
		System.out.println("Total cost to be paid " + b1.Purchase(8));

		System.out.println("Total cost is : " + b1.TotalCost(4));
		
		
		
	

	}
	

}
