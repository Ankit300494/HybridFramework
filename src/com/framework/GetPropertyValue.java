package com.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class GetPropertyValue {
	
	static final String filepath="C:\\Users\\Jyoti\\AppData\\Roaming\\Skype\\My Skype Received Files\\Framework\\Config.properties";
	/**
	 * @description read value from properties on the basis of key
	 * @param key
	 * @return String
	 */
	
	public static String getvalue(String key)
	{
		String value=null;
		
		Properties prop =new Properties();
		try {
			prop.load(new FileInputStream(new File(filepath)));
			value=prop.getProperty(key);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return value;
		
		
	}
	
	
	
	
	
	
	
	
	

}
