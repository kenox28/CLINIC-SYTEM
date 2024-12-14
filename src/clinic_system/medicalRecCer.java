/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clinic_system;

import com.formdev.flatlaf.IntelliJTheme;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class medicalRecCer extends javax.swing.JFrame {
    private String url = "jdbc:mysql://localhost:3306/geses";
    private String user = "root";
    private String pass = "";
    /**
     * Creates new form medicalRecCer
     */
    public medicalRecCer() {
        initComponents();
        fetchTableData();
    }
    private void fetchTableData() {
        DefaultTableModel model = (DefaultTableModel) tableRecords.getModel();
        model.setRowCount(0); // Clear existing rows

        String query = "SELECT id , fullname, diagnosis,physician,physician_num,dateadded FROM issued_medical";

        try (Connection conn = DriverManager.getConnection(url, user, pass); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Object[] row = {
                    rs.getInt("id"),
                    rs.getString("fullname"), 
                    rs.getString("diagnosis"),
                    rs.getString("physician"),
                    rs.getString("physician_num"),
                    rs.getString("dateadded"),


                    
                };
                model.addRow(row); // Add the row to the table model
            }

        } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Error fetching data: " + e.getMessage(),
                    "Database Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
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
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRecords = new javax.swing.JTable();
        seachfield = new javax.swing.JTextField();
        Searchbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(153, 255, 153));
        jPanel4.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Ormoc Campus");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(160, 40, 370, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("EASTERN VISAYAS STATE UNIVERSITY");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(160, 10, 490, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinic_system/favicon2.png"))); // NOI18N
        jLabel9.setText("jLabel7");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(30, 0, 120, 120);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinic_system/icons8-back-arrow-50.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3);
        jButton3.setBounds(1030, 20, 56, 40);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 120));

        tableRecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "fullname", "Syntoms", "Recent Medication", "treatment Given", "Conditon", "DateAdded"
            }
        ));
        jScrollPane1.setViewportView(tableRecords);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 1080, 400));

        seachfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seachfieldActionPerformed(evt);
            }
        });
        jPanel1.add(seachfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, 290, 30));

        Searchbtn.setBackground(new java.awt.Color(0, 255, 255));
        Searchbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Searchbtn.setText("Seach");
        Searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchbtnActionPerformed(evt);
            }
        });
        jPanel1.add(Searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 130, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        mainWindow num = new mainWindow();
        num.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void seachfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seachfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seachfieldActionPerformed

    private void SearchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchbtnActionPerformed
        // TODO add your handling code here:
        String searchText = seachfield.getText().trim(); // Get text from search field
        DefaultTableModel model = (DefaultTableModel) tableRecords.getModel();
        model.setRowCount(0); // Clear existing rows

        String query = "SELECT id, fullname, diagnosis, physician, physician_num, dateAdded " +
        "FROM issued_medical WHERE fullname LIKE ? OR diagnosis LIKE ? OR physician LIKE ? OR physician_num LIKE ?";

        try (Connection conn = DriverManager.getConnection(url, user, pass); PreparedStatement stmt = conn.prepareStatement(query)) {

            // Set search text for the query
            String searchPattern = "%" + searchText + "%";
            stmt.setString(1, searchPattern); // Search in 'fullname'
            stmt.setString(2, searchPattern); // Search in 'studeid'
            stmt.setString(3, searchPattern); // Search in 'studeid'
            stmt.setString(4, searchPattern); // Search in 'studeid'

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Object[] row = {
                        rs.getInt("id"),
                        rs.getString("fullname"),
                        rs.getString("diagnosis"),
                        rs.getString("physician"),
                        rs.getString("physician_num"),
                        rs.getString("dateAdded"),
                    };
                    model.addRow(row); // Add the filtered rows to the table model
                }
            }

            // Show a message if no records are found
            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "No matching records found.", "Search Result", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_SearchbtnActionPerformed

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
            java.util.logging.Logger.getLogger(medicalRecCer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(medicalRecCer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(medicalRecCer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(medicalRecCer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        IntelliJTheme.setup(mainWindow.class.getResourceAsStream("/nord.theme.json"));

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new medicalRecCer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Searchbtn;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField seachfield;
    private javax.swing.JTable tableRecords;
    // End of variables declaration//GEN-END:variables
}
