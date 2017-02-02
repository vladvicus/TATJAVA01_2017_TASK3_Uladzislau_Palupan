package com.epam.catalog.dao;

import com.epam.catalog.bean.Disk;
import com.epam.catalog.dao.exception.DaoException;

import java.util.List;

/**
 * Created by Uladzislau_Palupan on 2/2/2017.
 */
public interface DiskDao {
    void addBook(Disk disk) throws DaoException;

    Disk findOneBook(Disk name) throws DaoException;

    List<Disk> findDisksByPrice(Disk price) throws DaoException;

    List<Disk> findBooksByName(String name) throws DaoException;
}
