package com.netflix.simianarmy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.simianarmy.aws.AWSResource;

public class utilityTimer {

	public static final Logger LOGGER = LoggerFactory.getLogger(utilityTimer.class);	
	
	public static String millisToFormattedDate(String millisStr) {
    	String datetime = null;
    	try {
    		long millis = Long.parseLong(millisStr);
    		datetime = AWSResource.DATE_FORMATTER.print(millis);
    	} catch(NumberFormatException nfe) {
			LOGGER.error(String.format("Error parsing datetime %s when reading from RDS", millisStr));
    	}
    	return datetime;
    }
}
