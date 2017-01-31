package com.epam.catalog.service.impl;

import com.epam.catalog.bean.News;
import com.epam.catalog.service.NewsService;
import com.epam.catalog.service.exception.ServiceException;

import java.util.List;

/**
 * Created by Uladzislau_Palupan on 1/30/2017.
 */
public class NewsServiceImpl implements NewsService{


    @Override
    public void addNews(News news) throws ServiceException {

    }

    @Override
    public News findOneNews(News id) throws ServiceException {
        return null;
    }

    @Override
    public List<News> findNews(News category) throws ServiceException {
        return null;
    }
}
