package com.isil.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainApp {

    public  static void main(String[] args) throws Exception {

        String jdbcUrl = "jdbc:mysql://localhost:3306/DESAI";
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(jdbcUrl, "root", "root1234");

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from users");

        while(rs.next()){
            System.out.println(rs.getString("idUser") + " " + rs.getString("name") + " " + rs.getString("phone") + " " + rs.getString("city"));
        }

    }

}
