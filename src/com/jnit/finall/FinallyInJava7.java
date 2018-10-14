package com.jnit.finall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FinallyInJava7 {


    public static void main(String[] args){
        getConnection();
    }

    private static void getConnection(){

        //Connection conn = null;
        //try with resources - java 7, Closeable and AutoClosable interfaces
        //close the connection automatically
        try(Connection conn = DriverManager.getConnection("")){

            //conn = DriverManager.getConnection("");
            //executing some query
            //conn.close();
        }catch (SQLException se){
                   se.printStackTrace();
        }
    }
}
