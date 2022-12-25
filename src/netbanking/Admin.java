package netbanking;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class Admin extends javax.swing.JFrame {

    public Admin() {
        initComponents();
        //show();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        userData = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        employeeData = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        AddEmployee = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usertable = new rojerusan.RSTableMetro();
        jScrollPane2 = new javax.swing.JScrollPane();
        employeetable = new rojerusan.RSTableMetro();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        serchField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        showname = new javax.swing.JLabel();
        showcard = new javax.swing.JLabel();
        showbalance = new javax.swing.JLabel();
        namelebel = new javax.swing.JLabel();
        typelevel = new javax.swing.JLabel();
        emaillevel = new javax.swing.JLabel();
        cardlevel = new javax.swing.JLabel();
        balencelevel = new javax.swing.JLabel();
        showemail = new javax.swing.JLabel();
        showaccounttype = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        userData.setBackground(new java.awt.Color(0, 102, 102));
        userData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/recruitment.png"))); // NOI18N
        userData.setBorder(null);
        userData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userDataActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("User Data");

        employeeData.setBackground(new java.awt.Color(0, 102, 102));
        employeeData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/employee.png"))); // NOI18N
        employeeData.setBorder(null);
        employeeData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        employeeData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeDataActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Employee Data");

        search.setBackground(new java.awt.Color(0, 102, 102));
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/candidate.png"))); // NOI18N
        search.setBorder(null);
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Search");

        logout.setBackground(new java.awt.Color(0, 102, 102));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logout.png"))); // NOI18N
        logout.setBorder(null);
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Log Out");

        AddEmployee.setBackground(new java.awt.Color(0, 102, 102));
        AddEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add.png"))); // NOI18N
        AddEmployee.setBorder(null);
        AddEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEmployeeActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Add Employee");

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/goback.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(employeeData))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(userData))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(logout)
                                .addComponent(jLabel1)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel4)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(search)
                            .addComponent(AddEmployee)))
                    .addComponent(jButton1))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(employeeData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddEmployee)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 140, 140));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Welcome To Admin Page");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 18, -1, -1));

        usertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "User Name", "Card NUmber", "Balance"
            }
        ));
        usertable.setColorFilasBackgound2(new java.awt.Color(255, 255, 204));
        jScrollPane1.setViewportView(usertable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 87, 417, 199));

        employeetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Employee Name", "Post", "Salary"
            }
        ));
        employeetable.setColorFilasBackgound2(new java.awt.Color(255, 255, 204));
        jScrollPane2.setViewportView(employeetable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 320, 417, 214));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Employee Data");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 292, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Customer Data");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 59, -1, -1));

        serchField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(serchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 246, 36));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Serach user data and transection history");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 129, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/close-btn.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(925, 0, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 140, 140));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/candidate.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, -1, 60));

        showname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        showname.setText("name");
        jPanel1.add(showname, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, -1, -1));

        showcard.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        showcard.setText("card");
        jPanel1.add(showcard, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, -1, -1));

        showbalance.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        showbalance.setText("balance");
        jPanel1.add(showbalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, -1, -1));

        namelebel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        namelebel.setText("Name :");
        jPanel1.add(namelebel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 167, -1, -1));

        typelevel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        typelevel.setText("Account Type :");
        jPanel1.add(typelevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, -1, -1));

        emaillevel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emaillevel.setText("E-mail :");
        jPanel1.add(emaillevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 253, -1, -1));

        cardlevel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cardlevel.setText("Card Number :");
        jPanel1.add(cardlevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, -1, -1));

        balencelevel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        balencelevel.setText("Balance :");
        jPanel1.add(balencelevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, -1, -1));

        showemail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        showemail.setText("Email");
        jPanel1.add(showemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, -1, -1));

        showaccounttype.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        showaccounttype.setText("Type");
        jPanel1.add(showaccounttype, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void show() {
        namelebel.setVisible(false);
        typelevel.setVisible(false);
        emaillevel.setVisible(false);
        cardlevel.setVisible(false);
        balencelevel.setVisible(false);
    }
    private void userDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userDataActionPerformed
        try {
            connection c = new connection();
            String query = "select * from signup ";
            ResultSet rs = c.s.executeQuery(query);

            usertable.setShowGrid(true);

            DefaultTableModel model= (DefaultTableModel)usertable.getModel();
            model.setRowCount(0);
            while(rs.next())
            {
                model.addRow(new String[]{rs.getString(1),rs.getString(11),rs.getString(13)});
            }
            JOptionPane.showMessageDialog(this,"User Data Viewed!");
        }catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_userDataActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        setVisible(false);
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void AddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEmployeeActionPerformed
        setVisible(false);
        dispose();
        new CreateEmployeeAccount().setVisible(true);
    }//GEN-LAST:event_AddEmployeeActionPerformed

    private void employeeDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeDataActionPerformed
        try {
            connection c = new connection();
            String query = "select * from signuptwo ";
            ResultSet rs = c.s.executeQuery(query);
            employeetable.setShowGrid(true);

            DefaultTableModel model= (DefaultTableModel)employeetable.getModel();
            model.setRowCount(0);
            while(rs.next())
            {
                model.addRow(new String[]{rs.getString(2),rs.getString(11),rs.getString(12)});
            }
            JOptionPane.showMessageDialog(this,"Employee Data Viewed!");
        }catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_employeeDataActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // TODO add your handling code here:
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kuet_bank","root","1234");
            
            String sql = "select username,accounttype,email,cardnumber,cardnumber from signup where username =?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, serchField.getText());
            ResultSet rs=pst.executeQuery();
             
      
             if(rs.next()==true)
             {
                String s1=rs.getString("username");
                String s2=rs.getString("accounttype");
                String s3=rs.getString("email");
                String s4=rs.getString("cardnumber");
                String s5=rs.getString("cardnumber");
                  
                showname.setText(s1);
                showaccounttype.setText(s2);
                showemail.setText(s3);
                showcard.setText(s4);
                showbalance.setText(s5);
                 
                 JOptionPane.showMessageDialog(this,"Data Viewed!");
             }
                     
        
            
            con.close();
        } 
        
         catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEmployee;
    private javax.swing.JLabel balencelevel;
    private javax.swing.JLabel cardlevel;
    private javax.swing.JLabel emaillevel;
    private javax.swing.JButton employeeData;
    private rojerusan.RSTableMetro employeetable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logout;
    private javax.swing.JLabel namelebel;
    private javax.swing.JButton search;
    private javax.swing.JTextField serchField;
    private javax.swing.JLabel showaccounttype;
    private javax.swing.JLabel showbalance;
    private javax.swing.JLabel showcard;
    private javax.swing.JLabel showemail;
    private javax.swing.JLabel showname;
    private javax.swing.JLabel typelevel;
    private javax.swing.JButton userData;
    private rojerusan.RSTableMetro usertable;
    // End of variables declaration//GEN-END:variables
}
