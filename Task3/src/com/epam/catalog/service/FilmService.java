package com.epam.catalog.service;

import com.epam.catalog.bean.Film;
import com.epam.catalog.service.exception.ServiceException;

import java.util.List;

/**
 * Created by Uladzislau_Palupan on 2/2/2017.
 */
public interface FilmService {

void addFilm(Film film) throws ServiceException;

    Film findOneFilm(String name) throws ServiceException;

    List<Film> findFilmsByGenre(Film film) throws ServiceException;


    }