package com.sapient.product1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Application {
   static final Logger logger=LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {
		//System.out.println("Hello Maven");
		// TODO Auto-generated method stub
    // logger.debug("this is a debug message");
      
      logger.info("this is info message");
     
      logger.warn("this is warning message");
     // logger.trace("this is trace message");
      logger.error("this is error message");
	}

}
