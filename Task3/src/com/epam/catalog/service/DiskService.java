package com.epam.catalog.service;

import com.epam.catalog.bean.Disk;
import com.epam.catalog.service.exception.ServiceException;

import java.util.List;

/**
 * Created by Uladzislau_Palupan on 2/2/2017.
 */
public interface DiskService {

    void addBook(Disk disk) throws ServiceException;

    Disk findOneBook(Disk name) throws ServiceException;

    List<Disk> findDisksByPrice(Disk price) throws ServiceException;

    List<Disk> findBooksByName(String name) throws ServiceException;
}
