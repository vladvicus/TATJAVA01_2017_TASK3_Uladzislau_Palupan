package com.epam.catalog.controller;


import com.epam.catalog.controller.command.Command;

public class Controller {

	private final CommandProvider provider = new CommandProvider();
	private final char paramDelimeter = ' ';
	
	public String executeTask(String request){
		
	String commandName = request.substring(0, request.indexOf(paramDelimeter));
	
	Command executionCommand = provider.getCommand(commandName);

	System.out.println("Controller:"+executionCommand.toString());
	String response = executionCommand.execute(request);
	
	return response;
	}
}
