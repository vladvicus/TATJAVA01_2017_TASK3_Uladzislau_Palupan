package com.epam.catalog.dao.factory;

import com.epam.catalog.dao.BookDao;
import com.epam.catalog.dao.impl.BookDaoImpl;

/**
 * Created by Uladzislau_Palupan on 1/30/2017.
 */
public final class DaoFactory {
    private static final DaoFactory instance = new DaoFactory();
    private final BookDao bookDao = new BookDaoImpl();

    private DaoFactory(){}

    public static DaoFactory getInstance()

    {
        return instance;
    }

    public BookDao getBookDao()
    {
        return bookDao;

    }
}
