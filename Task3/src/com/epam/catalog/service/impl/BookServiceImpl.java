package com.epam.catalog.service.impl;

import com.epam.catalog.bean.Book;
import com.epam.catalog.dao.BookDao;
import com.epam.catalog.dao.exception.DaoException;
import com.epam.catalog.dao.factory.DaoFactory;
import com.epam.catalog.service.BookService;
import com.epam.catalog.service.exception.ServiceException;

import java.util.List;

/**
 * Created by Uladzislau_Palupan on 1/30/2017.
 */
public class BookServiceImpl implements BookService {


    @Override
    public void addBook(Book book) throws ServiceException {

    }

    @Override
    public Book findOneBook(Book name) throws ServiceException {
        return null;
    }

    @Override
    public List<Book> findBooksByPrice(Book price) throws ServiceException {

        return null;
    }


    @Override
    public List<Book> findBooksByAuthor(String author) throws ServiceException {

        System.out.println("method findBooksByAuthor BookServiceImpl");
        String response =null;
        try {
            DaoFactory serviceFactory = DaoFactory.getInstance();
            BookDao bookDao = serviceFactory.getBookDao();

            bookDao.findBooksByAuthor(author);
            response = "Welcome by BookServiceImpl";
        } catch (DaoException e) {
            response = "Error during searching procedure from BookServiceImpl";
            throw new ServiceException(e);

            // write log

        } finally {
            System.out.println("In service:" + response);
        }

        return null;

    }
}
