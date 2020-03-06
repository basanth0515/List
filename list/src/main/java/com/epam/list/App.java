package com.epam.list;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class App 
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        List<Integer> li = new List<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(6);
        LOGGER.debug(li);
        li.remove(1);
        LOGGER.debug(li);
        LOGGER.debug(li.get(0) );
        LOGGER.debug(li.get(1) );
        LOGGER.debug(li.size());
        List<String>li2=new List<>();
        li2.add("apache");
        li2.add("maven");
        li2.add("logger");
        li2.add("quickstart");
        LOGGER.debug(li2);
        LOGGER.debug(li.get(0));
        LOGGER.debug(li2.size());
        li2.remove(2);
        LOGGER.debug(li2);
    }
}