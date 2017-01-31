package com.epam.catalog.service;

import com.epam.catalog.bean.News;
import com.epam.catalog.service.exception.ServiceException;

import java.io.Serializable;
import java.util.List;

/**
 *
 */
public interface NewsService {


    void addNews(News news) throws ServiceException;

    News findOneNews(News id) throws ServiceException;

    List<News> findNews(News category) throws ServiceException;
}