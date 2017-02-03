package com.epam.catalog.view;

import com.epam.catalog.controller.Controller;

/**
 *
 */
public class Main {

	public static void main(String[] args) {

		Controller first = new Controller();

	//	first.executeTask("Search_book_by_author,Noah");
	//	first.executeTask("Add_book,");//Tolkien,Hobbit,200,15.8");
		first.executeTask("Search_book_by_price,20");

	}

}
