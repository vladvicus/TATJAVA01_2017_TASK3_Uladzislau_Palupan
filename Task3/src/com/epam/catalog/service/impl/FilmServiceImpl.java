package com.epam.catalog.service.impl;

import com.epam.catalog.bean.Film;
import com.epam.catalog.service.FilmService;
import com.epam.catalog.service.exception.ServiceException;

import java.util.List;

public class FilmServiceImpl implements FilmService {

    @Override
    public void addFilm(Film film) throws ServiceException {

    }

    @Override
    public Film findOneFilm(String name) throws ServiceException {
        return null;
    }

    @Override
    public List<Film> findFilmsByGenre(Film film) throws ServiceException {
        return null;
    }

}
