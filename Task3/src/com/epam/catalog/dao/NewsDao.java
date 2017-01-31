package com.epam.catalog.dao;

import com.epam.catalog.bean.News;
import com.epam.catalog.dao.exception.DaoException;

import java.util.List;

/*
 */
public interface NewsDao {
    void addNews(News news) throws DaoException;
    News findOneNews(News id) throws DaoException;
    List<News> findNews(News category) throws DaoException;
}
