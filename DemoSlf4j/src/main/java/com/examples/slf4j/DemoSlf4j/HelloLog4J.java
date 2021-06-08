package com.examples.slf4j.DemoSlf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 
/**
 * HelloLog4J!
 *
 */
public class HelloLog4J 
{
    public static void main( String[] args )
    {
        Logger logger = LoggerFactory.getLogger(HelloLog4J.class);
        logger.info("This is how you configure Log4J with SLF4J");
        logger.debug( "a debug" );
        logger.info( "an info" );
        logger.warn("a warn");
        logger.error("an error");
        
        Integer age = 23;
        String name="Welcome";
        
        //Logging the information
        logger.info("At the age of {} ramu got {} his first job", age,name);

      
    }
}