package netbanking;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author labib
 */
public class CreateAccount2 extends javax.swing.JFrame {

    public CreateAccount2(String email) {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ExixtingAccount = new javax.swing.ButtonGroup();
        createAccountPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Income = new javax.swing.JTextField();
        Occupation = new javax.swing.JTextField();
        NidNumber = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        AccountType = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Catagory = new javax.swing.JTextField();
        yes = new javax.swing.JRadioButton();
        no = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        terms1 = new javax.swing.JCheckBox();
        terms2 = new javax.swing.JCheckBox();
        CancelBtn = new javax.swing.JButton();
        registerBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createAccountPanel.setBackground(new java.awt.Color(255, 255, 255));
        createAccountPanel.setForeground(new java.awt.Color(0, 0, 0));
        createAccountPanel.setPreferredSize(new java.awt.Dimension(700, 800));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Application Form");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Page 2 : Bank Details");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Occupation : ");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText(" Income : ");

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Account Type :");

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Exixting Account :");

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("NID Number :");

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("XXXXX");

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("PIN Number : ");

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("XXXX-XXXX-XXXX-4524");

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Card Number :");

        Income.setBackground(new java.awt.Color(255, 255, 255));
        Income.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Income.setForeground(new java.awt.Color(0, 0, 0));

        Occupation.setBackground(new java.awt.Color(255, 255, 255));
        Occupation.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Occupation.setForeground(new java.awt.Color(0, 0, 0));

        NidNumber.setBackground(new java.awt.Color(255, 255, 255));
        NidNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NidNumber.setForeground(new java.awt.Color(0, 0, 0));

        backBtn.setBackground(new java.awt.Color(255, 255, 255));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/goback.png"))); // NOI18N
        backBtn.setBorder(null);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        AccountType.setBackground(new java.awt.Color(255, 255, 255));
        AccountType.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AccountType.setForeground(new java.awt.Color(0, 0, 0));
        AccountType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Current account", "Savings account", "Fixed deposit account", "Salary account", "FCNR account" }));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Catagory :");

        Catagory.setBackground(new java.awt.Color(255, 255, 255));
        Catagory.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Catagory.setForeground(new java.awt.Color(0, 0, 0));

        yes.setBackground(new java.awt.Color(255, 255, 255));
        ExixtingAccount.add(yes);
        yes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        yes.setForeground(new java.awt.Color(0, 0, 0));
        yes.setText("Yes");

        no.setBackground(new java.awt.Color(255, 255, 255));
        ExixtingAccount.add(no);
        no.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        no.setForeground(new java.awt.Color(0, 0, 0));
        no.setText("No");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Your 16 digit Card Number");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Your 5 digit Pin Number");

        terms1.setBackground(new java.awt.Color(255, 255, 255));
        terms1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        terms1.setForeground(new java.awt.Color(0, 0, 0));
        terms1.setText("I hearby declare that all the information above in currect of the best of my knowlwdge");
        terms1.setActionCommand("I hearby declare that all the information above in currect to the best of my knowledge\n");

        terms2.setBackground(new java.awt.Color(255, 255, 255));
        terms2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        terms2.setForeground(new java.awt.Color(0, 0, 0));
        terms2.setText("I have read the Terms and Condition and accept all Terms and Condition\n");

        CancelBtn.setBackground(new java.awt.Color(204, 204, 204));
        CancelBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CancelBtn.setForeground(new java.awt.Color(0, 0, 0));
        CancelBtn.setText("Cancel");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

        registerBtn.setBackground(new java.awt.Color(204, 204, 204));
        registerBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        registerBtn.setForeground(new java.awt.Color(0, 0, 0));
        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout createAccountPanelLayout = new javax.swing.GroupLayout(createAccountPanel);
        createAccountPanel.setLayout(createAccountPanelLayout);
        createAccountPanelLayout.setHorizontalGroup(
            createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createAccountPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(234, 234, 234))
            .addGroup(createAccountPanelLayout.createSequentialGroup()
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(createAccountPanelLayout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(terms2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel17)
                            .addGroup(createAccountPanelLayout.createSequentialGroup()
                                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel21))
                                .addGap(32, 32, 32)
                                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel22)
                                    .addComponent(AccountType, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Income, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                                        .addComponent(jLabel1)
                                        .addComponent(Occupation, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                                        .addComponent(Catagory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE))
                                    .addComponent(NidNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(createAccountPanelLayout.createSequentialGroup()
                                        .addComponent(yes)
                                        .addGap(48, 48, 48)
                                        .addComponent(no))))
                            .addComponent(terms1)))
                    .addGroup(createAccountPanelLayout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(CancelBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(registerBtn)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        createAccountPanelLayout.setVerticalGroup(
            createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createAccountPanelLayout.createSequentialGroup()
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Occupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(Income, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Catagory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccountType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(NidNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(yes)
                    .addComponent(no))
                .addGap(18, 18, 18)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(60, 60, 60)
                .addComponent(terms1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(terms2)
                .addGap(35, 35, 35)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelBtn)
                    .addComponent(registerBtn))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createAccountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        new CreateAccount1().setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        setVisible(false);
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        String occupation = Occupation.getText();
        String income = Income.getText();
        String catagory = Catagory.getText();
        String accounttype = (String)AccountType.getSelectedItem();
        String nid = NidNumber.getText();
        String existingaccount = null;
        if(yes.isSelected()){
            existingaccount = "Yes";
        }else if(no.isSelected()){
            existingaccount = "No";
        }
        
        Random random = new Random();
        String cardnumber ="" + 19071080 +  Math.abs(random.nextLong()%90000000);
        String pin = "" + Math.abs(random.nextInt(100000-999)+999); 
           
        try{
            connection c = new connection();
            String query2 = "insert into login values('"+cardnumber+"','"+pin+"') ";
            String query1 = "insert into signuptwo values('"+occupation+"','"+income+"','"+catagory+"','"+accounttype+"','"+nid+"','"+existingaccount+"','"+cardnumber+"','"+pin+"') ";
            c.s.executeUpdate(query1);
            c.s.executeUpdate(query2);
        }catch(Exception e) {
            System.out.println(e);
        }
        
        JOptionPane.showMessageDialog(null,"Your CARD NUMBER is : " + cardnumber + "\nYour PIN NUMBER is : " + pin + "\nPlease save your CARD NUMBER and PIN for further use");
        setVisible(false);
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_registerBtnActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateAccount2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount2("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AccountType;
    private javax.swing.JButton CancelBtn;
    private javax.swing.JTextField Catagory;
    private javax.swing.ButtonGroup ExixtingAccount;
    private javax.swing.JTextField Income;
    private javax.swing.JTextField NidNumber;
    private javax.swing.JTextField Occupation;
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel createAccountPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton no;
    private javax.swing.JButton registerBtn;
    private javax.swing.JCheckBox terms1;
    private javax.swing.JCheckBox terms2;
    private javax.swing.JRadioButton yes;
    // End of variables declaration//GEN-END:variables
}
