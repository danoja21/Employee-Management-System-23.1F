/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package employee_ms.view;

/**
 *
 * @author Thimathi
 */
public class Training_programme extends javax.swing.JFrame {

    /**
     * Creates new form training_programme
     */
    public Training_programme() {
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

        training_programme = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtUserNameCreate1 = new javax.swing.JTextField();
        txtEmpNameCreate1 = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        txtEmpNameCreate3 = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TrainingProgramTable = new javax.swing.JTable();
        btn_View = new javax.swing.JButton();
        dt_End_Date = new com.toedter.calendar.JDateChooser();
        dc_Start_Date = new com.toedter.calendar.JDateChooser();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        training_programme.setBackground(new java.awt.Color(0, 0, 102));
        training_programme.setLayout(null);

        jLabel27.setBackground(new java.awt.Color(0, 0, 204));
        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Program ID");
        training_programme.add(jLabel27);
        jLabel27.setBounds(30, 80, 144, 22);

        jLabel28.setBackground(new java.awt.Color(0, 0, 204));
        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Program Name");
        training_programme.add(jLabel28);
        jLabel28.setBounds(30, 130, 144, 22);

        jLabel29.setBackground(new java.awt.Color(0, 0, 204));
        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Start Date");
        training_programme.add(jLabel29);
        jLabel29.setBounds(30, 180, 144, 22);

        jLabel32.setBackground(new java.awt.Color(0, 0, 204));
        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("End Date");
        training_programme.add(jLabel32);
        jLabel32.setBounds(30, 230, 144, 22);
        training_programme.add(txtUserNameCreate1);
        txtUserNameCreate1.setBounds(200, 80, 234, 22);
        training_programme.add(txtEmpNameCreate1);
        txtEmpNameCreate1.setBounds(200, 130, 234, 22);

        btnUpdate.setBackground(new java.awt.Color(0, 0, 153));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 0));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        training_programme.add(btnUpdate);
        btnUpdate.setBounds(160, 350, 130, 34);

        jLabel34.setBackground(new java.awt.Color(0, 0, 204));
        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Location");
        training_programme.add(jLabel34);
        jLabel34.setBounds(30, 280, 144, 22);
        training_programme.add(txtEmpNameCreate3);
        txtEmpNameCreate3.setBounds(200, 280, 234, 22);

        btnClear.setBackground(new java.awt.Color(0, 0, 153));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 0));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        training_programme.add(btnClear);
        btnClear.setBounds(300, 350, 130, 34);

        btnCreate.setBackground(new java.awt.Color(0, 0, 153));
        btnCreate.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 0));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        training_programme.add(btnCreate);
        btnCreate.setBounds(30, 350, 120, 34);

        TrainingProgramTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "EID", "Program ID", "Program Name", "Start Date", "End Date", "Location", "Attendance ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TrainingProgramTable);

        training_programme.add(jScrollPane1);
        jScrollPane1.setBounds(460, 10, 610, 380);

        btn_View.setBackground(new java.awt.Color(0, 0, 204));
        btn_View.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_View.setForeground(new java.awt.Color(255, 255, 0));
        btn_View.setText("View");
        training_programme.add(btn_View);
        btn_View.setBounds(700, 420, 90, 30);
        training_programme.add(dt_End_Date);
        dt_End_Date.setBounds(200, 230, 230, 22);
        training_programme.add(dc_Start_Date);
        dc_Start_Date.setBounds(200, 180, 230, 22);

        jLabel25.setBackground(new java.awt.Color(0, 0, 102));
        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText(" Training Program");
        training_programme.add(jLabel25);
        jLabel25.setBounds(0, 10, 219, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(training_programme, javax.swing.GroupLayout.DEFAULT_SIZE, 1082, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(training_programme, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateActionPerformed

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
            java.util.logging.Logger.getLogger(Training_programme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Training_programme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Training_programme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Training_programme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Training_programme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TrainingProgramTable;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btn_View;
    private com.toedter.calendar.JDateChooser dc_Start_Date;
    private com.toedter.calendar.JDateChooser dt_End_Date;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel training_programme;
    private javax.swing.JTextField txtEmpNameCreate1;
    private javax.swing.JTextField txtEmpNameCreate3;
    private javax.swing.JTextField txtUserNameCreate1;
    // End of variables declaration//GEN-END:variables
}