
package com.cdac.HibernateDemo;

import java.io.FileInputStream;
import java.util.Properties;

import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration hbConfig= new Configuration();
		
		try {
			Properties configProp=new Properties();
			configProp.load(new FileInputStream("application.properties"));
			hbConfig.addProperties(configProp);
			hbConfig.addAnnotatedClass(Users.class);
			
			
		}
	}
}