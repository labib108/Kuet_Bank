package netbanking;

import java.sql.*;
import javax.swing.JOptionPane;
public class Login extends javax.swing.JFrame {
    
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        loginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CardNumber = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        signInBtn = new java.awt.Button();
        clearBtn = new javax.swing.JButton();
        signUpBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        contactBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setUndecorated(true);

        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Welcome To KUET BANK");
        loginPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 420, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Card Number :");
        loginPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 170, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Pin : ");
        loginPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 60, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/banklogo-sm.png"))); // NOI18N
        loginPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        CardNumber.setBackground(new java.awt.Color(204, 204, 204));
        CardNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CardNumber.setMinimumSize(new java.awt.Dimension(65, 30));
        CardNumber.setPreferredSize(new java.awt.Dimension(65, 30));
        loginPanel.add(CardNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 260, 40));

        password.setBackground(new java.awt.Color(204, 204, 204));
        password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        password.setPreferredSize(new java.awt.Dimension(65, 30));
        loginPanel.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 260, 40));

        signInBtn.setBackground(new java.awt.Color(204, 204, 204));
        signInBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        signInBtn.setLabel("SIGN IN");
        signInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInBtnActionPerformed(evt);
            }
        });
        loginPanel.add(signInBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 70, 30));

        clearBtn.setBackground(new java.awt.Color(204, 204, 204));
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        loginPanel.add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 200, 60, -1));

        signUpBtn.setBackground(new java.awt.Color(204, 204, 204));
        signUpBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        signUpBtn.setText("SIGN UP");
        signUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBtnActionPerformed(evt);
            }
        });
        loginPanel.add(signUpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 80, 30));

        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/close-btn.png"))); // NOI18N
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        loginPanel.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 20, 20));

        contactBtn.setBackground(new java.awt.Color(204, 204, 204));
        contactBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        contactBtn.setText("Contact With Us");
        contactBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactBtnActionPerformed(evt);
            }
        });
        loginPanel.add(contactBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 160, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/wallpaperflare.com_wallpaper.jpg"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        loginPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInBtnActionPerformed
        
        connection c = new connection();
        String cardnumber = CardNumber.getText();
        String pin = password.getText();
        String query = "select * from login where cardnumber = '"+cardnumber+"'and pin = '"+pin+"'";
        try {
            ResultSet rs = c.s.executeQuery(query);
            if(rs.next()) {
                setVisible(false);
                dispose();
                new Home().setVisible(true);
            }else {
                JOptionPane.showMessageDialog(null,"Incorrect CARD NUMBER or PIN"); 
            }          
        }catch(Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_signInBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        CardNumber.setText("");
        password.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

    private void signUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpBtnActionPerformed
        setVisible(false);
        dispose();
        new CreateAccount1().setVisible(true);
    }//GEN-LAST:event_signUpBtnActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeBtnActionPerformed

    private void contactBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactBtnActionPerformed
        setVisible(false);
        dispose();
        new ContactWithUs().setVisible(true);
    }//GEN-LAST:event_contactBtnActionPerformed

    
    public static void main(String args[]) {
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login login = new Login();
                login.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CardNumber;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton contactBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPasswordField password;
    private java.awt.Button signInBtn;
    private javax.swing.JButton signUpBtn;
    // End of variables declaration//GEN-END:variables
}
