package com.jnit.finall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FinallyMain2 {

    public static void main(String[] args) throws Exception {

        Connection conn = null;
        try {
            conn = DriverManager.getConnection("");
            //executing query
            conn.close();
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
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
