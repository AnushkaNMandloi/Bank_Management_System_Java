/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.DataOperator;

import Config.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import ui.Employee.ManageCustomerJPanel;

/**
 *
 * @author anush
 */
public class ViewCustomersPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCustomersPanel
     */
    static Connection con;
    public ViewCustomersPanel() {
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
        customerViewTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(165, 183, 195));

        customerViewTable.setBackground(new java.awt.Color(204, 204, 204));
        customerViewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Customer ID", "Customer Name", "Age", "Gender", "Date of Birth", "City", "State", "Phone Number", "Email", "Active State", "Process Status", "Application Status", "Application Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(customerViewTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1374, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 484, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    //show only those entries whose status is not active that means the account is not created 
    //account created - active status - y
    //account not created/deleted - n
    //and when the application is forwarded to data operator the application status of that customer changes to pending
    //otherwise the application is in applied state initially when clicked on register button
    //when data operator forwards the application ahead to security admin - the application status changes to work in progress
    //when security admin approves the application - the application status changes to approved
    //when security admin rejects the application - the application status changes to rejected
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) customerViewTable.getModel();
        model.setRowCount(0);

        try {
            con = DatabaseConnection.DatabaseCon();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select c.customerId,c.customerName,c.age,"
                    + "c.gender,c.date_of_birth,c.city,c.state,c.phone_number,"
                    + "c.email,c.activeState,a.processStatus,a.applicationStatus from customer c, "
                    + "accountApplication a where ((c.activeState,a.processStatus,a.applicationStatus)=('N','WIP','PENDING') AND "
                    + "c.customerId=a.custId)");
            
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("customerId"),
                    rs.getString("customerName"),
                    rs.getInt("age"),
                    rs.getString("gender"),
                    rs.getString("date_of_birth"),
                    rs.getString("city"),
                    rs.getString("state"),
                    rs.getString("phone_number"),
                    rs.getString("email"),
                    rs.getString("activeState"),
                    rs.getString("processStatus"),
                    rs.getString("applicationStatus")
                });
//               rs.getString("activeState")
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable customerViewTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}