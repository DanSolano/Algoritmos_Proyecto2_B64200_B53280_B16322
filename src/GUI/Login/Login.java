/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Login;

import domain.Usuario;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import utilities.StringMD;

/**
 *
 * @author jguma
 */
public class Login extends javax.swing.JFrame {
    
    LinkedList<Usuario> operador;

    /**
     * Creates new form Login2
     */
    public Login() {
        setTitle("Movistic");
        
        setMinimumSize(new Dimension(1000, 800));
        enableEvents(MouseEvent.MOUSE_EVENT_MASK);
//        lbl_adminLog.setVisible(false);
//        this.add(new LoginPanel(), BorderLayout.EAST);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfd_UserOrEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pfd_password = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        lbl_error = new javax.swing.JLabel();
        lbl_adminLog = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.WEST);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel1.setText("Iniciar sesión");

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
        lbl_adminLog.setText("Ingresar como administrador");
        lbl_adminLog.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_adminLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_adminLogMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(73, 73, 73))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfd_UserOrEmail)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pfd_password))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(btn_login))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(lbl_error))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(lbl_adminLog)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
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

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        String pass = new String(pfd_password.getPassword()).trim();
        if (pass.equals("") || tfd_UserOrEmail.getText().isEmpty()) {
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
    }//GEN-LAST:event_btn_loginActionPerformed

    private void lbl_adminLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_adminLogMouseClicked
        LoginAdmi admi = new LoginAdmi();
        admi.setVisible(true);
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    private boolean isAgent(String sha, String userOrMail) {
        for (Usuario agent : operador) {
            if (agent.getUsuario().equals(userOrMail) && agent.getContraseña().equals(sha)) {
                //this.agentLogin = agent;
                return true;
            }
        }

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
