/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main.Model;

public class MahasiswaModel {
    private String nim;
    private String name;
    private String jurusan;
    private String asal_kota;
    private String alamat;

    public MahasiswaModel() {
    }

    public MahasiswaModel(String nim, String name, String jurusan, String asal_kota, String alamat) {
        this.nim = nim;
        this.name = name;
        this.jurusan = jurusan;
        this.asal_kota = asal_kota;
        this.alamat = alamat;
    }

    // Getters and setters
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getAsal_kota() {
        return asal_kota;
    }

    public void setAsal_kota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
