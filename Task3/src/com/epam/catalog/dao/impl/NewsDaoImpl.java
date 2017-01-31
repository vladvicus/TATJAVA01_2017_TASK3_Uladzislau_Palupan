package com.epam.catalog.dao.impl;

import com.epam.catalog.bean.News;
import com.epam.catalog.dao.NewsDao;
import com.epam.catalog.dao.exception.DaoException;

import java.util.List;

/**
 * Created by Uladzislau_Palupan on 1/30/2017.
 */
public class NewsDaoImpl implements NewsDao{
    @Override
    public void addNews(News news) throws DaoException {

    }

    @Override
    public News findOneNews(News id) throws DaoException {
        return null;
    }

    @Override
    public List<News> findNews(News category) throws DaoException {
        return null;
    }
}
