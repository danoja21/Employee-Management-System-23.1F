/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package employee_ms.view;

/**
 *
 * @author Thimathi
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public Dashboard() {
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
        jPanel2 = new javax.swing.JPanel();
        CreateEmployeePanel1 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtUserNameCreate1 = new javax.swing.JTextField();
        txtTelNoCreeate1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAddressCreate1 = new javax.swing.JTextPane();
        jLabel26 = new javax.swing.JLabel();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        rSPanelImage4 = new rojerusan.RSPanelImage();
        jLabel1 = new javax.swing.JLabel();
        rSMaterialButtonRectangle2 = new rojerusan.RSMaterialButtonRectangle();
        rSButtonIconD1 = new rojerusan.RSButtonIconD();
        rSButtonIconD2 = new rojerusan.RSButtonIconD();
        rSButtonIconD4 = new rojerusan.RSButtonIconD();
        rSButtonIconD3 = new rojerusan.RSButtonIconD();
        rSButtonIconD5 = new rojerusan.RSButtonIconD();
        rSButtonIconD6 = new rojerusan.RSButtonIconD();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(null);

        CreateEmployeePanel1.setBackground(new java.awt.Color(204, 255, 255));
        CreateEmployeePanel1.setLayout(null);

        jLabel29.setBackground(new java.awt.Color(0, 0, 204));
        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 102));
        jLabel29.setText("Address");
        CreateEmployeePanel1.add(jLabel29);
        jLabel29.setBounds(20, 80, 108, 22);

        jLabel30.setBackground(new java.awt.Color(0, 0, 204));
        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 102));
        jLabel30.setText("Tel.Number");
        CreateEmployeePanel1.add(jLabel30);
        jLabel30.setBounds(20, 190, 108, 22);
        CreateEmployeePanel1.add(txtUserNameCreate1);
        txtUserNameCreate1.setBounds(20, 40, 190, 22);
        CreateEmployeePanel1.add(txtTelNoCreeate1);
        txtTelNoCreeate1.setBounds(20, 220, 190, 22);

        jScrollPane3.setViewportView(txtAddressCreate1);

        CreateEmployeePanel1.add(jScrollPane3);
        jScrollPane3.setBounds(20, 110, 200, 72);

        jLabel26.setBackground(new java.awt.Color(0, 0, 204));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 102));
        jLabel26.setText("Employee ID");
        CreateEmployeePanel1.add(jLabel26);
        jLabel26.setBounds(20, 10, 109, 22);

        jPanel2.add(CreateEmployeePanel1);
        CreateEmployeePanel1.setBounds(10, 290, 230, 260);

        rSPanelImage1.setImagen(null);

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 139, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );

        jPanel2.add(rSPanelImage1);
        rSPanelImage1.setBounds(50, 80, 139, 133);

        jPanel3.setBackground(new java.awt.Color(0, 0, 153));

        jLabel25.setBackground(new java.awt.Color(0, 0, 204));
        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("User Profile");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(30, -10, 200, 70);

        jLabel28.setBackground(new java.awt.Color(0, 0, 204));
        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 102));
        jLabel28.setText("Employee Name");
        jPanel2.add(jLabel28);
        jLabel28.setBounds(30, 210, 200, 32);

        jLabel31.setBackground(new java.awt.Color(0, 0, 204));
        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 102));
        jLabel31.setText("Position");
        jPanel2.add(jLabel31);
        jLabel31.setBounds(90, 250, 108, 22);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(870, 0, 330, 660);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Administrator Dashboard");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 500, 40));

        rSPanelImage4.setImagen(null);

        javax.swing.GroupLayout rSPanelImage4Layout = new javax.swing.GroupLayout(rSPanelImage4);
        rSPanelImage4.setLayout(rSPanelImage4Layout);
        rSPanelImage4Layout.setHorizontalGroup(
            rSPanelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        rSPanelImage4Layout.setVerticalGroup(
            rSPanelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        jPanel4.add(rSPanelImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 410, 350));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrator");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        rSMaterialButtonRectangle2.setBackground(new java.awt.Color(0, 0, 153));
        rSMaterialButtonRectangle2.setText(" Employee Name");
        rSMaterialButtonRectangle2.setActionCommand("Employee Name");
        rSMaterialButtonRectangle2.setFont(new java.awt.Font("Roboto Medium", 1, 30)); // NOI18N
        rSMaterialButtonRectangle2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel4.add(rSMaterialButtonRectangle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 390, 120));

        rSButtonIconD1.setBackground(new java.awt.Color(0, 0, 153));
        rSButtonIconD1.setText("SALARY");
        rSButtonIconD1.setColorHover(new java.awt.Color(0, 51, 204));
        rSButtonIconD1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel4.add(rSButtonIconD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 270, 70));

        rSButtonIconD2.setBackground(new java.awt.Color(0, 0, 153));
        rSButtonIconD2.setText("ATTENDANCE");
        rSButtonIconD2.setColorHover(new java.awt.Color(0, 51, 204));
        rSButtonIconD2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel4.add(rSButtonIconD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 270, 70));

        rSButtonIconD4.setBackground(new java.awt.Color(0, 0, 153));
        rSButtonIconD4.setText("REPORT");
        rSButtonIconD4.setColorHover(new java.awt.Color(0, 51, 204));
        rSButtonIconD4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel4.add(rSButtonIconD4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 270, 70));

        rSButtonIconD3.setBackground(new java.awt.Color(0, 0, 153));
        rSButtonIconD3.setText("EMPLOYEE");
        rSButtonIconD3.setColorHover(new java.awt.Color(0, 51, 204));
        rSButtonIconD3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel4.add(rSButtonIconD3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 270, 70));

        rSButtonIconD5.setBackground(new java.awt.Color(0, 0, 153));
        rSButtonIconD5.setText("LEAVE");
        rSButtonIconD5.setColorHover(new java.awt.Color(0, 51, 204));
        rSButtonIconD5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel4.add(rSButtonIconD5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 270, 70));

        rSButtonIconD6.setBackground(new java.awt.Color(0, 0, 153));
        rSButtonIconD6.setText("SCHEDULE");
        rSButtonIconD6.setColorHover(new java.awt.Color(0, 51, 204));
        rSButtonIconD6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel4.add(rSButtonIconD6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 270, 70));

        jPanel1.add(jPanel4);
        jPanel4.setBounds(20, 10, 750, 610);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1144, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CreateEmployeePanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private rojerusan.RSButtonIconD rSButtonIconD1;
    private rojerusan.RSButtonIconD rSButtonIconD2;
    private rojerusan.RSButtonIconD rSButtonIconD3;
    private rojerusan.RSButtonIconD rSButtonIconD4;
    private rojerusan.RSButtonIconD rSButtonIconD5;
    private rojerusan.RSButtonIconD rSButtonIconD6;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle2;
    private rojerusan.RSPanelImage rSPanelImage1;
    private rojerusan.RSPanelImage rSPanelImage4;
    private javax.swing.JTextPane txtAddressCreate1;
    private javax.swing.JTextField txtTelNoCreeate1;
    private javax.swing.JTextField txtUserNameCreate1;
    // End of variables declaration//GEN-END:variables
}