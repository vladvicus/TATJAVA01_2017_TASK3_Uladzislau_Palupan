package com.epam.catalog.dao.factory;

import com.epam.catalog.dao.NewsDao;
import com.epam.catalog.dao.impl.NewsDaoImpl;

/**
 * Created by Uladzislau_Palupan on 1/30/2017.
 */
public final class DaoFactory {
    private static final DaoFactory instance = new DaoFactory();
    private final NewsDao newsDao = new NewsDaoImpl();

    private DaoFactory(){}

    public static DaoFactory getInstance()
    {
        return instance;
    }
    public NewsDao getNewsDao()
    {
        return newsDao;

    }
}
