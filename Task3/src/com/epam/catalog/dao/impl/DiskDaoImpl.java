package com.epam.catalog.dao.impl;

import com.epam.catalog.bean.Disk;
import com.epam.catalog.dao.DiskDao;
import com.epam.catalog.dao.exception.DaoException;
import com.epam.catalog.service.exception.ServiceException;

import java.util.List;

/**
 * Created by Uladzislau_Palupan on 2/2/2017.
 */
public class DiskDaoImpl implements DiskDao {
    @Override
    public void addBook(Disk disk) throws DaoException {

    }

    @Override
    public Disk findOneBook(Disk name) throws DaoException {
        return null;
    }

    @Override
    public List<Disk> findDisksByPrice(Disk price) throws DaoException {
        return null;
    }

    @Override
    public List<Disk> findBooksByName(String name) throws DaoException{
        return null;
    }
}
