/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import pack.control.C_koneksi;
import pack.control.controllerToko;
import pack.model.m_toko;
/**
 *
 * @author Rafid
 */
public class home extends javax.swing.JFrame {
    String nol_jam, nol_menit, nol_detik;
    controllerToko ctoko;
    List<m_toko>listdata = new ArrayList<>();
    /**
     * Creates new form home
     */
    public home() {
        initComponents();
        ctoko = new controllerToko (this);
        ctoko.isiTable();
        String user = null;
        admin.setText(user);
        setTanggal();
        setJam();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        admin = new javax.swing.JTextField();
        waktu = new javax.swing.JLabel();
        tgl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        kode = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        kategori = new javax.swing.JComboBox<>();
        jenis = new javax.swing.JComboBox<>();
        harga = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CariKategori = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        Simpan = new javax.swing.JButton();
        Ubah = new javax.swing.JButton();
        Bersih = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        Keluar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("List Barang di Toko");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(230, 0, 260, 80);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Admin Toko : ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 10, 90, 20);

        admin.setEditable(false);
        admin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });
        jPanel1.add(admin);
        admin.setBounds(100, 10, 80, 30);

        waktu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        waktu.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(waktu);
        waktu.setBounds(540, 40, 130, 20);

        tgl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tgl.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tgl);
        tgl.setBounds(540, 10, 130, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 670, 80);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(null);
        jPanel2.add(kode);
        kode.setBounds(230, 10, 240, 30);
        jPanel2.add(nama);
        nama.setBounds(230, 50, 240, 30);

        kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Minuman", "Baranglain" }));
        jPanel2.add(kategori);
        kategori.setBounds(230, 90, 240, 30);

        jenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pack", "Plastik" }));
        jPanel2.add(jenis);
        jenis.setBounds(230, 130, 240, 30);
        jPanel2.add(harga);
        harga.setBounds(230, 170, 240, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel3.setText("Harga");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 170, 220, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel4.setText("Kode Barang");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(14, 10, 220, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel5.setText("Nama Barang");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 50, 220, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel6.setText("Kategori Barang");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 90, 220, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel7.setText("Jenis Packaging");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 130, 220, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 90, 490, 220);

        CariKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Baranglain", "Minuman" }));
        getContentPane().add(CariKategori);
        CariKategori.setBounds(290, 330, 130, 30);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(null);

        Simpan.setText("Simpan");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });
        jPanel3.add(Simpan);
        Simpan.setBounds(40, 10, 90, 30);

        Ubah.setText("Ubah");
        Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahActionPerformed(evt);
            }
        });
        jPanel3.add(Ubah);
        Ubah.setBounds(40, 50, 90, 30);

        Bersih.setText("Bersihkan");
        Bersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BersihActionPerformed(evt);
            }
        });
        jPanel3.add(Bersih);
        Bersih.setBounds(40, 90, 90, 30);

        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        jPanel3.add(Hapus);
        Hapus.setBounds(40, 130, 90, 30);

        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        jPanel3.add(Keluar);
        Keluar.setBounds(40, 170, 90, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(510, 90, 150, 220);

        jButton2.setText("Cari");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(430, 330, 60, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Pencarian Berdasarkan Kategori Makanan : ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 330, 270, 30);

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setLayout(null);

        Tabel1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabel1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabel1);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 452, 170);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(10, 370, 650, 190);

        setBounds(0, 0, 684, 597);
    }// </editor-fold>//GEN-END:initComponents

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
        // TODO add your handling code here:
        ctoko.SimpanData();
        ctoko.isiTable();
    }//GEN-LAST:event_SimpanActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        // TODO add your handling code here:
        ctoko.Hapus();
        ctoko.isiTable();
    }//GEN-LAST:event_HapusActionPerformed

    private void UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahActionPerformed
        ctoko.Ubah();
        ctoko.isiTable();
        // TODO add your handling code here:
    }//GEN-LAST:event_UbahActionPerformed

    private void BersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BersihActionPerformed
        ctoko.Reset();
        // TODO add your handling code here:
    }//GEN-LAST:event_BersihActionPerformed

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminActionPerformed

    private void Tabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabel1MouseClicked
        int baris = Tabel1.getSelectedRow();
        if(baris != -1){
            kode.setText(Tabel1.getValueAt(baris, 0).toString());
            nama.setText((String) Tabel1.getValueAt(baris, 1));
            kategori.setSelectedItem(Tabel1.getValueAt(baris, 2).toString());
            jenis.setSelectedItem(Tabel1.getValueAt(baris, 3).toString());
            harga.setText(Tabel1.getValueAt(baris, 4).toString());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_Tabel1MouseClicked

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
    dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_KeluarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String user1 = login.user;
        admin.setText(user1);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ctoko.CariKategori();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    public JTextField getTxtKode(){
return kode;
}
public JTextField getTxtNama(){
return nama;
}
public JTextField getTxtHarga(){
return harga;
}
public JComboBox getCbKategori(){
return kategori;
}
public JComboBox getCbJenis(){
return jenis;
}
public JComboBox getCbCariKategori(){
return CariKategori;
}
public JButton getButtonHapus(){
return Hapus;
}
public JButton getButtonBersih(){
return Bersih;
}
public JButton getButtonSimpan(){
return Simpan;
}
public JButton getButtonUbah(){
return Ubah;
}
public JButton getButtonKeluar(){
return Keluar;
}
public JTable getTableData(){
return Tabel1;
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bersih;
    private javax.swing.JComboBox<String> CariKategori;
    private javax.swing.JButton Hapus;
    private javax.swing.JButton Keluar;
    private javax.swing.JButton Simpan;
    private javax.swing.JTable Tabel1;
    private javax.swing.JButton Ubah;
    private javax.swing.JTextField admin;
    private javax.swing.JTextField harga;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jenis;
    private javax.swing.JComboBox<String> kategori;
    private javax.swing.JTextField kode;
    private javax.swing.JTextField nama;
    private javax.swing.JLabel tgl;
    private javax.swing.JLabel waktu;
    // End of variables declaration//GEN-END:variables

    private void setTanggal() {
       java.util.Date skrg = new java.util.Date();
       java.text.SimpleDateFormat kal = new
       java.text.SimpleDateFormat("dd/MM/yyyy");
       tgl.setText(kal.format(skrg));
    }

    private void setJam() {
        ActionListener taskPerformer = new ActionListener(){
        public void actionPerformed(ActionEvent evt){
                String nol_jam = "";
                String nol_menit = "";
                String nol_detik = "";
                
                
                Date dt = new Date();
                int nilai_jam = dt.getHours();
                int nilai_menit = dt.getMinutes();
                int nilai_detik = dt.getSeconds();
                
                if (nilai_jam<=9){
                    nol_jam = "0";
                } if (nilai_menit <= 9) {
                    nol_menit = "0";
                } if (nilai_detik <= 9){
                    nol_detik = "0";
                }
               
                
                String jam = nol_jam + Integer.toString(nilai_jam);
                String menit = nol_menit + Integer.toString(nilai_menit);
                String detik = nol_detik + Integer.toString(nilai_detik);
                waktu.setText(jam+":"+menit+":"+detik);
            }
        } ;
    new Timer(100, taskPerformer).start();
    }
}
