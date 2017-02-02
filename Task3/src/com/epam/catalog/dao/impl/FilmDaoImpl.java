package com.epam.catalog.dao.impl;

import com.epam.catalog.bean.Film;
import com.epam.catalog.dao.FilmDao;
import com.epam.catalog.dao.exception.DaoException;
import com.epam.catalog.service.exception.ServiceException;

import java.util.List;

/**
 * Created by Uladzislau_Palupan on 2/2/2017.
 */
public class FilmDaoImpl implements FilmDao {
    @Override
    public void addFilm(Film film) throws DaoException {

    }

    @Override
    public Film findOneFilm(String name) throws DaoException {
        return null;
    }

    @Override
    public List<Film> findFilmsByGenre(Film film) throws DaoException {
        return null;
    }
}
