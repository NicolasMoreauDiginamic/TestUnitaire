package dev.console;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.service.AppService;

public class App {
	
	private static final Logger LOG = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) {
		
		LOG.debug("Bonjour SLF4J !");
		LOG.debug("Implémentation Logback");
		
		AppService appService = new AppService();
		appService.executer("test");
	}

}
