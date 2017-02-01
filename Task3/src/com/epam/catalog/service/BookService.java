package com.epam.catalog.service;

import com.epam.catalog.bean.Book;
import com.epam.catalog.service.exception.ServiceException;

import java.util.List;

/**
 *
 */
public interface BookService {


    void addBook(Book book) throws ServiceException;

    Book findOneBook(Book name) throws ServiceException;

    List<Book> findBooksByPrice(Book price) throws ServiceException;

    List<Book> findBooksByAuthor(String author) throws ServiceException;
}