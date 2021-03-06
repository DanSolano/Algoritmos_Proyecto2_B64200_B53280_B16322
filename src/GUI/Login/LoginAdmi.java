/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Login;

import GUI.AdminModule.AdminModule;
import Domain.Usuario;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import Utilities.StringMD;

/**
 *
 * @author jguma
 */
public class LoginAdmi extends javax.swing.JFrame {
    LinkedList<Usuario> admin;

    /**
     * Creates new form SignUp
     */
    public LoginAdmi() {
        setTitle("Movistic");
        setMinimumSize(new Dimension(1000, 800));
        enableEvents(MouseEvent.MOUSE_EVENT_MASK);
        setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfd_UserOrEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pfd_password = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        lbl_error = new javax.swing.JLabel();
        lbl_adminLog = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 800));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel1.setText("Iniciar como administrador");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel2.setText("Email o nombre de usuario");

        tfd_UserOrEmail.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel3.setText("Contraseña");

        pfd_password.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N

        btn_login.setBackground(new java.awt.Color(124, 77, 255));
        btn_login.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Ingresar");
        btn_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        lbl_error.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        lbl_adminLog.setBackground(new java.awt.Color(117, 117, 117));
        lbl_adminLog.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lbl_adminLog.setForeground(new java.awt.Color(117, 117, 117));
        lbl_adminLog.setText("Ingresar como operador");
        lbl_adminLog.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_adminLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_adminLogMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfd_UserOrEmail)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(pfd_password)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(lbl_error)
                        .addGap(116, 242, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_login)
                        .addGap(137, 137, 137)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(lbl_adminLog)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(tfd_UserOrEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(pfd_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_login)
                .addGap(18, 18, 18)
                .addComponent(lbl_error)
                .addGap(18, 18, 18)
                .addComponent(lbl_adminLog)
                .addContainerGap(467, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setMinimumSize(new java.awt.Dimension(700, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(700, 800));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.WEST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        String pass = new String(pfd_password.getPassword()).trim();
        if (pass.equals("") || tfd_UserOrEmail.getText().isEmpty()) {
            //JOptionPane.showMessageDialog(null, "", "Error", JOptionPane.ERROR_MESSAGE);
            lbl_error.setText("<html><font color=\"#FE0101\"><u>" + "Ingrese usuario y contraseña." + "</u></font></html>");//#FF000

        } else {
            String sha = StringMD.getStringMessageDigest(pass, StringMD.SHA512);
            String userOrMail = tfd_UserOrEmail.getText().trim();
            if (isAgent(sha, userOrMail)) {
                this.dispose();
                //Abrir la ventana que corresponde
            } else {
                lbl_error.setText("<html><font color=\"#FE0101\"><u>" + "Usuario y contraseña no coinciden." + "</u></font></html>");//#FF000
            }
        }
        this.dispose();
        AdminModule adminModule = new AdminModule();
        adminModule.setVisible(true);
    }//GEN-LAST:event_btn_loginActionPerformed

    private void lbl_adminLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_adminLogMouseClicked
            Login login = new Login();
            login.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_lbl_adminLogMouseClicked

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
            java.util.logging.Logger.getLogger(LoginAdmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAdmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAdmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAdmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginAdmi().setVisible(true);
            }
        });
    }
    
    private boolean isAgent(String sha, String userOrMail) {
//        for (Usuario admin : admin) {
//            if (admin.getUsuario().equals(userOrMail) && admin.getContraseña().equals(sha)) {
//                return true;
//            }
//        }
//
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_adminLog;
    private javax.swing.JLabel lbl_error;
    private javax.swing.JPasswordField pfd_password;
    private javax.swing.JTextField tfd_UserOrEmail;
    // End of variables declaration//GEN-END:variables
}
