package com.jnit.finall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FinallyMain3 {

    public static void main(String[] args){

        try {
            main();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception Handling");
        }

    }

    public static void main() throws Exception {

        Connection conn = null;
        try {
            conn = DriverManager.getConnection("");
            //executing query
            conn.close();
        } catch (SQLException e) {

            System.out.println("catch 1");

            //Doesn't execute finally
            // 0 - Success
            // 1 - Failure
            System.exit(0);
            //System.exit(1);

            throw new Exception("Catch Sql");

        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            throw new Exception("finally");
        }

    }

}
