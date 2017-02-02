package com.epam.catalog.service.impl;

import com.epam.catalog.bean.Book;
import com.epam.catalog.dao.BookDao;
import com.epam.catalog.dao.exception.DaoException;
import com.epam.catalog.dao.factory.DaoFactory;
import com.epam.catalog.service.BookService;
import com.epam.catalog.service.exception.ServiceException;
import java.util.List;

public class BookServiceImpl implements BookService {


    @Override
    public void addBook(String book) throws ServiceException {
        System.out.println("method findBooksByAuthor BookServiceImpl");
        String response =null;
        try {
            DaoFactory serviceFactory = DaoFactory.getInstance();
            BookDao bookDao = serviceFactory.getBookDao();

            bookDao.addBook(book);
            response = "Welcome by BookServiceImpl";

        } catch (DaoException e) {
            response = "Error during searching procedure from BookServiceImpl";
            throw new ServiceException(e);

            // write log
        }
    }
   @Override
    public Book findOneBook(String name) throws ServiceException {
        return null;
    }

    @Override
    public List<Book> findBooksLessThenPrice(Double price) throws ServiceException {
        return null;
    }


    @Override
    public List<Book> findBooksByAuthor(String author) throws ServiceException {

        System.out.println("method findBooksByAuthor BookServiceImpl");
        String response =null;
        try {
            DaoFactory serviceFactory = DaoFactory.getInstance();
            BookDao bookDao = serviceFactory.getBookDao();

            List<Book> booksFind=bookDao.findBooksByAuthor(author);
            response = "Welcome by BookServiceImpl";
            return booksFind;
        } catch (DaoException e) {
            response = "Error during searching procedure from BookServiceImpl";
            throw new ServiceException(e);

            // write log
        }



    }
}
