/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main.Dao;

import Main.Model.MahasiswaModel;
import Main.Connection.SetupConnect;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MahasiswaDao {
    private Connection connection;

    public MahasiswaDao(Connection connection) {
        this.connection = connection;
    }
    
    public void addMahasiswa(MahasiswaModel mahasiswa) {
        String sql = "INSERT INTO mahasiswa(nim, name, jurusan, asal_kota, alamat) VALUES(?, ?, ?, ?, ?)";
        try (Connection conn = SetupConnect.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, mahasiswa.getNim());
            pstmt.setString(2, mahasiswa.getName());
            pstmt.setString(3, mahasiswa.getJurusan());
            pstmt.setString(4, mahasiswa.getAsal_kota());
            pstmt.setString(5, mahasiswa.getAlamat());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<MahasiswaModel> getAllMahasiswa() {
        List<MahasiswaModel> list = new ArrayList<>();
        String sql = "SELECT * FROM mahasiswa";
        try (Connection conn = SetupConnect.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                MahasiswaModel mahasiswa = new MahasiswaModel();
                mahasiswa.setNim(rs.getString("nim"));
                mahasiswa.setName(rs.getString("name"));
                mahasiswa.setJurusan(rs.getString("jurusan"));
                mahasiswa.setAsal_kota(rs.getString("asal_kota"));
                mahasiswa.setAlamat(rs.getString("alamat"));
                list.add(mahasiswa);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public MahasiswaModel getMahasiswaById(String nim) {
        MahasiswaModel mahasiswa = null;
        String sql = "SELECT * FROM mahasiswa WHERE nim = ?";
        try (Connection conn = SetupConnect.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nim);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    mahasiswa = new MahasiswaModel();
                    mahasiswa.setNim(rs.getString("nim"));
                    mahasiswa.setName(rs.getString("name"));
                    mahasiswa.setJurusan(rs.getString("jurusan"));
                    mahasiswa.setAsal_kota(rs.getString("asal_kota"));
                    mahasiswa.setAlamat(rs.getString("alamat"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mahasiswa;
    }

    public void updateMahasiswa(MahasiswaModel mahasiswa) {
        String sql = "UPDATE mahasiswa SET name = ?, jurusan = ?, asal_kota = ?, alamat = ? WHERE nim = ?";
        try (Connection conn = SetupConnect.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, mahasiswa.getName());
            pstmt.setString(2, mahasiswa.getJurusan());
            pstmt.setString(3, mahasiswa.getAsal_kota());
            pstmt.setString(4, mahasiswa.getAlamat());
            pstmt.setString(5, mahasiswa.getNim());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteMahasiswa(String nim) {
        String sql = "DELETE FROM mahasiswa WHERE nim = ?";
        try (Connection conn = SetupConnect.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nim);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        public List<MahasiswaModel> searchMahasiswa(String keyword) {
        List<MahasiswaModel> list = new ArrayList<>();
        String sql = "SELECT * FROM mahasiswa WHERE name LIKE ? OR nim LIKE ? OR jurusan LIKE ? OR asal_kota LIKE ? OR alamat LIKE ?";
        try (Connection conn = SetupConnect.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            String searchKeyword = "%" + keyword + "%";
            pstmt.setString(1, searchKeyword);
            pstmt.setString(2, searchKeyword);
            pstmt.setString(3, searchKeyword);
            pstmt.setString(4, searchKeyword);
            pstmt.setString(5, searchKeyword);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    MahasiswaModel mahasiswa = new MahasiswaModel();
                    mahasiswa.setNim(rs.getString("nim"));
                    mahasiswa.setName(rs.getString("name"));
                    mahasiswa.setJurusan(rs.getString("jurusan"));
                    mahasiswa.setAsal_kota(rs.getString("asal_kota"));
                    mahasiswa.setAlamat(rs.getString("alamat"));
                    list.add(mahasiswa);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
