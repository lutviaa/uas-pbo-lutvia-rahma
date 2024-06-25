/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SetupConnect {
    private static final String URL = "jdbc:sqlite:mahasiswa.db"; 
    private static Connection connection;
    private static boolean allowClose = true; // Flag untuk mengontrol penutupan koneksi
    
    private SetupConnect() {}

    public static Connection connect() throws SQLException {
        if (connection == null || connection.isClosed()) {
            try {
                Class.forName("org.sqlite.JDBC");
                connection = DriverManager.getConnection(URL);
                System.out.println("Koneksi ke SQLite berhasil.");
            } catch (ClassNotFoundException | SQLException e) {
                System.err.println("Error: " + e.getMessage());
                e.printStackTrace();
                throw new SQLException("Gagal terhubung ke basis data SQLite", e);
            }
        }
        return connection;
    }

    // Metode untuk mengontrol apakah koneksi bisa ditutup
    public static void setAllowClose(boolean allow) {
        allowClose = allow;
    }

    public static void close() {
        if (connection != null && allowClose) {
            try {
                connection.close();
                System.out.println("Koneksi ke SQLite ditutup.");
            } catch (SQLException e) {
                System.out.println("Gagal menutup koneksi: " + e.getMessage());
            } finally {
                connection = null;
            }
        } else if (!allowClose) {
            System.out.println("Penutupan koneksi diblokir oleh flag.");
        }
    }
}



