package netbanking;

import javax.swing.JOptionPane;

/**
 *
 * @author labib
 */
public class CreateAccount1 extends javax.swing.JFrame {

    public CreateAccount1() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        fatherName = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        Address = new javax.swing.JTextField();
        motherName = new javax.swing.JTextField();
        Married = new javax.swing.JRadioButton();
        Unmarried = new javax.swing.JRadioButton();
        Others = new javax.swing.JRadioButton();
        City = new javax.swing.JTextField();
        State = new javax.swing.JTextField();
        PostCode = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        Nationality = new javax.swing.JTextField();
        nextBtn = new javax.swing.JButton();
        date = new com.toedter.calendar.JDateChooser();
        clearBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        Male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();

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
        jLabel2.setText("Page 1 : Personal Details");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Name : ");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Father's Name : ");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Date of Birth : ");

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Mother's Name : ");

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("City");

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Address :");

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Marital Status : ");

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Gender : ");

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("E-mail :");

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Nationality");

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Post Code : ");

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("State :");

        fatherName.setBackground(new java.awt.Color(255, 255, 255));
        fatherName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fatherName.setForeground(new java.awt.Color(0, 0, 0));

        name.setBackground(new java.awt.Color(255, 255, 255));
        name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));

        Address.setBackground(new java.awt.Color(255, 255, 255));
        Address.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Address.setForeground(new java.awt.Color(0, 0, 0));

        motherName.setBackground(new java.awt.Color(255, 255, 255));
        motherName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        motherName.setForeground(new java.awt.Color(0, 0, 0));

        Married.setBackground(new java.awt.Color(255, 255, 255));
        MaritalStatus.add(Married);
        Married.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Married.setForeground(new java.awt.Color(0, 0, 0));
        Married.setText("Married");
        Married.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarriedActionPerformed(evt);
            }
        });

        Unmarried.setBackground(new java.awt.Color(255, 255, 255));
        MaritalStatus.add(Unmarried);
        Unmarried.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Unmarried.setForeground(new java.awt.Color(0, 0, 0));
        Unmarried.setText("Unmarried");

        Others.setBackground(new java.awt.Color(255, 255, 255));
        MaritalStatus.add(Others);
        Others.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Others.setForeground(new java.awt.Color(0, 0, 0));
        Others.setText("Others");

        City.setBackground(new java.awt.Color(255, 255, 255));
        City.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        City.setForeground(new java.awt.Color(0, 0, 0));

        State.setBackground(new java.awt.Color(255, 255, 255));
        State.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        State.setForeground(new java.awt.Color(0, 0, 0));

        PostCode.setBackground(new java.awt.Color(255, 255, 255));
        PostCode.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PostCode.setForeground(new java.awt.Color(0, 0, 0));

        Email.setBackground(new java.awt.Color(255, 255, 255));
        Email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Email.setForeground(new java.awt.Color(0, 0, 0));

        Nationality.setBackground(new java.awt.Color(255, 255, 255));
        Nationality.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Nationality.setForeground(new java.awt.Color(0, 0, 0));

        nextBtn.setBackground(new java.awt.Color(204, 204, 204));
        nextBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nextBtn.setForeground(new java.awt.Color(0, 0, 0));
        nextBtn.setText("Next");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        date.setBackground(new java.awt.Color(255, 255, 255));
        date.setForeground(new java.awt.Color(0, 0, 0));

        clearBtn.setBackground(new java.awt.Color(204, 204, 204));
        clearBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(0, 0, 0));
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(255, 255, 255));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/goback.png"))); // NOI18N
        backBtn.setBorder(null);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        Male.setBackground(new java.awt.Color(255, 255, 255));
        Gender.add(Male);
        Male.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Male.setForeground(new java.awt.Color(0, 0, 0));
        Male.setText("Male");

        Female.setBackground(new java.awt.Color(255, 255, 255));
        Gender.add(Female);
        Female.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Female.setForeground(new java.awt.Color(0, 0, 0));
        Female.setText("Female");

        javax.swing.GroupLayout createAccountPanelLayout = new javax.swing.GroupLayout(createAccountPanel);
        createAccountPanel.setLayout(createAccountPanelLayout);
        createAccountPanelLayout.setHorizontalGroup(
            createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createAccountPanelLayout.createSequentialGroup()
                .addComponent(backBtn)
                .addGap(41, 41, 41)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createAccountPanelLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(27, 27, 27)
                        .addComponent(fatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(createAccountPanelLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(motherName, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(createAccountPanelLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(40, 40, 40)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(createAccountPanelLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(77, 77, 77)
                        .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(createAccountPanelLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(124, 124, 124)
                        .addComponent(City, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(createAccountPanelLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(105, 105, 105)
                        .addComponent(State, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(createAccountPanelLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(58, 58, 58)
                        .addComponent(PostCode, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(createAccountPanelLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(69, 69, 69)
                        .addComponent(Nationality, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(createAccountPanelLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(96, 96, 96)
                        .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(createAccountPanelLayout.createSequentialGroup()
                                .addComponent(clearBtn)
                                .addGap(158, 158, 158)
                                .addComponent(nextBtn))
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(createAccountPanelLayout.createSequentialGroup()
                        .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(32, 32, 32)
                        .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(createAccountPanelLayout.createSequentialGroup()
                                .addComponent(Male)
                                .addGap(47, 47, 47)
                                .addComponent(Female))
                            .addGroup(createAccountPanelLayout.createSequentialGroup()
                                .addComponent(Married)
                                .addGap(18, 18, 18)
                                .addComponent(Unmarried)
                                .addGap(18, 18, 18)
                                .addComponent(Others))))
                    .addGroup(createAccountPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(93, 93, 93)
                        .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(188, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createAccountPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(250, 250, 250))
        );
        createAccountPanelLayout.setVerticalGroup(
            createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createAccountPanelLayout.createSequentialGroup()
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createAccountPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1))
                    .addComponent(backBtn))
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createAccountPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createAccountPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel13))
                    .addComponent(fatherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createAccountPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel15))
                    .addComponent(motherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(createAccountPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(Male)
                    .addComponent(Female))
                .addGap(22, 22, 22)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createAccountPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel18))
                    .addComponent(Married)
                    .addComponent(Unmarried)
                    .addComponent(Others))
                .addGap(18, 18, 18)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createAccountPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel17))
                    .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createAccountPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel16))
                    .addComponent(City, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createAccountPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel23))
                    .addComponent(State, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createAccountPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel22))
                    .addComponent(PostCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createAccountPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel21))
                    .addComponent(Nationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createAccountPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel20))
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nextBtn)
                    .addComponent(clearBtn)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createAccountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createAccountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MarriedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarriedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MarriedActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        String username = name.getText();
        String fathername = fatherName.getText();
        String mothername = motherName.getText();
        String dob  = "" + date.getDate();
        String address = Address.getText();
        String city = City.getText();
        String state = State.getText();
        String postcode = PostCode.getText();
        String nationality = Nationality.getText();
        String email = Email.getText();
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
        
        try{
            if(name.equals("")) {
                JOptionPane.showMessageDialog(null,"Name is required");
            }else {
                connection c = new connection();
                String query = "insert into signup values('"+username+"','"+fathername+"','"+mothername+"','"+dob+"','"+gender+"','"+maritalstatus+"','"+address+"','"+city+"','"+state+"','"+postcode+"','"+nationality+"','"+email+"') ";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new CreateAccount2(email).setVisible(true);
            }
        }catch(Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_nextBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        name.setText("");
        motherName.setText("");
        fatherName.setText("");
        date.setDate(null);
        Address.setText("");
        City.setText("");
        State.setText("");
        PostCode.setText("");
        Nationality.setText("");
        Email.setText(""); 
    }//GEN-LAST:event_clearBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        setVisible(false);
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(CreateAccount1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount1().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JTextField City;
    private javax.swing.JTextField Email;
    private javax.swing.JRadioButton Female;
    private javax.swing.ButtonGroup Gender;
    private javax.swing.JRadioButton Male;
    private javax.swing.ButtonGroup MaritalStatus;
    private javax.swing.JRadioButton Married;
    private javax.swing.JTextField Nationality;
    private javax.swing.JRadioButton Others;
    private javax.swing.JTextField PostCode;
    private javax.swing.JTextField State;
    private javax.swing.JRadioButton Unmarried;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JPanel createAccountPanel;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JTextField fatherName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField motherName;
    private javax.swing.JTextField name;
    private javax.swing.JButton nextBtn;
    // End of variables declaration//GEN-END:variables
}
