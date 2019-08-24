package com.www.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtil {

	public static String value ;
	public static  String getProperty(String key)  {
		try {
			FileInputStream fs = new FileInputStream(".//src/test/resources/application.properties");
			Properties pt= new Properties();
			pt.load(fs);
			value =pt.getProperty(key).toString();
		}catch(IOException e) {
			
		}
		return value;
		
	}
	
	
}
