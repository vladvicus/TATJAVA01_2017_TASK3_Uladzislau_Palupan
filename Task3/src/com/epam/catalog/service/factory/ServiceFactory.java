package com.epam.catalog.service.factory;

import com.epam.catalog.service.BookService;
import com.epam.catalog.service.impl.BookServiceImpl;

/**
 * Created by Uladzislau_Palupan on 1/30/2017.
 */
public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();
    private final BookService bookService = new BookServiceImpl();

    private ServiceFactory(){}

    public static ServiceFactory getInstance()

    {
        return instance;
    }
   public BookService getBookService()

    {
        return bookService;
    }

}
