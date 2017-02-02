package com.epam.catalog.controller.command.impl;

import com.epam.catalog.bean.Book;
import com.epam.catalog.controller.command.Command;
import com.epam.catalog.service.BookService;
import com.epam.catalog.service.exception.ServiceException;
import com.epam.catalog.service.factory.ServiceFactory;

import java.util.List;

/**
 * Created by Uladzislau_Palupan on 2/1/2017.
 */
public class SearchBookByAuthor implements Command {

    @Override
    public String execute(String request) {
        // System.out.println("Fulfil smth!!!");
        System.out.println(request);

        request=request.replaceAll("\\s{2,}", " ");
        System.out.println(request);
        String[] arr = request.split(",");
        for (String element : arr) {
            element.trim();
            System.out.println(element);
        }
        String author = arr[1];


        String response = null;

        // get parameters from request and initialize the variables name and

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        BookService clientService = serviceFactory.getBookService();
        try {
            List<Book> booksFoundByAuthor=clientService.findBooksByAuthor(author);
            for(Book oneBook:booksFoundByAuthor){
                System.out.println(oneBook.toString());
            }
            System.out.println("Controller:Welcome ");

        } catch (ServiceException e) {

            // write log
            System.out.println("Controller,SearchBookByAuthor:Error during searching procedure");
        }

        return "String from SearchBookByAuthor";

    }
}
