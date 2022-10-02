package org.baseclass;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


// Logger - interface
//LoggerFactory - class


public class slf4J {
	
	static Logger log;
	
	public static Logger loadLogger (Class<?> name) {
		
		log = LoggerFactory.getLogger(name);
		
		return log;
	}

}
