/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main.Controller;

import Main.Dao.MahasiswaDao;
import Main.Model.MahasiswaModel;

import java.util.List;

public class AdminControl {
    private MahasiswaDao dao;

    public AdminControl(MahasiswaDao mahasiswaDao) {
        this.dao = mahasiswaDao;
    }

    public void addMahasiswa(MahasiswaModel mahasiswa) {
        dao.addMahasiswa(mahasiswa);
    }

    public List<MahasiswaModel> getAllMahasiswa() {
        return dao.getAllMahasiswa();
    }

    public MahasiswaModel getMahasiswaById(String nim) {
        return dao.getMahasiswaById(nim);
    }

    public void updateMahasiswa(MahasiswaModel mahasiswa) {
        dao.updateMahasiswa(mahasiswa);
    }

    public void deleteMahasiswa(String nim) {
        dao.deleteMahasiswa(nim);
    }
    public List<MahasiswaModel> searchMahasiswa(String keyword) {
        return dao.searchMahasiswa(keyword);
    }
}
