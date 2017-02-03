package com.epam.catalog.controller.command.impl;

import java.util.List;

import com.epam.catalog.bean.Book;
import com.epam.catalog.controller.command.Command;
import com.epam.catalog.service.BookService;
import com.epam.catalog.service.exception.ServiceException;
import com.epam.catalog.service.factory.ServiceFactory;

public class SearchBookByPrice implements Command {

	@Override
	public String execute(String request) {
		
        String[] arr = request.split(",");
        for (String element : arr) {
            element.trim();
            System.out.println(element);
        }
        Double price =Double.parseDouble(arr[1]);

       
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        BookService clientService = serviceFactory.getBookService();
        try {
            List<Book> booksFoundByPrice=clientService.findBooksLessThenPrice(price);
            for(Book oneBook:booksFoundByPrice){
                System.out.println(oneBook.toString());
            }
            System.out.println("Controller:Welcome ");

        } catch (ServiceException e) {

            // write log
            System.out.println("Controller,SearchBookByPrice:Error during searching procedure");
        }

        return "String from SearchBookByAuthor";

    
	}

}
