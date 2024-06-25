/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main.Controller;


import Main.Dao.MahasiswaDao;
import Main.Dao.UserDao;
import Main.Model.MahasiswaModel;
import Main.Model.UserModel;

public class UserControl {
    private UserDao userDao;
    private MahasiswaDao dao;

    public UserControl(UserDao userDao, MahasiswaDao mahasiswaDao) {
        this.userDao = userDao;
        this.dao = mahasiswaDao;
    }

    public String authenticate(String username, String password) {
        return userDao.authenticate(username, password);
    }

    public void register(String username, String password) {
        userDao.register(new UserModel(username, password));
    }
    
    public void addMahasiswa(MahasiswaModel mahasiswa) {
        dao.addMahasiswa(mahasiswa);
    }
}

