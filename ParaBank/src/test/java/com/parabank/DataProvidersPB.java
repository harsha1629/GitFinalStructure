package com.parabank;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DataProvidersPB {
	String firstName,lastName,
	address,city,state,zipcode,phoneNumber,
	ssn,username,password,repeatedPassword;
	
	public DataProvidersPB() {
		datas();
	}
	
	public void datas() {
		File inputFile = new File("C:\\Users\\hviswanathan\\eclipse-workspace\\ParaBank\\src\\test\\resources\\ParaBank\\register.properties");
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(inputFile);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties prop = new Properties();
		try {
			prop.load(fis);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		firstName = prop.getProperty(firstName);
		lastName = prop.getProperty(lastName);
		address = prop.getProperty(address);
		city = prop.getProperty(city);
		state = prop.getProperty(state);
		zipcode = prop.getProperty(zipcode);
		phoneNumber = prop.getProperty(phoneNumber);
		ssn = prop.getProperty(ssn);
		username = prop.getProperty(username);
		password = prop.getProperty(password);
		repeatedPassword = prop.getProperty(password);
				
	}

}
