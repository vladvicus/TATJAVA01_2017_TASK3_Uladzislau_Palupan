package com.epam.catalog.service.impl;

import com.epam.catalog.bean.Disk;
import com.epam.catalog.service.DiskService;
import com.epam.catalog.service.exception.ServiceException;

import java.util.List;

/**
 * Created by Uladzislau_Palupan on 2/2/2017.
 */
public class DiskServiceImpl implements DiskService {
    @Override
    public void addBook(Disk disk) throws ServiceException {

    }

    @Override
    public Disk findOneBook(Disk name) throws ServiceException {
        return null;
    }

    @Override
    public List<Disk> findDisksByPrice(Disk price) throws ServiceException {
        return null;
    }

    @Override
    public List<Disk> findBooksByName(String name) throws ServiceException {
        return null;
    }
}
