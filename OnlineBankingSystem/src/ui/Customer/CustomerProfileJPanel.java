/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Customer;

import Config.DatabaseConnection;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Customer.CustomerForm;
import static ui.Customer.CreateAccountJPanel.con;
import ui.Security.ViewCustomerApplicationsPanel;

/**
 *
 * @author dattvi
 */
public class CustomerProfileJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerProfileJPanel
     */
    CustomerForm customerform;
     static Connection con;
    public CustomerProfileJPanel(CustomerForm customerform) {
        initComponents();
        this.customerform = customerform;
        txtConfirmPwd.setVisible(false);
        txtNewPwd.setVisible(false);
        lblConfirmPwd.setVisible(false);
        lblNewPwd.setVisible(false);
        populateFields();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAccountNum = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        btnChangePwd = new javax.swing.JButton();
        lblNewPwd = new javax.swing.JLabel();
        lblConfirmPwd = new javax.swing.JLabel();
        txtConfirmPwd = new javax.swing.JPasswordField();
        txtNewPwd = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(165, 183, 195));

        txtName.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Account number");

        txtAccountNum.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mobile number");

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email Id");

        txtEmail.setEditable(false);

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        btnChangePwd.setText("Change Password");
        btnChangePwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePwdActionPerformed(evt);
            }
        });

        lblNewPwd.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblNewPwd.setForeground(new java.awt.Color(255, 255, 255));
        lblNewPwd.setText("New Password");

        lblConfirmPwd.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblConfirmPwd.setForeground(new java.awt.Color(255, 255, 255));
        lblConfirmPwd.setText("Confirm Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(txtName))
                        .addGap(196, 196, 196)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtAccountNum, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblConfirmPwd)
                            .addComponent(lblNewPwd))
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnChangePwd, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtConfirmPwd, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                .addComponent(txtNewPwd)))))
                .addContainerGap(345, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtAccountNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewPwd)
                    .addComponent(txtNewPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfirmPwd)
                    .addComponent(txtConfirmPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btnChangePwd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    private void populateFields(){
        ViewCustomerApplicationsPanel viewPanel = new ViewCustomerApplicationsPanel();
        try{
             
             String loginArr[] = customerform.getLoginId().split("CT");
             int userid = Integer.parseInt(loginArr[1]);
             CustomerForm form = viewPanel.getCustomerDetails(userid);
             txtName.setText(form.getName());
             txtAccountNum.setText(getAccountNum(userid));
             txtAddress.setText(form.getAddress());
             txtEmail.setText(form.getEmailId());
             txtMobile.setText(String.valueOf(form.getContactNo()));
            
        }catch(Exception e){
            System.out.println("Exception in CustomerProfileJPanel.populateFields():"+e.getMessage());
            
        }
       
    }
    public String getAccountNum(int userid){
        String accNo=null;
        try {
            con = DatabaseConnection.DatabaseCon();
            
            String query = "select * from account_details where customerId="+userid;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            if (rs.next()){
                
                accNo = rs.getString("account_number");
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ViewCustomerApplicationsPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return accNo;
    }
    private void btnChangePwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePwdActionPerformed
        // TODO add your handling code here:
        System.out.println("ui.Customer.CustomerProfileJPanel.btnChangePwdActionPerformed()"); 
        try{
            if(!txtNewPwd.isVisible() && !txtConfirmPwd.isVisible()){
                txtNewPwd.setVisible(true);
                txtConfirmPwd.setVisible(true);
                lblNewPwd.setVisible(true);
                lblConfirmPwd.setVisible(true);
            }else{
                 String newPwd = txtNewPwd.getText();
                 String confirmPwd = txtConfirmPwd.getText();
                if((!newPwd.equals("")) && newPwd.equals(confirmPwd)){
                    con = DatabaseConnection.DatabaseCon();
                    String loginid = customerform.getLoginId();
                   
                    String updQry = "update logincredentials set password=? where LoginId=?";
                    CallableStatement cs = con.prepareCall(updQry);
                    cs.setString(1, newPwd);
                    cs.setString(2, loginid);
                    
                    int updateCnt = cs.executeUpdate();
                    System.out.println("updateCnt"+updateCnt);
                    if(updateCnt==1){
                        JOptionPane.showMessageDialog(this, "Password changed successfully!");
                    }else{
                        JOptionPane.showMessageDialog(this, "Failed to change password.Please try again");
                    }
                }else{
                     JOptionPane.showMessageDialog(this, "Password does not match.Please try again.");
                }
                txtNewPwd.setText("");
                txtConfirmPwd.setText("");
            }
        }catch(Exception e){
            Logger.getLogger("Exception found:"+e.getMessage());
        }
    }//GEN-LAST:event_btnChangePwdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePwd;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblConfirmPwd;
    private javax.swing.JLabel lblNewPwd;
    private javax.swing.JTextField txtAccountNum;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JPasswordField txtConfirmPwd;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtNewPwd;
    // End of variables declaration//GEN-END:variables
}
