package com.epam.catalog.controller;

import com.epam.catalog.controller.command.Command;
import com.epam.catalog.controller.command.CommandName;
import com.epam.catalog.controller.command.impl.AddBook;
import com.epam.catalog.controller.command.impl.SearchBookByAuthor;

import com.epam.catalog.controller.command.impl.SearchBookByPrice;
import com.epam.catalog.controller.command.impl.WrongRequest;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {

	private final Map<CommandName, Command> repository = new HashMap<>();

	CommandProvider() {

		repository.put(CommandName.SEARCH_BOOK_BY_PRICE, new SearchBookByPrice());
		repository.put(CommandName.SEARCH_BOOK_BY_AUTHOR, new SearchBookByAuthor());
		repository.put(CommandName.ADD_BOOK, new AddBook());
		repository.put(CommandName.WRONG_REQUEST, new WrongRequest());
		// ...
	}

	Command getCommand(String name) {
		CommandName commandName = null;
		Command command = null;
		try {
			commandName = CommandName.valueOf(name.toUpperCase());
			command = repository.get(commandName);
		} catch (IllegalArgumentException | NullPointerException e) {
			// write log
			command = repository.get(CommandName.WRONG_REQUEST);
		}
		return command;
	}
}
