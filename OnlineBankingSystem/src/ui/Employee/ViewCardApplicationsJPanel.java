/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Employee;

import Config.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Customer.CustomerForm;
import ui.Security.ViewCustomerApplicationsPanel;
import utilities.CreditNumberGenerator;
import utilities.JavaMailUtil;
import utilities.Validations;

/**
 *
 * @author dattvi
 */
public class ViewCardApplicationsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCardApplicationsJPanel
     */
    static Connection con;
    Validations validate = new Validations();
     CreditNumberGenerator cardNum = new CreditNumberGenerator();
    String cardType=null;
    public ViewCardApplicationsJPanel() {
        initComponents();
         populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCardApplication = new javax.swing.JTable();
        customerId = new javax.swing.JTextField();
        approveApplication = new javax.swing.JToggleButton();
        rejectApplication = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCreditLimit = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        tblCardApplication.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Customer Id", "Customer Name", "Type of card applied", "Account Number", "Salary", "Occupation"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblCardApplication.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCardApplicationMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCardApplication);

        customerId.setEditable(false);
        customerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerIdActionPerformed(evt);
            }
        });

        approveApplication.setText("Approve Application");
        approveApplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveApplicationActionPerformed(evt);
            }
        });

        rejectApplication.setText("Reject Application");
        rejectApplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectApplicationActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter credit limit");

        jLabel2.setText("User Id");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1019, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCreditLimit, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(customerId))
                        .addGap(242, 242, 242)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rejectApplication, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(approveApplication, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerId, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(approveApplication, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rejectApplication, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCreditLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblCardApplicationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCardApplicationMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblCardApplication.getModel();
        // get the selected row index
        int selectedRowIndex = tblCardApplication.getSelectedRow();
        // set the selected row data into jtextfields
        customerId.setText(model.getValueAt(selectedRowIndex, 0).toString());
        cardType = model.getValueAt(selectedRowIndex, 2).toString();
        if(cardType.equals("Credit")){
            txtCreditLimit.setEnabled(true);
        }else{
            txtCreditLimit.setEnabled(false);
        }
    }//GEN-LAST:event_tblCardApplicationMouseClicked

    private void customerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerIdActionPerformed
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblCardApplication.getModel();
        model.setRowCount(0);

        try {
            con = DatabaseConnection.DatabaseCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from card_application where appstatus='PENDING'");
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("customerId"),
                    rs.getString("customerName"),
                    rs.getString("card_type"),
                    rs.getString("account_number"),
                    rs.getDouble("salary"),
                    rs.getString("occupation")
                    
                    
                });
//               rs.getString("activeState")
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    private void approveApplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveApplicationActionPerformed
        ViewCustomerApplicationsPanel viewPanel;
         double creditLimit=0.00;
        if(cardType.equals("Credit")){
            if(!validate.ifStringContainsDigits(txtCreditLimit.getText())){
                 JOptionPane.showMessageDialog(null, "Credit limit should be digits!");
                return;
            }
               creditLimit = Double.parseDouble(txtCreditLimit.getText());
        }
      
        try {
            con = DatabaseConnection.DatabaseCon();
            if (customerId.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Empty textbox, first select a row!");
                return;
            }
            int i = Integer.parseInt(customerId.getText());
            
            viewPanel = new ViewCustomerApplicationsPanel();
            CustomerForm form = viewPanel.getCustomerDetails(i);
            form.setId(i);

            

                boolean mailSuccess = JavaMailUtil.sendMail(form,"CARDAPPLY");

                if(mailSuccess){
                    

                      String query1 = "update card_application set creditlimit=?,appStatus=? where customerId=?";
                    PreparedStatement stmt1 = con.prepareStatement(query1);
                    stmt1.setDouble(1, creditLimit);
                     stmt1.setString(2, "APPROVED");
                    stmt1.setInt(3, i);
                    stmt1.execute();

                    String query2 = "update accountApplication set processStatus=?, applicationStatus=? WHERE custId=?";
                    PreparedStatement stmt2 = con.prepareStatement(query2);
                    stmt2.setString(1, "COMPLETED");
                    stmt2.setString(2, "APPROVED");
                    stmt2.setInt(3, i);
                    stmt2.execute();

                    String creditNo = cardNum.generate("4242", 16);
                    String debitNo = cardNum.generate("4747", 16);

                    String query3 = "update account_details set creditCardActive=?, debitCardActive=?,creditNumber=?,debitNumber=?,creditLimit=? where customerId=?";
                    PreparedStatement stmt3 = con.prepareStatement(query3);
                    if(cardType.equals("Credit")){
                        stmt3.setString(1, "Y");
                        stmt3.setString(2, "N");
                        stmt3.setString(3, creditNo);
                         stmt3.setString(4, null);
                    }else if(cardType.equals("Debit")){
                        stmt3.setString(1, "N");
                        stmt3.setString(2, "Y");
                        stmt3.setString(3, null);
                        stmt3.setString(4, debitNo);
                    }
                    
                   stmt3.setDouble(5, creditLimit);
                   stmt3.setDouble(6, i);
                  
                    stmt3.execute();

                    JOptionPane.showMessageDialog(null, "Card approved successfully! Email sent to the customer");
                }else{
                    JOptionPane.showMessageDialog(null, "Failed to send mail. Please try again");
                }

            } catch (Exception e) {
                System.out.println(e);
            }
    }//GEN-LAST:event_approveApplicationActionPerformed

    private void rejectApplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectApplicationActionPerformed
        // TODO add your handling code here:
         ViewCustomerApplicationsPanel viewPanel;
        if(!validate.ifStringContainsDigits(txtCreditLimit.getText())){
             JOptionPane.showMessageDialog(null, "Credit limit should be digits!");
            return;
        }
        double creditLimit = Double.parseDouble(txtCreditLimit.getText());
        try {
            con = DatabaseConnection.DatabaseCon();
            if (customerId.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Empty textbox, first select a row!");
                return;
            }
            int i = Integer.parseInt(customerId.getText());
            
            viewPanel = new ViewCustomerApplicationsPanel();
            CustomerForm form = viewPanel.getCustomerDetails(i);
            form.setId(i);

            

                boolean mailSuccess = JavaMailUtil.sendMail(form,"CARDAPPLY");

                if(mailSuccess){
                    

                    String query1 = "update card_application set creditlimit=?,appStatus=? where customerId=?";
                    PreparedStatement stmt1 = con.prepareStatement(query1);
                    stmt1.setDouble(1, creditLimit);
                     stmt1.setString(2, "REJECTED");
                    stmt1.setInt(3, i);
                   
                    stmt1.execute();

                    String query2 = "update accountApplication set processStatus=?, applicationStatus=? WHERE custId=?";
                    PreparedStatement stmt2 = con.prepareStatement(query2);
                    stmt2.setString(1, "COMPLETED");
                    stmt2.setString(2, "REJECTED");
                    stmt2.setInt(3, i);
                    stmt2.execute();

//                    String creditNo = cardNum.generate("4242", 16);
//                    String debitNo = cardNum.generate("4747", 16);
//
//                    String query3 = "update account_details set creditCardActive, debitCardActive,creditNumber,debitNumber,creditLimit";
//                    PreparedStatement stmt3 = con.prepareStatement(query3);
//                    if(cardType.equals("CREDIT")){
//                        stmt3.setString(1, "Y");
//                        stmt3.setString(2, "N");
//                        stmt3.setString(3, creditNo);
//                    }else if(cardType.equals("DEBIT")){
//                        stmt3.setString(1, "N");
//                        stmt3.setString(2, "Y");
//                        stmt3.setString(3, debitNo);
//                    }
//                    
//                   stmt3.setDouble(4, creditLimit);
//                  
//                    stmt3.execute();

                    JOptionPane.showMessageDialog(null, "Card request rejected successfully! Email sent to the customer");
                }else{
                    JOptionPane.showMessageDialog(null, "Failed to send mail. Please try again");
                }

            } catch (Exception e) {
                System.out.println(e);
            }
    }//GEN-LAST:event_rejectApplicationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton approveApplication;
    private javax.swing.JTextField customerId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton rejectApplication;
    private javax.swing.JTable tblCardApplication;
    private javax.swing.JTextField txtCreditLimit;
    // End of variables declaration//GEN-END:variables
}
