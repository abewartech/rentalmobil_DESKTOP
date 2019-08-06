/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.*;

/**
 *
 * @author Rahmad Al Habib Khasari <rahmadalhabib89@gmail.com>
 */
public class koneksi {
    private Connection koneksi;
    
    public Connection connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("berhasil connect");
        } catch (ClassNotFoundException ex) {
            System.out.println("gagal connect" + ex);
        }
        String url = "jdbc:mysql://localhost/dbRentalMobil";
        try {
            koneksi = DriverManager.getConnection(url, "root", "");
            System.out.println("berhasil connect database");
        } catch (SQLException ex) {
            System.out.println("gagal connect database" + ex);
        }
        return koneksi;
    }
}
