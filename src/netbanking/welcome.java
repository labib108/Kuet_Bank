package netbanking;

/**
 *
 * @author labib
 */
public class welcome extends javax.swing.JFrame {

    /**
     * Creates new form welcome
     */
    public welcome() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        welcomeBackgroundPanel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        loading = new javax.swing.JProgressBar();
        welcomeLevel = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        welcomeBackgroundPanel.setBackground(new java.awt.Color(204, 204, 204));
        welcomeBackgroundPanel.setPreferredSize(new java.awt.Dimension(800, 480));

        logo.setBackground(new java.awt.Color(255, 255, 255));
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/banklogo-xl.png"))); // NOI18N

        loading.setBackground(new java.awt.Color(51, 102, 255));
        loading.setForeground(new java.awt.Color(0, 0, 153));
        loading.setPreferredSize(new java.awt.Dimension(800, 25));

        welcomeLevel.setBackground(new java.awt.Color(255, 255, 255));
        welcomeLevel.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        welcomeLevel.setForeground(new java.awt.Color(0, 0, 204));
        welcomeLevel.setText("Welcome To KUET BANK");

        javax.swing.GroupLayout welcomeBackgroundPanelLayout = new javax.swing.GroupLayout(welcomeBackgroundPanel);
        welcomeBackgroundPanel.setLayout(welcomeBackgroundPanelLayout);
        welcomeBackgroundPanelLayout.setHorizontalGroup(
            welcomeBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomeBackgroundPanelLayout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(logo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(loading, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, welcomeBackgroundPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(welcomeLevel)
                .addGap(180, 180, 180))
        );
        welcomeBackgroundPanelLayout.setVerticalGroup(
            welcomeBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomeBackgroundPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(logo)
                .addGap(40, 40, 40)
                .addComponent(welcomeLevel)
                .addGap(32, 32, 32)
                .addComponent(loading, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(welcomeBackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(welcomeBackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        welcome welcome = new welcome();
        welcome.setVisible(true);
        
        Login login = new Login();
        try{
            for(int i = 0; i <=100; i++)
            {
                Thread.sleep(30);
                welcome.loading.setValue(i);
            }
        }catch(Exception e){}
        welcome.setVisible(false);
        login.setVisible(true);
        
        welcome.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JProgressBar loading;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel welcomeBackgroundPanel;
    private javax.swing.JLabel welcomeLevel;
    // End of variables declaration//GEN-END:variables
}
