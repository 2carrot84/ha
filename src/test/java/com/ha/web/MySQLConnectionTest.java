package com.ha.web;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by eguns on 2018. 11. 20..
 */
public class MySQLConnectionTest {
    private static final String DRIVER = "com.mysql.jdbc.Driver";

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/2carrot?useSSl=false";

    private static final String USER = "2carrot";
    private static final String PW = "2eckdrms";

    @Test
    public void testConnection() throws Exception {
        Class.forName(DRIVER);

        try(Connection con = DriverManager.getConnection(URL, USER, PW)) {
            System.out.println(con);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
