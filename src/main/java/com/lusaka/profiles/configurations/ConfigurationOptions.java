package com.lusaka.profiles.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
public class ConfigurationOptions {
	
	private String driverClassName;
	private String url;
	private String username;
	private String password;

	public String getDriverClassName() {		return driverClassName;  }
	public void setDriverClassName(String driverClassName) {this.driverClassName = driverClassName;	}

	public String getUrl()         {		return url;	}
	public void setUrl(String url) {		this.url = url;	}

	public String getUsername()				 {return username;	}
	public void setUsername(String username) {	this.username = username;	}

	public String getPassword()				 {		return password;	}
	public void setPassword(String password) {		this.password = password;	}

	@Profile("dev")		    //	Option #1 -	One
	@Bean
	public String devDatabaseConnection() {
		System.out.println("DB connection for DEV - H2");
		System.out.println(driverClassName);
		System.out.println(url);
		return "DB connection for DEV - H2";
	}

	@Profile("test")		//	Option #2 - two
	@Bean
	public String testDatabaseConnection() {
		System.out.println("DB Connection for TEST - PostgreSQL database");
		System.out.println(driverClassName);
		System.out.println(url);
		return "DB Connection for PostgreSQL database";
	}

	@Profile("prod")		//  Option #3 - three
	@Bean
	public String prodDatabaseConnection() {
		System.out.println("DB Connection for PROD to MySQL database");
		System.out.println(driverClassName);
		System.out.println(url);
		return "DB Connection for MySQL database";
	} 
}
