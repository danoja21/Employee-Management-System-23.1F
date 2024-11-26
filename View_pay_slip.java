
package employee_ms.view;


public class View_pay_slip extends javax.swing.JFrame {

    /**
     * Creates new form view_paySlip
     */
    public View_pay_slip() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EarningsTable = new javax.swing.JTable();
        txt_Month = new javax.swing.JTextField();
        txt_Bank_Name = new javax.swing.JTextField();
        txt_Name = new javax.swing.JTextField();
        txt_Year = new javax.swing.JTextField();
        txt_Bank_Acc_No = new javax.swing.JTextField();
        txt_Position = new javax.swing.JTextField();
        txt_Employee_ID = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DeductionTable = new javax.swing.JTable();
        txt_Net_Salary = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(null);

        jLabel26.setBackground(new java.awt.Color(0, 0, 204));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Employee ID");
        jPanel1.add(jLabel26);
        jLabel26.setBounds(40, 150, 144, 22);

        jLabel27.setBackground(new java.awt.Color(0, 0, 204));
        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Position");
        jPanel1.add(jLabel27);
        jLabel27.setBounds(40, 180, 144, 22);

        jLabel28.setBackground(new java.awt.Color(0, 0, 204));
        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Bank Account No:");
        jPanel1.add(jLabel28);
        jLabel28.setBounds(40, 210, 144, 22);

        jLabel29.setBackground(new java.awt.Color(0, 0, 204));
        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Name");
        jPanel1.add(jLabel29);
        jLabel29.setBounds(440, 150, 110, 22);

        jLabel32.setBackground(new java.awt.Color(0, 0, 204));
        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Month");
        jPanel1.add(jLabel32);
        jLabel32.setBounds(440, 210, 110, 22);

        jLabel34.setBackground(new java.awt.Color(0, 0, 204));
        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 0));
        jLabel34.setText("Earnings");
        jPanel1.add(jLabel34);
        jLabel34.setBounds(40, 290, 144, 22);

        jLabel30.setBackground(new java.awt.Color(0, 0, 204));
        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Bank Name");
        jPanel1.add(jLabel30);
        jLabel30.setBounds(440, 180, 110, 22);

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ArchiTech CAD Academy");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(230, 20, 340, 38);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Salary Slip");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(340, 60, 170, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\Java\\EMS\\src\\OIP copy.png")); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(70, -10, 120, 130);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 800, 120);

        EarningsTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EarningsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Salary Head", "Amount"
            }
        ));
        EarningsTable.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(EarningsTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 320, 610, 130);
        jPanel1.add(txt_Month);
        txt_Month.setBounds(550, 210, 210, 22);
        jPanel1.add(txt_Bank_Name);
        txt_Bank_Name.setBounds(550, 180, 210, 22);
        jPanel1.add(txt_Name);
        txt_Name.setBounds(550, 150, 210, 22);
        jPanel1.add(txt_Year);
        txt_Year.setBounds(210, 240, 190, 22);
        jPanel1.add(txt_Bank_Acc_No);
        txt_Bank_Acc_No.setBounds(210, 210, 190, 22);
        jPanel1.add(txt_Position);
        txt_Position.setBounds(210, 180, 190, 22);
        jPanel1.add(txt_Employee_ID);
        txt_Employee_ID.setBounds(210, 150, 190, 22);

        jLabel35.setBackground(new java.awt.Color(0, 0, 204));
        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Year");
        jPanel1.add(jLabel35);
        jLabel35.setBounds(40, 240, 144, 22);

        jLabel36.setBackground(new java.awt.Color(0, 0, 204));
        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 0));
        jLabel36.setText("Deductions");
        jPanel1.add(jLabel36);
        jLabel36.setBounds(40, 450, 144, 22);

        DeductionTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DeductionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Salary Head", "Amount"
            }
        ));
        jScrollPane2.setViewportView(DeductionTable);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(40, 480, 610, 130);

        txt_Net_Salary.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txt_Net_Salary);
        txt_Net_Salary.setBounds(220, 640, 210, 30);

        jLabel37.setBackground(new java.awt.Color(0, 0, 204));
        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 0));
        jLabel37.setText("NET SALARY");
        jPanel1.add(jLabel37);
        jLabel37.setBounds(50, 640, 220, 32);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 797, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 714, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(View_pay_slip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_pay_slip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_pay_slip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_pay_slip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new View_pay_slip().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DeductionTable;
    private javax.swing.JTable EarningsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_Bank_Acc_No;
    private javax.swing.JTextField txt_Bank_Name;
    private javax.swing.JTextField txt_Employee_ID;
    private javax.swing.JTextField txt_Month;
    private javax.swing.JTextField txt_Name;
    private javax.swing.JTextField txt_Net_Salary;
    private javax.swing.JTextField txt_Position;
    private javax.swing.JTextField txt_Year;
    // End of variables declaration//GEN-END:variables
}
