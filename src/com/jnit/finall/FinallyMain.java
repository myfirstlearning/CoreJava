package com.jnit.finall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//finally -> to perform resource cleanups(db connection, file i/o connections etc..)
//try, catch() -> finally always gets executed
//try-catch
//try-multiple catches
//try-catch(one or more)-finally
//try with finally
//ClassNotFoundException vs noClassdeffounderror
//loading class - static, dynamic
//static - new Employee();
//Dynamic - Class.forName("org.jnit.Employee");

public class FinallyMain {

    public static void main(String[] args){

        Connection conn = null;
        try{
            conn = DriverManager.getConnection("");
            //executing query
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
        }

    }

}
