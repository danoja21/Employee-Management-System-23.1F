/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package employee_ms.view;

/**
 *
 * @author Thimathi
 */
public class Create_view_shedule extends javax.swing.JFrame {

    /**
     * Creates new form list_of_schedule
     */
    public Create_view_shedule() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        txtCreateEmployeeID1 = new javax.swing.JTextField();
        btnScheduleClear = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txt_Emp_Id = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_Description = new javax.swing.JTextArea();
        jLabel32 = new javax.swing.JLabel();
        btnFilter1 = new javax.swing.JButton();
        btnScheduleCreate = new javax.swing.JButton();
        dc_Last_Update = new com.toedter.calendar.JDateChooser();
        dc_Create_Date = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(null);

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Schedule ID", "Schedule Name", "Create Date", "Last Update", "Employee ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 490, 780, 210);

        jLabel26.setBackground(new java.awt.Color(0, 0, 204));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Schedule Number");
        jPanel1.add(jLabel26);
        jLabel26.setBounds(130, 440, 160, 22);

        txtCreateEmployeeID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreateEmployeeID1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtCreateEmployeeID1);
        txtCreateEmployeeID1.setBounds(300, 440, 170, 22);

        btnScheduleClear.setBackground(new java.awt.Color(0, 0, 153));
        btnScheduleClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnScheduleClear.setForeground(new java.awt.Color(255, 255, 0));
        btnScheduleClear.setText("Clear");
        btnScheduleClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScheduleClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnScheduleClear);
        btnScheduleClear.setBounds(450, 320, 90, 32);

        jLabel27.setBackground(new java.awt.Color(0, 0, 204));
        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 102));
        jLabel27.setText("Filter :");
        jPanel1.add(jLabel27);
        jLabel27.setBounds(60, 440, 97, 22);

        jLabel28.setBackground(new java.awt.Color(0, 0, 204));
        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Create Date");
        jPanel1.add(jLabel28);
        jLabel28.setBounds(90, 160, 160, 22);

        jLabel29.setBackground(new java.awt.Color(0, 0, 204));
        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Schedule Description");
        jPanel1.add(jLabel29);
        jLabel29.setBounds(90, 50, 200, 22);

        txt_Emp_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Emp_IdActionPerformed(evt);
            }
        });
        jPanel1.add(txt_Emp_Id);
        txt_Emp_Id.setBounds(310, 260, 220, 22);

        jLabel31.setBackground(new java.awt.Color(0, 0, 204));
        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Employee ID");
        jPanel1.add(jLabel31);
        jLabel31.setBounds(90, 260, 160, 22);

        txt_Description.setColumns(20);
        txt_Description.setRows(5);
        jScrollPane2.setViewportView(txt_Description);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(310, 50, 360, 86);

        jLabel32.setBackground(new java.awt.Color(0, 0, 204));
        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Updated Date");
        jPanel1.add(jLabel32);
        jLabel32.setBounds(90, 210, 160, 22);

        btnFilter1.setBackground(new java.awt.Color(0, 0, 153));
        btnFilter1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnFilter1.setForeground(new java.awt.Color(255, 255, 0));
        btnFilter1.setText("Filter");
        btnFilter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilter1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnFilter1);
        btnFilter1.setBounds(490, 440, 90, 32);

        btnScheduleCreate.setBackground(new java.awt.Color(0, 0, 153));
        btnScheduleCreate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnScheduleCreate.setForeground(new java.awt.Color(255, 255, 0));
        btnScheduleCreate.setText("Create");
        btnScheduleCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScheduleCreateActionPerformed(evt);
            }
        });
        jPanel1.add(btnScheduleCreate);
        btnScheduleCreate.setBounds(320, 320, 100, 32);
        jPanel1.add(dc_Last_Update);
        dc_Last_Update.setBounds(310, 210, 220, 30);
        jPanel1.add(dc_Create_Date);
        dc_Create_Date.setBounds(310, 160, 220, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Create  Schedule");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 10, 210, 26);

        jLabel7.setBackground(new java.awt.Color(0, 0, 153));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("View Schedule");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 390, 187, 26);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 852, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 713, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCreateEmployeeID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreateEmployeeID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreateEmployeeID1ActionPerformed

    private void btnScheduleClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScheduleClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnScheduleClearActionPerformed

    private void txt_Emp_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Emp_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Emp_IdActionPerformed

    private void btnFilter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilter1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFilter1ActionPerformed

    private void btnScheduleCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScheduleCreateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnScheduleCreateActionPerformed

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
            java.util.logging.Logger.getLogger(Create_view_shedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create_view_shedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create_view_shedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create_view_shedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create_view_shedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFilter1;
    private javax.swing.JButton btnScheduleClear;
    private javax.swing.JButton btnScheduleCreate;
    private com.toedter.calendar.JDateChooser dc_Create_Date;
    private com.toedter.calendar.JDateChooser dc_Last_Update;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCreateEmployeeID1;
    private javax.swing.JTextArea txt_Description;
    private javax.swing.JTextField txt_Emp_Id;
    // End of variables declaration//GEN-END:variables
}