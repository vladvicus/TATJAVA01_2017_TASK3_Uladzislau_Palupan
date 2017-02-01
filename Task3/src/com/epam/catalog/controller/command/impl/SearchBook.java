package com.epam.catalog.controller.command.impl;

import com.epam.catalog.controller.command.Command;
import com.epam.catalog.service.BookService;
import com.epam.catalog.service.exception.ServiceException;
import com.epam.catalog.service.factory.ServiceFactory;

/**
 * Created by Uladzislau_Palupan on 2/1/2017.
 */
public class SearchBook implements Command {

    @Override
    public String execute(String request) {
        // System.out.println("Fulfil smth!!!");
        System.out.println(request);

        request=request.replaceAll("\\s{2,}", " ");
        System.out.println(request);
        String[] arr = request.split(" ");
        for (String element : arr) {
            element.trim();
            System.out.println(element);
        }
        String name = arr[1];


        String response = null;

        // get parameters from request and initialize the variables name and

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        BookService clientService = serviceFactory.getBookService();
        try {
            clientService.findBooksByAuthor(name);
            response = "Welcome ";
        } catch (ServiceException e) {

            // write log
            response = "Error during searching procedure";
        }
        System.out.println("In controller:" + response);
        return response;

    }
}
