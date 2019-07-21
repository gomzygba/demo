package main.java;

import java.sql.*;

public class Main
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println("hello");
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=master;user=sa;password=reallyStrongPwd123");
        Statement stmt = con.createStatement();
        stmt.executeUpdate("INSERT into test VALUES (3,'c')");
        System.out.println("Success!!");
    }

}
