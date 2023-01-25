/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author PARAN
 */
public class Connect {

    public static PreparedStatement pstmt;
    public static Connection connection;
    public static Statement statement;
    public static ResultSet rs;

    public Connect() {
    }

    public static void connect_mysql() {
        String driver = "com.mysql.jdbc.Driver";
        String uname = "root";
        String pwd = "immad";
        String url = "jdbc:mysql://localhost:3306/students";
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, uname, pwd);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

  
