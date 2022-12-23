package netbanking;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author labib
 */
public class CreateAccount extends javax.swing.JFrame {

    public CreateAccount() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Gender = new javax.swing.ButtonGroup();
        MaritalStatus = new javax.swing.ButtonGroup();
        createAccountPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fatherName = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        Address = new javax.swing.JTextField();
        motherName = new javax.swing.JTextField();
        Married = new javax.swing.JRadioButton();
        Unmarried = new javax.swing.JRadioButton();
        Others = new javax.swing.JRadioButton();
        Email = new javax.swing.JTextField();
        Nationality = new javax.swing.JTextField();
        Register = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        Male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();
        Date = new com.toedter.calendar.JDateChooser();
        AccountType = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        terms1 = new javax.swing.JCheckBox();
        terms2 = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();
        Balance = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createAccountPanel.setBackground(new java.awt.Color(255, 255, 204));
        createAccountPanel.setPreferredSize(new java.awt.Dimension(700, 800));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setText("Application Form");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Page 1 : Personal Details");

        fatherName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        Name.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        Address.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        motherName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        Married.setBackground(new java.awt.Color(255, 255, 204));
        MaritalStatus.add(Married);
        Married.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Married.setText("Married");
        Married.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarriedActionPerformed(evt);
            }
        });

        Unmarried.setBackground(new java.awt.Color(255, 255, 204));
        MaritalStatus.add(Unmarried);
        Unmarried.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Unmarried.setText("Unmarried");

        Others.setBackground(new java.awt.Color(255, 255, 204));
        MaritalStatus.add(Others);
        Others.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Others.setText("Others");

        Email.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        Nationality.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        Register.setBackground(new java.awt.Color(0, 153, 0));
        Register.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Register.setForeground(new java.awt.Color(255, 255, 255));
        Register.setText("Register");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });

        clearBtn.setBackground(new java.awt.Color(255, 102, 102));
        clearBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(255, 255, 204));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/goback.png"))); // NOI18N
        backBtn.setBorder(null);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        Male.setBackground(new java.awt.Color(255, 255, 204));
        Gender.add(Male);
        Male.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Male.setText("Male");

        Female.setBackground(new java.awt.Color(255, 255, 204));
        Gender.add(Female);
        Female.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Female.setText("Female");

        Date.setBackground(new java.awt.Color(255, 255, 204));

        AccountType.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        AccountType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Current account", "Savings account", "Fixed deposit account", "Salary account", "FCNR account" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Name : ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Father Name :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Mother Name :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Date of Birth :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText(" Gender :");
        jLabel7.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Marital Status :");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Account Type :");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setText("Address :");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setText("Nationality :");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel12.setText("E-mail :");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel13.setText("Card Number :");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setText("1907-XXXX-XXXX-3495");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel15.setText("Pin :");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel16.setText("XXXXX");

        terms1.setBackground(new java.awt.Color(255, 255, 204));
        terms1.setText("I hearby declare that all the information above in currect of the best of my knowlwdge");
        terms1.setActionCommand("I hearby declare that all the information above in currect to the best of my knowledge\n");

        terms2.setBackground(new java.awt.Color(255, 255, 204));
        terms2.setText("I have read the Terms and Condition and accept all Terms and Condition\n");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel17.setText("Balance :");

        Balance.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        javax.swing.GroupLayout createAccountPanelLayout = new javax.swing.GroupLayout(createAccountPanel);
        createAccountPanel.setLayout(createAccountPanelLayout);
        createAccountPanelLayout.setHorizontalGroup(
            createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createAccountPanelLayout.createSequentialGroup()
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createAccountPanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(terms2)
                            .addGroup(createAccountPanelLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14))
                            .addGroup(createAccountPanelLayout.createSequentialGroup()
                                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel17))
                                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(createAccountPanelLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Name, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                                            .addComponent(fatherName, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                                            .addComponent(motherName, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                                            .addComponent(Date, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                                            .addGroup(createAccountPanelLayout.createSequentialGroup()
                                                .addComponent(Male)
                                                .addGap(18, 18, 18)
                                                .addComponent(Female))
                                            .addComponent(AccountType, 0, 305, Short.MAX_VALUE)
                                            .addComponent(Address, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                                            .addComponent(Nationality, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                                            .addComponent(Email, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                                            .addComponent(Balance)))
                                    .addGroup(createAccountPanelLayout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel16))))
                            .addComponent(terms1)))
                    .addGroup(createAccountPanelLayout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(createAccountPanelLayout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(Married)
                                .addGap(18, 18, 18)
                                .addComponent(Unmarried)
                                .addGap(18, 18, 18)
                                .addComponent(Others))
                            .addGroup(createAccountPanelLayout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jLabel1))))
                    .addGroup(createAccountPanelLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel2))
                    .addGroup(createAccountPanelLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(clearBtn)
                        .addGap(145, 145, 145)
                        .addComponent(Register)))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        createAccountPanelLayout.setVerticalGroup(
            createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createAccountPanelLayout.createSequentialGroup()
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn)
                    .addGroup(createAccountPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(1, 1, 1)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(createAccountPanelLayout.createSequentialGroup()
                        .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(fatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))
                    .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(motherName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Female)
                    .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(Male)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Married)
                    .addComponent(Unmarried)
                    .addComponent(jLabel8)
                    .addComponent(Others))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(AccountType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nationality, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Balance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addComponent(terms1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(terms2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearBtn)
                    .addComponent(Register))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createAccountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createAccountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        setVisible(false);
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        Name.setText("");
        fatherName.setText("");
        motherName.setText("");
        Date.setDate(null);
        Address.setText("");
        Nationality.setText("");
        Email.setText("");
        Balance.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        String username = Name.getText();
        String fathername = fatherName.getText();
        String mothername = motherName.getText();
        String dob  = "" + Date.getDate();
        String gender = null;
        if(Male.isSelected()){
            gender = "Male";
        }else if(Female.isSelected()){
            gender = "Female";
        }
        String maritalstatus = null;
        if(Married.isSelected()){
            maritalstatus = "Married";
        }else if(Unmarried.isSelected()){
            maritalstatus = "Unmarried";
        }else if(Others.isSelected()){
            maritalstatus = "Others";
        }
        String accounttype = (String)AccountType.getSelectedItem();
        String address = Address.getText();
        String nationality = Nationality.getText();
        String email = Email.getText();
        String balance = Balance.getText();
        Random random = new Random();
        String cardnumber = null;
        String pin = null;
        if(Name.equals("")) {
                JOptionPane.showMessageDialog(null,"Name is required");
            }else {
            cardnumber ="" + 19071080 +  Math.abs(random.nextLong()%90000000);
            pin = "" + Math.abs(random.nextInt(100000-999)+999);
        }
           
        try{
            connection c = new connection();
            String query = "insert into signup values('"+username+"','"+fathername+"','"+mothername+"','"+dob+"','"+gender+"','"+maritalstatus+"','"+accounttype+"','"+address+"','"+nationality+"','"+email+"','"+cardnumber+"','"+pin+"','"+balance+"') ";
            c.s.executeUpdate(query);
        }catch(Exception e) {
            System.out.println(e);
        }
        JOptionPane.showMessageDialog(null,"Your CARD NUMBER is : " + cardnumber + "\nYour PIN NUMBER is : " + pin + "\nPlease save your CARD NUMBER and PIN for further use");
        setVisible(false);
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_RegisterActionPerformed

    private void MarriedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarriedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MarriedActionPerformed

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
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AccountType;
    private javax.swing.JTextField Address;
    private javax.swing.JTextField Balance;
    private com.toedter.calendar.JDateChooser Date;
    private javax.swing.JTextField Email;
    private javax.swing.JRadioButton Female;
    private javax.swing.ButtonGroup Gender;
    private javax.swing.JRadioButton Male;
    private javax.swing.ButtonGroup MaritalStatus;
    private javax.swing.JRadioButton Married;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Nationality;
    private javax.swing.JRadioButton Others;
    private javax.swing.JButton Register;
    private javax.swing.JRadioButton Unmarried;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JPanel createAccountPanel;
    private javax.swing.JTextField fatherName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField motherName;
    private javax.swing.JCheckBox terms1;
    private javax.swing.JCheckBox terms2;
    // End of variables declaration//GEN-END:variables
}
