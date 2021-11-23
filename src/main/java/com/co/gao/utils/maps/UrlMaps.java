package com.co.gao.utils.maps;

import java.util.HashMap;
import java.util.Map;

import com.co.gao.utils.PropertiesLoader;



public class UrlMaps {
	  private UrlMaps() {
		    throw new IllegalStateException("Utility class");
		  }
	 static PropertiesLoader prop = new PropertiesLoader();
	private static final String URLBASE = "URLBASE";
	private static final String URLFALABELLA="URLFALABELLA";
	 public static Map<String, String> urlInit() {
		    Map<String, String> response = new HashMap<>();
		    response.put(URLBASE, prop.getProperty(URLBASE));
		    response.put(URLFALABELLA, prop.getProperty(URLFALABELLA));
		    return response;
		  }

}
