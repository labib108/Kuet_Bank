package netbanking;

public class ContactWithUs extends javax.swing.JFrame {

    public ContactWithUs() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sendEmailBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        callBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();
        goBackBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("I am prossional Java developer");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 250, 32));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("working in a real time banking");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 270, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("project. This project is one of");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 250, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("my java project.");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 270, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("E-mail : abubuckkersiddikh@gmail.com");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 320, -1));

        sendEmailBtn.setBackground(new java.awt.Color(25, 34, 41));
        sendEmailBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sendEmailBtn.setForeground(new java.awt.Color(204, 204, 204));
        sendEmailBtn.setText("Send Email");
        sendEmailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendEmailBtnActionPerformed(evt);
            }
        });
        getContentPane().add(sendEmailBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 120, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Phone : 0172084**51");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 190, -1));

        callBtn.setBackground(new java.awt.Color(25, 34, 41));
        callBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        callBtn.setForeground(new java.awt.Color(204, 204, 204));
        callBtn.setText("Call Now");
        getContentPane().add(callBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 120, 30));

        backBtn.setBackground(new java.awt.Color(25, 34, 41));
        backBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(204, 204, 204));
        backBtn.setText("Back");
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 120, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/mypic1-removebg-preview 4.png"))); // NOI18N
        jLabel8.setPreferredSize(new java.awt.Dimension(250, 250));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 170, 180));

        exitBtn.setBackground(new java.awt.Color(255, 0, 51));
        exitBtn.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/close-btn.png"))); // NOI18N
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 30, 30));

        goBackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/goback.png"))); // NOI18N
        goBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(goBackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        jLabel1.setBackground(new java.awt.Color(27, 40, 46));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bg1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        setVisible(false);
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void goBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackBtnActionPerformed
        setVisible(false);
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_goBackBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void sendEmailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendEmailBtnActionPerformed

    }//GEN-LAST:event_sendEmailBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ContactWithUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContactWithUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContactWithUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContactWithUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContactWithUs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton callBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton goBackBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton sendEmailBtn;
    // End of variables declaration//GEN-END:variables
}
