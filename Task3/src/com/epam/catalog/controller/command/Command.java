package com.epam.catalog.controller.command;

import com.epam.catalog.bean.Book;

import java.util.List;

public interface Command {
 public String execute (String request);
}
