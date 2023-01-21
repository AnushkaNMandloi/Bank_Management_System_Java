/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import Config.DatabaseConnection;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import model.Customer.CustomerForm;
import model.CustomerService.CustomerServiceJFrame;
import model.DataOperator.DataOperatorPortalJFrame;
import model.Employee.EmployeePortalJFrame;
import model.Security.SecurityPortalJFrame;
import model.SystemAdmin.SystemAdminPortalJFrame;
import model.stocksAdmin.stocksAdminJFrame;
import ui.Customer.CustomerPortalJFrame;

/**
 *
 * @author dattvi
 */
public class LoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginJPanel
     */
    CustomerForm customerform;
    static Connection con;
     HomePageJFrame homeFrame ;
    public LoginJPanel(HomePageJFrame homeFrame) {
        initComponents();
        this.homeFrame = homeFrame;
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUserId = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtLoginId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnLogIn = new javax.swing.JButton();
        txtLoginPwd = new javax.swing.JPasswordField();
        lblUserId1 = new javax.swing.JLabel();
        roleComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(165, 183, 195));

        lblUserId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUserId.setText("Who are you?");

        lblPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPassword.setText("Password");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Your money is our responsibility");

        btnLogIn.setBackground(new java.awt.Color(225, 163, 115));
        btnLogIn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogIn.setForeground(new java.awt.Color(255, 255, 255));
        btnLogIn.setText("LOGIN");
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });

        lblUserId1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUserId1.setText("Login Id");

        roleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CUSTOMER", "STOCKADMIN", "DATAOPERATOR", "BANK EMPLOYEE", "SECURITYADMIN", "CUSTOMER SERVICE ADMIN", "SYSADMIN", "BROKER" }));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LOGIN");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(225, 163, 115));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DAG Intl. Fintech");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1248, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(416, 416, 416)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPassword)
                            .addComponent(lblUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUserId1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtLoginId)
                            .addComponent(txtLoginPwd)
                            .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btnLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1242, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUserId1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword)
                            .addComponent(txtLoginPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtLoginId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btnLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(628, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
   
    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        try {
            // TODO add your handling code here:
            String loginid = txtLoginId.getText();
            String pwd = txtLoginPwd.getText(); 
            String role = roleComboBox.getSelectedItem().toString();
            
            con = DatabaseConnection.DatabaseCon();
            Statement stm = con.createStatement();
            String login_query = "select * from logincredentials where userRole ='"+role+"' and LoginId='"+loginid+"' and password = '"+pwd+"'";
            
            ResultSet rs = stm.executeQuery(login_query);
            
            if(rs.next()) {
                 if(role.equals("CUSTOMER")){
                    customerform = new CustomerForm();
                    customerform.setLoginId(loginid);
                    CustomerPortalJFrame customerFrame = new CustomerPortalJFrame(customerform);
                    customerFrame.setVisible(true);
                    homeFrame.dispose();
                }else if(role.equals("DATAOPERATOR")){
                    DataOperatorPortalJFrame dataop = new DataOperatorPortalJFrame();
                    dataop.setVisible(true);
                     homeFrame.dispose();
                }else if(role.equals("SECURITYADMIN")){
                    SecurityPortalJFrame securityFrame = new SecurityPortalJFrame();
                    securityFrame.setVisible(true);
                     homeFrame.dispose();
                }else if(role.equals("BANK EMPLOYEE")){
                    EmployeePortalJFrame employee = new EmployeePortalJFrame();
                    employee.setVisible(true);
                    homeFrame.dispose();
                }else if(role.equals("STOCKADMIN")){
                    stocksAdminJFrame stockframe = new stocksAdminJFrame();
                    stockframe.setVisible(true);
                    homeFrame.dispose();
                }else if(role.equals("CUSTOMER SERVICE ADMIN")){
                    CustomerServiceJFrame customerAdminframe = new CustomerServiceJFrame();
                    customerAdminframe.setVisible(true);
                     homeFrame.dispose();
                }else if(role.equals("SYSADMIN")){
                    SystemAdminPortalJFrame sysadmin = new SystemAdminPortalJFrame();
                    sysadmin.setVisible(true);
                    homeFrame.dispose();
                    
                }else if(role.equals("BROKER")){
                    stocksAdminJFrame stockframe = new stocksAdminJFrame();
                    stockframe.setVisible(true);
                    homeFrame.dispose();
                }
            }else{
                     JOptionPane.showMessageDialog(this, "Invalid login.User not found");
            }

        txtLoginId.setText("");
        txtLoginPwd.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(LoginJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLogInActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserId;
    private javax.swing.JLabel lblUserId1;
    private javax.swing.JComboBox<String> roleComboBox;
    private javax.swing.JTextField txtLoginId;
    private javax.swing.JPasswordField txtLoginPwd;
    // End of variables declaration//GEN-END:variables
}