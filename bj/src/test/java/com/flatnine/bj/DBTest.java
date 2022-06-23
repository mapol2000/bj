package com.flatnine.bj;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBTest {
	
	 private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	 
	 private static final String URL = "jdbc:mysql://localhost:3306/store-management?serverTimezone=UTC&allowPublicKeyRetrieval=true&useSSL=false";
	 private static final String USER = "hbstudent";
	 private static final String PASSWORD = "hbstudent";
	 
	 public void testConnection() throws Exception {
	        // DBMS에게 DB 연결 드라이버의 위치를 알려주기 위한 메소드
	        Class.forName(DRIVER);
	        try {
	            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
	            System.out.println(connection);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

}
