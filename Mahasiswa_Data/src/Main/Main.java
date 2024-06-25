/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Main.Connection.SetupConnect;
import Main.Controller.AdminControl;
import Main.Controller.UserControl;
import Main.Dao.MahasiswaDao;
import Main.Dao.UserDao;
import Main.Form.LoginForm;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;
        
        try {
            // Mengambil koneksi dari SetupConnect
            connection = SetupConnect.connect();

            // Mencegah penutupan koneksi saat form masih aktif
            SetupConnect.setAllowClose(false);
            
            // Inisialisasi DAO
            MahasiswaDao dao = new MahasiswaDao(connection);
            UserDao userDao = new UserDao(connection);
            
            // Inisialisasi Controller
            UserControl userControl = new UserControl(userDao, dao);
            
            AdminControl adminControl = new AdminControl(dao);

            // Inisialisasi Form Login
            LoginForm loginForm = new LoginForm(userControl, adminControl);
            loginForm.setVisible(true); // Menampilkan form login pertama kali

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
}






