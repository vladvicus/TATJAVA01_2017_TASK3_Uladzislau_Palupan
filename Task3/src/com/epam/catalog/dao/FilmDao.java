package com.epam.catalog.dao;

import com.epam.catalog.bean.Film;
import com.epam.catalog.dao.exception.DaoException;
import com.epam.catalog.service.exception.ServiceException;

import java.util.List;

/**
 * Created by Uladzislau_Palupan on 2/2/2017.
 */
public interface FilmDao {

    void addFilm(Film film) throws DaoException;

    Film findOneFilm(String name) throws DaoException;

    List<Film> findFilmsByGenre(Film film) throws DaoException;
}
