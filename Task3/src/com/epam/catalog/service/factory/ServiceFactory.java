package com.epam.catalog.service.factory;

import com.epam.catalog.service.NewsService;
import com.epam.catalog.service.impl.NewsServiceImpl;

/**
 * Created by Uladzislau_Palupan on 1/30/2017.
 */
public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();
    private final NewsService newsService = new NewsServiceImpl();

    private ServiceFactory(){}

    public static ServiceFactory getInstance()
    {
        return instance;
    }
    public NewsService getNewsService()
    {
        return newsService;
    }

}
