/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main.Form;

import Main.Controller.AdminControl;
import Main.Model.MahasiswaModel;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;



public class AdminForm extends javax.swing.JFrame {

    private AdminControl control;
    private JTable mahasiswaTable;

    public AdminForm() {
        initComponents();
        // Inisialisasi lainnya
    }

    public AdminForm(AdminControl control) {
        this.control = control;
        initComponents();
        mahasiswaTable = new JTable(); 
        jScrollPane1.setViewportView(mahasiswaTable);
        loadMahasiswa();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jFrame2 = new javax.swing.JFrame();
        jTextField1 = new javax.swing.JTextField();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jToolBar1 = new javax.swing.JToolBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListSql = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        simpan = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Search = new javax.swing.JTextField();
        Nama = new javax.swing.JTextField();
        Jurusan = new javax.swing.JTextField();
        Delete = new javax.swing.JButton();
        NIM = new javax.swing.JTextField();
        Alamat = new javax.swing.JTextField();
        Asal_Kota = new javax.swing.JTextField();
        Cari = new javax.swing.JButton();
        Export_CSV = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jTextField1.setText("jTextField1");

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jToolBar1.setRollover(true);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane2.setBackground(new java.awt.Color(255, 255, 255));

        ListSql.setBackground(new java.awt.Color(204, 204, 204));
        ListSql.setColumns(20);
        ListSql.setRows(5);
        jScrollPane1.setViewportView(ListSql);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATA KOS MAHASISWA KELAS 2KS1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(90, 90, 90))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama");

        jLabel3.setText("NIM");

        jLabel4.setText("Jurusan");

        jLabel5.setText("Asal Kota");

        jLabel6.setText("Alamat Kos");

        simpan.setBackground(new java.awt.Color(0, 102, 153));
        simpan.setForeground(new java.awt.Color(255, 255, 255));
        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        Update.setBackground(new java.awt.Color(0, 102, 153));
        Update.setForeground(new java.awt.Color(255, 255, 255));
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        jLabel7.setText("Search");

        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaActionPerformed(evt);
            }
        });

        Jurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JurusanActionPerformed(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(0, 102, 153));
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        NIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NIMActionPerformed(evt);
            }
        });

        Alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlamatActionPerformed(evt);
            }
        });

        Asal_Kota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Asal_KotaActionPerformed(evt);
            }
        });

        Cari.setBackground(new java.awt.Color(0, 102, 153));
        Cari.setForeground(new java.awt.Color(255, 255, 255));
        Cari.setText("Cari");
        Cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CariActionPerformed(evt);
            }
        });

        Export_CSV.setBackground(new java.awt.Color(0, 102, 153));
        Export_CSV.setForeground(new java.awt.Color(255, 255, 255));
        Export_CSV.setText("Eksport CSV");
        Export_CSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Export_CSVActionPerformed(evt);
            }
        });

        jDesktopPane2.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(simpan, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(Update, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(Search, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(Nama, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(Jurusan, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(Delete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(NIM, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(Alamat, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(Asal_Kota, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(Cari, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(Export_CSV, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Jurusan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                        .addComponent(NIM, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Export_CSV)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane2Layout.createSequentialGroup()
                                    .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(Nama, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                            .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(Cari, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel7)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane2Layout.createSequentialGroup()
                                    .addComponent(Update)
                                    .addGap(18, 18, 18)
                                    .addComponent(Delete)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(simpan))
                                .addComponent(Alamat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Asal_Kota, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(37, 37, 37))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addGap(32, 32, 32))
                    .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Cari)))
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Asal_Kota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Update)
                    .addComponent(Delete)
                    .addComponent(simpan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Export_CSV)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        String keyword = Search.getText();

        if (keyword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Keyword harus diisi");
            return;
        }

        List<MahasiswaModel> mahasiswaList = control.searchMahasiswa(keyword);
        loadMahasiswa();
    }//GEN-LAST:event_SearchActionPerformed

    private void NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaActionPerformed
        String nama = Nama.getText();
        if (nama.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama tidak boleh kosong!", "Kesalahan Input", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_NamaActionPerformed

    private void JurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JurusanActionPerformed
        String jurusan = Jurusan.getText();
        if (jurusan.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Jurusan tidak boleh kosong!", "Kesalahan Input", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JurusanActionPerformed

    private void NIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NIMActionPerformed
        String nim = NIM.getText().trim();
        if (nim.isEmpty()) {
            JOptionPane.showMessageDialog(this, "NIM tidak boleh kosong!", "Kesalahan Input", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_NIMActionPerformed

    private void AlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlamatActionPerformed
        String alamat = Alamat.getText();
        if (alamat.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Alamat tidak boleh kosong!", "Kesalahan Input", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AlamatActionPerformed

    private void Asal_KotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Asal_KotaActionPerformed
        String asal_kota = Asal_Kota.getText();
        if (asal_kota.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Asal Kota tidak boleh kosong!", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Asal_KotaActionPerformed

    private void CariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CariActionPerformed
        String keyword = Search.getText();

        if (keyword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Keyword harus diisi");
            return;
        }

        List<MahasiswaModel> mahasiswaList = control.searchMahasiswa(keyword);

        // Check if the search returned any results
        if (!mahasiswaList.isEmpty()) {
            // Assuming you want to display the first result in the text fields
            MahasiswaModel mahasiswa = mahasiswaList.get(0);

            // Populate the text fields with the data from the first search result
            Nama.setText(mahasiswa.getName());
            NIM.setText(mahasiswa.getNim());
            Jurusan.setText(mahasiswa.getJurusan());
            Asal_Kota.setText(mahasiswa.getAsal_kota());
            Alamat.setText(mahasiswa.getAlamat());
        } else {
            JOptionPane.showMessageDialog(this, "Data tidak ditemukan");
            Nama.setText("");
            NIM.setText("");
            Jurusan.setText("");
            Asal_Kota.setText("");
            Alamat.setText("");
        } 
    }//GEN-LAST:event_CariActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        String nama = Nama.getText();
        String nim = NIM.getText();
        String jurusan = Jurusan.getText();
        String asalKota = Asal_Kota.getText();
        String alamat = Alamat.getText();

        if (nama.isEmpty() || nim.isEmpty() || jurusan.isEmpty() || asalKota.isEmpty() || alamat.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi");
            return;
        }

        MahasiswaModel mahasiswa = new MahasiswaModel(nim, nama, jurusan, asalKota, alamat);
        control.addMahasiswa(mahasiswa);

        JOptionPane.showMessageDialog(this, "Data berhasil disimpan");

        clearForm();
        loadMahasiswa();
    }//GEN-LAST:event_simpanActionPerformed

    private void Export_CSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Export_CSVActionPerformed
        export_CSV();
    }//GEN-LAST:event_Export_CSVActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        String nama = Nama.getText();
        String nim = NIM.getText();
        String jurusan = Jurusan.getText();
        String asalKota = Asal_Kota.getText();
        String alamat = Alamat.getText();

        if (nama.isEmpty() || nim.isEmpty() || jurusan.isEmpty() || asalKota.isEmpty() || alamat.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi");
            return;
        }

        MahasiswaModel mahasiswa = new MahasiswaModel(nim, nama, jurusan, asalKota, alamat);
        control.updateMahasiswa(mahasiswa);

        JOptionPane.showMessageDialog(this, "Data berhasil diperbarui");

        clearForm();
        loadMahasiswa();
    }//GEN-LAST:event_UpdateActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        String nim = NIM.getText();

        if (nim.isEmpty()) {
            JOptionPane.showMessageDialog(this, "NIM harus diisi");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            control.deleteMahasiswa(nim);
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus");

            clearForm();
            loadMahasiswa();
        }
    }//GEN-LAST:event_DeleteActionPerformed

    
    private void clearForm() {
        Nama.setText("");
        NIM.setText("");
        Jurusan.setText("");
        Asal_Kota.setText("");
        Alamat.setText("");
    }
    
    private void loadMahasiswa() {
        List<MahasiswaModel> mahasiswaList = control.getAllMahasiswa();
        MahasiswaTableModel model = new MahasiswaTableModel(mahasiswaList);
        mahasiswaTable.setModel(model);
    }
    
    private void export_CSV() {
        JFileChooser fileChooser = new JFileChooser();
        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            try (FileWriter writer = new FileWriter(fileToSave + ".csv")) {
                List<MahasiswaModel> mahasiswaList = control.getAllMahasiswa();

                // Header CSV
                writer.append("NIM, Nama, Jurusan, Asal Kota, Alamat");
                writer.append("\n");

                // Data rows
                for (MahasiswaModel mahasiswa : mahasiswaList) {
                    writer.append(mahasiswa.getNim());
                    writer.append(",");
                    writer.append(mahasiswa.getName());
                    writer.append(",");
                    writer.append(mahasiswa.getJurusan());
                    writer.append(",");
                    writer.append(mahasiswa.getAsal_kota());
                    writer.append(",");
                    writer.append(mahasiswa.getAlamat());
                    writer.append("\n");
                }

                JOptionPane.showMessageDialog(this, "Data berhasil diekspor ke CSV.");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menyimpan file: " + ex.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alamat;
    private javax.swing.JTextField Asal_Kota;
    private javax.swing.JButton Cari;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Export_CSV;
    private javax.swing.JTextField Jurusan;
    private javax.swing.JTextArea ListSql;
    private javax.swing.JTextField NIM;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField Search;
    private javax.swing.JButton Update;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton simpan;
    // End of variables declaration//GEN-END:variables

    private static class MahasiswaTableModel extends AbstractTableModel {
        private List<MahasiswaModel> mahasiswaList;
        private final String[] columnNames = {"NIM", "Nama", "Jurusan", "Asal Kota", "Alamat"};

        public MahasiswaTableModel(List<MahasiswaModel> mahasiswaList) {
            this.mahasiswaList = mahasiswaList;
        }

        @Override
        public int getRowCount() {
            return mahasiswaList.size();
        }

        @Override
        public int getColumnCount() {
            return columnNames.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            MahasiswaModel mahasiswa = mahasiswaList.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return mahasiswa.getNim();
                case 1:
                    return mahasiswa.getName();
                case 2:
                    return mahasiswa.getJurusan();
                case 3:
                    return mahasiswa.getAsal_kota();
                case 4:
                    return mahasiswa.getAlamat();
                default:
                    return null;
            }
        }

        @Override
        public String getColumnName(int columnIndex) {
            return columnNames[columnIndex];
        }
    }
}