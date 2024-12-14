/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clinic_system;
import java.awt.*;
import java.awt.print.*;
import javax.swing.*;
import com.formdev.flatlaf.IntelliJTheme;
import java.awt.Graphics;
import java.awt.print.Printable;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class mainWindow extends javax.swing.JFrame {
    private String url = "jdbc:mysql://localhost:3306/geses";
    private String user = "root";
    private String pass = "";
    /**
     * Creates new form mainWindow
     */
    public mainWindow() {
        initComponents();
        fetchTableData();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        newRegist = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        viewList = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        printbutton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        numLabelRegestir = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        numlabelVisit = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        numSerious = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        numMildCon = new javax.swing.JLabel();
        viewList3 = new javax.swing.JButton();
        issuedmed = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        labelissuedmed = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Ormoc Campus");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(160, 40, 370, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("EASTERN VISAYAS STATE UNIVERSITY");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(160, 10, 490, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinic_system/favicon2.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(30, 0, 120, 120);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 950, 120);

        newRegist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinic_system/icons8-new-copy-80.png"))); // NOI18N
        newRegist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newRegistActionPerformed(evt);
            }
        });
        jPanel1.add(newRegist);
        newRegist.setBounds(60, 170, 80, 80);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("New Registration");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 260, 111, 20);

        viewList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinic_system/icons8-bulleted-list-100.png"))); // NOI18N
        viewList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewListActionPerformed(evt);
            }
        });
        jPanel1.add(viewList);
        viewList.setBounds(60, 300, 80, 80);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText(" health concerns");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 390, 110, 20);

        printbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinic_system/icons8-clinic-100.png"))); // NOI18N
        printbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(printbutton);
        printbutton.setBounds(60, 610, 80, 80);

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Medical Certificate Request");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 690, 180, 17);

        jLabel1.setFont(new java.awt.Font("Serif", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 153));
        jLabel1.setText("Clinic Dashboard");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(430, 120, 270, 47);

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Update Student Info");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 520, 130, 30);

        jPanel4.setBackground(new java.awt.Color(153, 255, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Registered Student");

        numLabelRegestir.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        numLabelRegestir.setForeground(new java.awt.Color(0, 0, 0));
        numLabelRegestir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numLabelRegestir.setText("100");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numLabelRegestir, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(48, 48, 48)
                .addComponent(numLabelRegestir)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(240, 170, 210, 180);

        jPanel5.setBackground(new java.awt.Color(153, 255, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Clinic Visit");

        numlabelVisit.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        numlabelVisit.setForeground(new java.awt.Color(0, 0, 0));
        numlabelVisit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numlabelVisit.setText("100");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(numlabelVisit, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(48, 48, 48)
                .addComponent(numlabelVisit)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(660, 170, 220, 180);

        jPanel6.setBackground(new java.awt.Color(153, 255, 153));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Serious Condition");

        numSerious.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        numSerious.setForeground(new java.awt.Color(0, 0, 0));
        numSerious.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numSerious.setText("100");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(numSerious, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(46, 46, 46)
                .addComponent(numSerious)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6);
        jPanel6.setBounds(660, 520, 200, 170);

        jPanel7.setBackground(new java.awt.Color(153, 255, 153));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Mild Condition");

        numMildCon.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        numMildCon.setForeground(new java.awt.Color(0, 0, 0));
        numMildCon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numMildCon.setText("100");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(50, 50, 50))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                    .addContainerGap(32, Short.MAX_VALUE)
                    .addComponent(numMildCon, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(31, 31, 31)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(143, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                    .addContainerGap(74, Short.MAX_VALUE)
                    .addComponent(numMildCon)
                    .addGap(49, 49, 49)))
        );

        jPanel1.add(jPanel7);
        jPanel7.setBounds(240, 520, 210, 170);

        viewList3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinic_system/icons8-clinic-100.png"))); // NOI18N
        viewList3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewList3ActionPerformed(evt);
            }
        });
        jPanel1.add(viewList3);
        viewList3.setBounds(60, 450, 80, 80);

        issuedmed.setBackground(new java.awt.Color(153, 255, 153));
        issuedmed.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        issuedmed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                issuedmedMouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Issued Medical  request");

        labelissuedmed.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        labelissuedmed.setForeground(new java.awt.Color(0, 0, 0));
        labelissuedmed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelissuedmed.setText("100");

        javax.swing.GroupLayout issuedmedLayout = new javax.swing.GroupLayout(issuedmed);
        issuedmed.setLayout(issuedmedLayout);
        issuedmedLayout.setHorizontalGroup(
            issuedmedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(issuedmedLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(issuedmedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelissuedmed, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        issuedmedLayout.setVerticalGroup(
            issuedmedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(issuedmedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(29, 29, 29)
                .addComponent(labelissuedmed)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel1.add(issuedmed);
        issuedmed.setBounds(460, 360, 190, 150);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(964, 762));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fetchTableData() {
        String query = "SELECT COUNT(*) AS total FROM student_reg";
        String query2 = "SELECT COUNT(*) AS total FROM medical_rec";
        String query3 = "SELECT COUNT(*) AS total FROM medical_rec WHERE `condition` = 'Serious Condition'";
        String query4 = "SELECT COUNT(*) AS total FROM medical_rec WHERE `condition` = 'Mild Condition'";
        String query5 = "SELECT COUNT(*) AS total FROM issued_medical";





        try {
            
            
            Connection conn = DriverManager.getConnection(url, user, pass);
            PreparedStatement stmt = conn.prepareStatement(query);
            PreparedStatement stmt2 = conn.prepareStatement(query2);
            PreparedStatement stmt3 = conn.prepareStatement(query3);
            PreparedStatement stmt4 = conn.prepareStatement(query4);
            PreparedStatement stmt5 = conn.prepareStatement(query5);




            ResultSet rs = stmt.executeQuery();
            ResultSet rs2 = stmt2.executeQuery();
            ResultSet rs3 = stmt3.executeQuery();
            ResultSet rs4 = stmt4.executeQuery();
            ResultSet rs5 = stmt5.executeQuery();



        
        

            if (rs.next()&& rs2.next() && rs3.next() && rs4.next() && rs5.next()) {
                // Retrieve the count from the result set
                int count = rs.getInt("total");
                // Display only the count on the label
                this.numLabelRegestir.setText(String.valueOf(count));
                
                int count2 = rs2.getInt("total");
                // Display only the count on the label
                this.numlabelVisit.setText(String.valueOf(count2));
//                numLabelRegestir.setText("iquen");
                int count3 = rs3.getInt("total");
                this.numSerious.setText(String.valueOf(count3));
                
                int count4 = rs4.getInt("total");
                this.numMildCon.setText(String.valueOf(count4));
                
                int count5 = rs5.getInt("total");
                this.labelissuedmed.setText(String.valueOf(count5));
            }

        } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this,
                "ERROR: " + e.getMessage(),
                "Database Error",
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }


    private void newRegistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newRegistActionPerformed
        // TODO add your handling code here:
        new student_registration().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_newRegistActionPerformed

    private void viewListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewListActionPerformed
        // TODO add your handling code here:
        new viewList().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_viewListActionPerformed

    private void viewList3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewList3ActionPerformed
        // TODO add your handling code here:
        new studentInfoWindow().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_viewList3ActionPerformed

    private void printbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printbuttonActionPerformed
        // TODO add your handling code here:
        new MedicalCerWin().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_printbuttonActionPerformed

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        System.out.println("enter");
        new StudnetRecWindow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
        new VisitRecWin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        // TODO add your handling code here:
        new mildRecwin().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        // TODO add your handling code here:
        new seriousRecwin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel6MouseClicked

    private void issuedmedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_issuedmedMouseClicked
        // TODO add your handling code here:
        new medicalRecCer().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_issuedmedMouseClicked

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
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        IntelliJTheme.setup(mainWindow.class.getResourceAsStream("/nord.theme.json"));
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainWindow().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel issuedmed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel labelissuedmed;
    private javax.swing.JButton newRegist;
    private javax.swing.JLabel numLabelRegestir;
    private javax.swing.JLabel numMildCon;
    private javax.swing.JLabel numSerious;
    private javax.swing.JLabel numlabelVisit;
    private javax.swing.JButton printbutton;
    private javax.swing.JButton viewList;
    private javax.swing.JButton viewList3;
    // End of variables declaration//GEN-END:variables
}
