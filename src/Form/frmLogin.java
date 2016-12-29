/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Form;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class frmLogin extends javax.swing.JDialog {
    Connection c = DB.getConnection();
  //  Connection c1 = DB_Report_LDC.getConnection();
    private static boolean login;
    private static String user_name;
    static String permission;
    String sql;
    String sql1;
    public frmLogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtusers = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255), 3));

        jLabel3.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jLabel3.setText("User Name:");

        jLabel4.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jLabel4.setText("Password:");

        txtusers.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        txtusers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusersActionPerformed(evt);
            }
        });

        txtpassword.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnExit.setText("Cancel");

        jButton3.setMaximumSize(new java.awt.Dimension(203, 145));
        jButton3.setMinimumSize(new java.awt.Dimension(203, 145));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtusers)
                        .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtusers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLogin)
                            .addComponent(btnExit))))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
            try {
            sql1 = "Select UserName, Password, Permision from LDCUserLogin where UserName = '"+ txtusers.getText() +"' and Password = '"+ txtpassword.getText()+"' and Status=N'IT'";
            ResultSet rs1 = c.createStatement().executeQuery(sql1);
            sql = "Select UserName, Password, Permision from LDCUserLogin where UserName = '"+ txtusers.getText() +"' and Password = '"+ txtpassword.getText()+"' and Status=N'HR'";
            ResultSet rs = c.createStatement().executeQuery(sql);
            if (rs.next()){
                frmLogin.login = true;
                frmLogin.user_name = rs.getString("UserName");
                frmLogin.permission = rs.getString("Permision");
                dispose();
                frmMain m = new frmMain();
                m.setVisible(true);  
            }      
            else if(rs1.next()){
                //if(rs1.next()){
                 frmLogin.login = true;
                frmLogin.user_name = rs1.getString("UserName");
                frmLogin.permission = rs1.getString("Permision");
                dispose();
                frmMainIT m = new frmMainIT();
                m.setVisible(true);
            }else{
                int type = JOptionPane.WARNING_MESSAGE;
                String msg = "User and password incorrect";
                String t = "Message.... ຂໍ້ຄວາມ";
                JOptionPane.showMessageDialog(this, msg, t,type);
                
                txtpassword.setText("");
                txtpassword.requestFocus();
            }
            

        } catch (Exception e) {
            //e.printStackTrace();
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        btnLoginActionPerformed(evt);
    }//GEN-LAST:event_txtpasswordActionPerformed
private BufferedImage ResizeSccall(Image im, int w, int h){
        try {
            BufferedImage buff = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
            Graphics2D g = buff.createGraphics();
            g.drawImage(im, 0, 0, w, h, null);
            g.dispose();
            return buff;
            
        } catch (Exception e) {
        }
        return null;
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            txtusers.requestFocus();
            Image im = new ImageIcon("src/icon/Login.png").getImage();
            Image icon = ResizeSccall(im, jButton3.getWidth(), jButton3.getHeight());
            jButton3.setIcon(new ImageIcon(icon));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_formWindowOpened

    private void txtusersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusersActionPerformed
        try {
            txtpassword.requestFocus();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtusersActionPerformed

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmLogin dialog = new frmLogin(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusers;
    // End of variables declaration//GEN-END:variables
}
