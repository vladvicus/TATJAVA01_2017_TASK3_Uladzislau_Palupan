package com.epam.catalog.controller.command.impl;


import com.epam.catalog.bean.Book;
import com.epam.catalog.controller.command.Command;
import com.epam.catalog.service.BookService;
import com.epam.catalog.service.exception.ServiceException;
import com.epam.catalog.service.factory.ServiceFactory;

public class AddBook implements Command {

    @Override
    public String execute(String request) {
        final char paramDelimeter = ',';
        System.out.println(request);

        request = request.replaceAll("\\s{2,}", " ");
        // String[] arr = request.split(",");
        Book book = new Book();
        Book newBook=book.makeBook();



        //String message = request.substring(request.indexOf(paramDelimeter));
        StringBuffer sb=new StringBuffer();
        sb.append(newBook.getName()+",");
        sb.append(newBook.getAuthor()+",");
        sb.append(newBook.getPages()+",");
        sb.append(newBook.getPrice());

       String message = "b," + sb.toString();

        /*String[] arr = request.split(",");
        for (String element : arr) {
			element.trim();
			System.out.println(element);
		}
		String author = arr[1];
		String name = arr[2];
		Integer page = Integer.parseInt(arr[3]);
		Double price = Double.parseDouble(arr[4]);

		 toFile ="b,"+arr[1]+arr[2]+arr[3]+arr[4];*/
        // get parameters from request and initialize the variables name and
        System.out.println(message);
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        BookService clientService = serviceFactory.getBookService();
        try {
            clientService.addBook(message);


        } catch (ServiceException e) {

            // write log
            System.out.println("Controller,SearchBookByAuthor:Error during searching procedure");
        }

        return "String from SearchBookByAuthor";

    }

}
