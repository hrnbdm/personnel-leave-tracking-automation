/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proje;

import java.awt.Checkbox;
import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import javax.swing.plaf.DesktopPaneUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class Frame5Ayarlar extends javax.swing.JFrame {

    int r = 0;
    int g = 0;
    int b = 0;

    /**
     * Creates new form FrameAyarlar
     */
    public Frame5Ayarlar() {
        initComponents();
        yoneticiGoruntule();
        
        if (TableYonetici.getRowCount() == 1) {
            ButtonYoneticiSil.setVisible(false);
        } else {
            ButtonYoneticiSil.setVisible(true);
        }
        DefaultComboBoxModel redModel = new DefaultComboBoxModel();
        DefaultComboBoxModel greenModel = new DefaultComboBoxModel();
        DefaultComboBoxModel blueModel = new DefaultComboBoxModel();
        for (int i = 0; i < 256; i++) {
            redModel.addElement(i);
        }
        ComboBoxRed.setModel(redModel);

        for (int i = 0; i < 256; i++) {
            greenModel.addElement(i);
        }
        ComboBoxGreen.setModel(greenModel);
        for (int i = 0; i < 256; i++) {
            blueModel.addElement(i);
        }
        ComboBoxBlue.setModel(blueModel);
        LabelOrnek.setOpaque(true);

    }

    public void yoneticiGoruntule() {
        TableYonetici.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "TC", "AD", "SOYAD"
                }
        ));

        try {
            Connection con = Connecter.connect();
            Statement st = con.createStatement();
            ResultSet sonuc = st.executeQuery("SELECT * FROM logıny");
            int sutun = sonuc.getMetaData().getColumnCount(); //sütun sayısı hesaplandı
            while (sonuc.next()) {
                Object[] satir = new Object[sutun]; //sütun sayısı kadar satır objesi oluştu
                for (int i = 1; i < sutun; i++) {  //datalar tabloya yerleştiriliyor
                    satir[i - 1] = sonuc.getObject(i);
                }
                ((DefaultTableModel) TableYonetici.getModel()).insertRow(sonuc.getRow() - 1, satir);
            }
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Yönetici Görüntüleme Hatası");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableYonetici = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TextFieldAd = new javax.swing.JTextField();
        TextFieldTc = new javax.swing.JTextField();
        TextFieldSoyad = new javax.swing.JTextField();
        ButtonYoneticiEkle = new javax.swing.JButton();
        ButtonYoneticiSil = new javax.swing.JButton();
        CheckBoxPassword = new javax.swing.JCheckBox();
        TextPasswordField1 = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        ComboBoxRed = new javax.swing.JComboBox<>();
        ComboBoxGreen = new javax.swing.JComboBox<>();
        ComboBoxBlue = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LabelOrnek = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AYARLAR");

        TableYonetici.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TC", "AD", "SOYAD"
            }
        ));
        TableYonetici.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(TableYonetici);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("TC :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("SOYAD :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("AD :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("ŞİFRE :");

        ButtonYoneticiEkle.setBackground(new java.awt.Color(0, 255, 0));
        ButtonYoneticiEkle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ButtonYoneticiEkle.setText("EKLE");
        ButtonYoneticiEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonYoneticiEkleActionPerformed(evt);
            }
        });

        ButtonYoneticiSil.setBackground(new java.awt.Color(255, 0, 0));
        ButtonYoneticiSil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ButtonYoneticiSil.setText("SİL");
        ButtonYoneticiSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonYoneticiSilActionPerformed(evt);
            }
        });

        CheckBoxPassword.setText("Şifreyi Göster");
        CheckBoxPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TextFieldTc, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(ButtonYoneticiEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonYoneticiSil, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TextFieldAd, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(TextPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(TextFieldSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(29, 29, 29)
                                .addComponent(CheckBoxPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldTc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonYoneticiEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonYoneticiSil, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldAd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckBoxPassword)
                    .addComponent(TextPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("YÖNETİCİ EKLEME", jPanel1);

        ComboBoxRed.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxRedİtemStateChanged(evt);
            }
        });
        ComboBoxRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxRedActionPerformed(evt);
            }
        });

        ComboBoxGreen.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxGreenİtemStateChanged(evt);
            }
        });

        ComboBoxBlue.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxBlueİtemStateChanged(evt);
            }
        });

        jLabel5.setText("Kırmızı");

        jLabel6.setText("Yeşil");

        jLabel7.setText("Mavi");

        LabelOrnek.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelOrnek.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelOrnek.setText("RENK");
        LabelOrnek.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton1.setText("UYGULA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton2.setText("RESET");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxRed, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(LabelOrnek, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 295, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboBoxRed, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addComponent(LabelOrnek, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(ComboBoxGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboBoxBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("FRAME AYARLARI", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 447, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("ŞİFRE DEĞİŞTİRME", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 126, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonYoneticiSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonYoneticiSilActionPerformed
        if (TableYonetici.getRowCount() == 2) {
            ButtonYoneticiSil.setVisible(false);
        } else {
            ButtonYoneticiSil.setVisible(true);
        }

        int secilenSatir = TableYonetici.getSelectedRow();
        if (secilenSatir == -1) {
            JOptionPane.showMessageDialog(null, "Lütfen bir seçim yapın");
        } else {
            int secim = JOptionPane.showConfirmDialog(null, "Emin misiniz !!!");
            if (secim == 0) {
                try {
                    String tc = TableYonetici.getValueAt(secilenSatir, 0).toString();
                    Connection con = Connecter.connect();
                    Statement st = con.createStatement();
                    st.executeUpdate("DELETE FROM logıny WHERE tc='" + tc + "'");
                    con.close();
                    yoneticiGoruntule();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Silme Hatası");
                }
            }
        }
    }//GEN-LAST:event_ButtonYoneticiSilActionPerformed

    private void ButtonYoneticiEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonYoneticiEkleActionPerformed
        String tcValue = TextFieldTc.getText();
        String tcRegex = "^[1-9][0-9]{10}$"; // TC nin 11 haneli rakamlardan oluşması beklenir
        if (!tcValue.matches(tcRegex)) {
            JOptionPane.showMessageDialog(null, "Lütfen 11 haneli bir tc giriniz", "Uyarı", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String adValue = TextFieldAd.getText();
        String adRegex = "^[A-ZÇĞİÖŞÜ][a-zçğıöşü]+$"; // isme büyük harfle başlamak için
        if (!adValue.matches(adRegex)) {
            JOptionPane.showMessageDialog(null, "Lütfen ismin sadece ilk harfini büyük giriniz", "Uyarı", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String soyadValue = TextFieldSoyad.getText();
        String soyadRegex = "^[A-ZÇĞİÖŞÜ][a-zçğıöşü]+$"; // soyisme büyük harfle başlamak için
        if (!soyadValue.matches(soyadRegex)) {
            JOptionPane.showMessageDialog(null, "Lütfen soyismin sadece ilk harfini büyük giriniz", "Uyarı", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        
        if (TableYonetici.getRowCount() >= 1) {
            ButtonYoneticiSil.setVisible(true);
        }

        String tc = TextFieldTc.getText();
        String ad = TextFieldAd.getText();
        String soyad = TextFieldSoyad.getText();
        String password = TextPasswordField1.getText();
        String sorgu = "INSERT INTO logıny(tc,ad,soyad,password)"
                + "VALUES ('" + tc + "','" + ad + "','" + soyad + "','" + password + "')";
        TextFieldTc.setText("");
        TextFieldAd.setText("");
        TextFieldSoyad.setText("");
        TextPasswordField1.setText("");
        try {
            Connection con = Connecter.connect();
            Statement st = con.createStatement();
            st.executeUpdate(sorgu);
            con.close();
            yoneticiGoruntule();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Yönetici Eklenemedi");
        }
    }//GEN-LAST:event_ButtonYoneticiEkleActionPerformed

    private void CheckBoxPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxPasswordActionPerformed
        if (CheckBoxPassword.isSelected()) {
            TextPasswordField1.setEchoChar((char) 0);
        } else
            TextPasswordField1.setEchoChar('*');
    }//GEN-LAST:event_CheckBoxPasswordActionPerformed

    private void ComboBoxRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxRedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxRedActionPerformed

    private void ComboBoxRedİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBoxRedİtemStateChanged
        r = ComboBoxRed.getSelectedIndex();
        LabelOrnek.setBackground(new Color(r, g, b));
    }//GEN-LAST:event_ComboBoxRedİtemStateChanged

    private void ComboBoxGreenİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBoxGreenİtemStateChanged
        g = ComboBoxGreen.getSelectedIndex();
        LabelOrnek.setBackground(new Color(r, g, b));
    }//GEN-LAST:event_ComboBoxGreenİtemStateChanged

    private void ComboBoxBlueİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBoxBlueİtemStateChanged
        b = ComboBoxBlue.getSelectedIndex();
        LabelOrnek.setBackground(new Color(r, g, b));
    }//GEN-LAST:event_ComboBoxBlueİtemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame5Ayarlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame5Ayarlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame5Ayarlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame5Ayarlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame5Ayarlar().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonYoneticiEkle;
    private javax.swing.JButton ButtonYoneticiSil;
    private javax.swing.JCheckBox CheckBoxPassword;
    private javax.swing.JComboBox<String> ComboBoxBlue;
    private javax.swing.JComboBox<String> ComboBoxGreen;
    private javax.swing.JComboBox<String> ComboBoxRed;
    private javax.swing.JLabel LabelOrnek;
    private javax.swing.JTable TableYonetici;
    private javax.swing.JTextField TextFieldAd;
    private javax.swing.JTextField TextFieldSoyad;
    private javax.swing.JTextField TextFieldTc;
    private javax.swing.JPasswordField TextPasswordField1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
