/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package employee_ms.view;

/**
 *
 * @author Thimathi
 */
public class Payroll_process extends javax.swing.JFrame {

    /**
     * Creates new form payroll_process
     */
    public Payroll_process() {
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
        CreateEmployeePanel1 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txt_Employee_ID = new javax.swing.JTextField();
        txt_Employee_Name = new javax.swing.JTextField();
        txt_Employee_Type = new javax.swing.JTextField();
        txt_Total_Salary = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txt_Month = new javax.swing.JTextField();
        txt_Year = new javax.swing.JTextField();
        txt_Basic_Salary = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txt_Hour_Rate = new javax.swing.JTextField();
        txt_Working_Days = new javax.swing.JTextField();
        txt_OT_Hours = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txt_Tax_Amount = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        btnCalculate1 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        txt_Incentive = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txt_ETF = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txt_EPF = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(null);

        CreateEmployeePanel1.setBackground(new java.awt.Color(0, 0, 102));
        CreateEmployeePanel1.setLayout(null);

        jLabel26.setBackground(new java.awt.Color(0, 0, 204));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Employee ID");
        CreateEmployeePanel1.add(jLabel26);
        jLabel26.setBounds(20, 30, 144, 25);

        jLabel27.setBackground(new java.awt.Color(0, 0, 204));
        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Employee Name");
        CreateEmployeePanel1.add(jLabel27);
        jLabel27.setBounds(20, 60, 144, 25);

        jLabel28.setBackground(new java.awt.Color(0, 0, 204));
        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Position");
        CreateEmployeePanel1.add(jLabel28);
        jLabel28.setBounds(20, 90, 144, 25);

        jLabel29.setBackground(new java.awt.Color(0, 0, 204));
        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Month");
        CreateEmployeePanel1.add(jLabel29);
        jLabel29.setBounds(20, 120, 144, 25);

        jLabel32.setBackground(new java.awt.Color(0, 0, 204));
        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Gross Salary");
        CreateEmployeePanel1.add(jLabel32);
        jLabel32.setBounds(20, 180, 144, 25);

        jLabel33.setBackground(new java.awt.Color(0, 0, 204));
        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Hour Rate");
        CreateEmployeePanel1.add(jLabel33);
        jLabel33.setBounds(57, 338, 144, 25);

        txt_Employee_ID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_Employee_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Employee_IDActionPerformed(evt);
            }
        });
        CreateEmployeePanel1.add(txt_Employee_ID);
        txt_Employee_ID.setBounds(260, 30, 213, 26);

        txt_Employee_Name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel1.add(txt_Employee_Name);
        txt_Employee_Name.setBounds(260, 60, 213, 26);

        txt_Employee_Type.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel1.add(txt_Employee_Type);
        txt_Employee_Type.setBounds(260, 90, 213, 26);

        txt_Total_Salary.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel1.add(txt_Total_Salary);
        txt_Total_Salary.setBounds(260, 480, 213, 26);

        btnCalculate.setBackground(new java.awt.Color(0, 0, 204));
        btnCalculate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCalculate.setForeground(new java.awt.Color(255, 255, 0));
        btnCalculate.setText("Calculate");
        btnCalculate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });
        CreateEmployeePanel1.add(btnCalculate);
        btnCalculate.setBounds(260, 520, 100, 30);

        jLabel34.setBackground(new java.awt.Color(0, 0, 204));
        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Bonus");
        CreateEmployeePanel1.add(jLabel34);
        jLabel34.setBounds(20, 210, 144, 25);

        jLabel35.setBackground(new java.awt.Color(0, 0, 204));
        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Time Worked");
        CreateEmployeePanel1.add(jLabel35);
        jLabel35.setBounds(20, 250, 144, 25);

        jLabel36.setBackground(new java.awt.Color(0, 0, 204));
        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Working Days");
        CreateEmployeePanel1.add(jLabel36);
        jLabel36.setBounds(57, 275, 144, 25);

        txt_Month.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel1.add(txt_Month);
        txt_Month.setBounds(260, 120, 213, 26);

        txt_Year.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel1.add(txt_Year);
        txt_Year.setBounds(260, 150, 213, 26);

        txt_Basic_Salary.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel1.add(txt_Basic_Salary);
        txt_Basic_Salary.setBounds(260, 180, 213, 26);

        jLabel37.setBackground(new java.awt.Color(0, 0, 204));
        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("OT Houres");
        CreateEmployeePanel1.add(jLabel37);
        jLabel37.setBounds(57, 309, 144, 25);

        txt_Hour_Rate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel1.add(txt_Hour_Rate);
        txt_Hour_Rate.setBounds(260, 340, 141, 26);

        txt_Working_Days.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel1.add(txt_Working_Days);
        txt_Working_Days.setBounds(260, 280, 141, 26);

        txt_OT_Hours.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel1.add(txt_OT_Hours);
        txt_OT_Hours.setBounds(260, 310, 141, 26);

        jLabel38.setBackground(new java.awt.Color(0, 0, 204));
        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("ETF");
        CreateEmployeePanel1.add(jLabel38);
        jLabel38.setBounds(20, 380, 144, 25);

        txt_Tax_Amount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel1.add(txt_Tax_Amount);
        txt_Tax_Amount.setBounds(260, 430, 213, 26);

        jLabel39.setBackground(new java.awt.Color(0, 0, 204));
        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Total Salary");
        CreateEmployeePanel1.add(jLabel39);
        jLabel39.setBounds(10, 470, 225, 40);

        btnCalculate1.setBackground(new java.awt.Color(0, 0, 204));
        btnCalculate1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCalculate1.setForeground(new java.awt.Color(255, 255, 0));
        btnCalculate1.setText("Clear");
        btnCalculate1.setActionCommand("cLEAR");
        btnCalculate1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCalculate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculate1ActionPerformed(evt);
            }
        });
        CreateEmployeePanel1.add(btnCalculate1);
        btnCalculate1.setBounds(390, 520, 90, 30);

        jLabel30.setBackground(new java.awt.Color(0, 0, 204));
        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Year");
        CreateEmployeePanel1.add(jLabel30);
        jLabel30.setBounds(20, 150, 144, 25);

        txt_Incentive.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel1.add(txt_Incentive);
        txt_Incentive.setBounds(260, 210, 213, 26);

        jLabel40.setBackground(new java.awt.Color(0, 0, 204));
        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("EPF");
        CreateEmployeePanel1.add(jLabel40);
        jLabel40.setBounds(20, 400, 144, 25);

        txt_ETF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel1.add(txt_ETF);
        txt_ETF.setBounds(260, 370, 213, 26);

        jLabel41.setBackground(new java.awt.Color(0, 0, 204));
        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Tax Amount");
        CreateEmployeePanel1.add(jLabel41);
        jLabel41.setBounds(20, 420, 144, 25);

        txt_EPF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel1.add(txt_EPF);
        txt_EPF.setBounds(260, 400, 213, 26);

        jPanel1.add(CreateEmployeePanel1);
        CreateEmployeePanel1.setBounds(10, 70, 560, 660);

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Salary Calculation");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 10, 340, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 777, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_Employee_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Employee_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Employee_IDActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        double basicSalary;
        double incentive;
        double workingDays;
        double hours;
        double hourRate;
        double etf;
        double EPF;
        double TaxAmount;
        double totalSalary;

        basicSalary = Double.valueOf(txt_Basic_Salary.getText());
        incentive = Double.parseDouble(txt_Incentive.getText());
        workingDays =  Double.parseDouble(txt_Working_Days.getText());
        hours = Double.parseDouble(txt_OT_Hours.getText());
        hourRate  = Double.parseDouble(txt_Hour_Rate.getText());
        etf  = Double.parseDouble(txt_ETF.getText());
        EPF = Double.parseDouble(txt_EPF.getText());
        TaxAmount  = Double.parseDouble(txt_Tax_Amount.getText());
        totalSalary = Double.parseDouble(txt_Total_Salary.getText());
        if(basicSalary>100000){
            txt_Tax_Amount.setVisible(true);
            totalSalary = basicSalary + incentive - (etf+EPF+TaxAmount) + (workingDays * hourRate * hours);
        }
        else{
            txt_Tax_Amount.setVisible(false);
            totalSalary  = basicSalary + incentive - (etf+EPF) + (workingDays * hourRate * hours);
        }

        String totSal = Double.toString(totalSalary);
        txt_Total_Salary.setText(totSal);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnCalculate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalculate1ActionPerformed

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
            java.util.logging.Logger.getLogger(Payroll_process.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payroll_process.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payroll_process.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payroll_process.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payroll_process().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CreateEmployeePanel1;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnCalculate1;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_Basic_Salary;
    private javax.swing.JTextField txt_EPF;
    private javax.swing.JTextField txt_ETF;
    private javax.swing.JTextField txt_Employee_ID;
    private javax.swing.JTextField txt_Employee_Name;
    private javax.swing.JTextField txt_Employee_Type;
    private javax.swing.JTextField txt_Hour_Rate;
    private javax.swing.JTextField txt_Incentive;
    private javax.swing.JTextField txt_Month;
    private javax.swing.JTextField txt_OT_Hours;
    private javax.swing.JTextField txt_Tax_Amount;
    private javax.swing.JTextField txt_Total_Salary;
    private javax.swing.JTextField txt_Working_Days;
    private javax.swing.JTextField txt_Year;
    // End of variables declaration//GEN-END:variables
}