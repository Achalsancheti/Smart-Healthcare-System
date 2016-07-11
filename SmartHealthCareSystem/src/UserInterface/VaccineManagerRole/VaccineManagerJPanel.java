/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.VaccineManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.MainUserAccount.MainUserAccount;
import Business.Organization.Organization;
import Business.Organization.VaccineManagerOrganization;
import Business.Vaccine.Vaccine;
import Business.WorkQueue.OrderVaccineWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Achal Sancheti
 */
public class VaccineManagerJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private VaccineManagerOrganization vaccinemanagerOrganization;
    private Enterprise enterprise;
    private MainUserAccount userAccount;
    private Organization organization;
    private EcoSystem business;

    /**
     * Creates new form VaccineManagerJPanel
     */
    public VaccineManagerJPanel(JPanel userProcessContainer,MainUserAccount userAccount,Organization organization,Enterprise enterprise,EcoSystem business ) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.userAccount=userAccount;
        this.enterprise=enterprise;
        this.vaccinemanagerOrganization=(VaccineManagerOrganization)organization;
        this.business=business;
        populateTable();
        populateProductsTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) vaccineTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request: vaccinemanagerOrganization.getWorkQueue().getWorkRequestList()){
            if(request instanceof OrderVaccineWorkRequest){
            
            Object[] row = new Object[7];
            
            String vaccine = ((OrderVaccineWorkRequest)request).getVaccineName();
            row[0] = request;
            int quantity = ((OrderVaccineWorkRequest)request).getQuantity();
            row[1] = quantity;
            row[2] = request.getSender().getEmployee().getName();
            row[3] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[4] = request.getStatus();
            row[5] = request.getDate();
            row[6] = request.getTime();
            
            model.addRow(row);
        }}
    }
    
    public void populateProductsTable(){
        DefaultTableModel dtm=(DefaultTableModel)Table.getModel();
        dtm.setRowCount(0);
        
        for(Vaccine request : vaccinemanagerOrganization.getVaccineCatalog().getList()){
        Object row[]=new Object[2];
            row[0] = request;
            row[1] = request.getQuantity();
            dtm.addRow(row);
        }
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
        vaccineTable = new javax.swing.JTable();
        receiverButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        sendvaccineButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        emergencyButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vaccineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Name", "Quantity", "Sender", "Receiver", "Status", "Date", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(vaccineTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 790, 140));

        receiverButton.setBackground(new java.awt.Color(0, 0, 0));
        receiverButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        receiverButton.setForeground(new java.awt.Color(255, 255, 255));
        receiverButton.setText("Receiver");
        receiverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiverButtonActionPerformed(evt);
            }
        });
        add(receiverButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 160, 33));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Vaccine Manager Work Area");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 620, -1));

        sendvaccineButton.setBackground(new java.awt.Color(0, 0, 0));
        sendvaccineButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sendvaccineButton.setForeground(new java.awt.Color(255, 255, 255));
        sendvaccineButton.setText("Send Vaccine");
        sendvaccineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendvaccineButtonActionPerformed(evt);
            }
        });
        add(sendvaccineButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 190, 33));

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Name", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Table);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 550, 139));

        emergencyButton.setBackground(new java.awt.Color(0, 0, 0));
        emergencyButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        emergencyButton.setForeground(new java.awt.Color(255, 255, 255));
        emergencyButton.setText("Order Emergency Vaccine");
        emergencyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emergencyButtonActionPerformed(evt);
            }
        });
        add(emergencyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 530, 190, 33));

        updateButton.setBackground(new java.awt.Color(0, 0, 0));
        updateButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 363, 180, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void receiverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiverButtonActionPerformed
        
        int selectedRow = vaccineTable.getSelectedRow();

        if (selectedRow >= 0) {
            WorkRequest request = (WorkRequest) vaccineTable.getValueAt(selectedRow, 0);
            if (request.getStatus().equalsIgnoreCase("Sent")) {
                JOptionPane.showMessageDialog(null, "Request already processed.","Warning",JOptionPane.WARNING_MESSAGE);
                return;
            } else {
                request.setReceiver(userAccount);
                request.setStatus("Pending");
                populateTable();

            }

        } else {
            JOptionPane.showMessageDialog(null, "Choose a request to process.","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_receiverButtonActionPerformed

    private void sendvaccineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendvaccineButtonActionPerformed
        
        int selectedRow = vaccineTable.getSelectedRow();

        if (selectedRow >= 0) {
            WorkRequest request = (WorkRequest) vaccineTable.getValueAt(selectedRow, 0);
            if (request.getStatus().equalsIgnoreCase("Sent")) {
                JOptionPane.showMessageDialog(null, "Request already processed.","Warning",JOptionPane.WARNING_MESSAGE);
                return;
            } else {
                String date = new java.text.SimpleDateFormat("MM/dd/yyyy").format(new Date());
                String time = new java.text.SimpleDateFormat("h:mm:ss a").format(new Date());
                request.setStatus("Sent");
                request.setDate(date);
                request.setTime(time);
                populateTable();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Choose a request to process.","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_sendvaccineButtonActionPerformed

    private void emergencyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emergencyButtonActionPerformed
         EmergencyVaccineJPanel emergencyVaccineJPanel = new EmergencyVaccineJPanel(userProcessContainer,userAccount,organization,enterprise,business);
         userProcessContainer.add("EmergencyVaccineJPanel",emergencyVaccineJPanel);
         CardLayout layout = (CardLayout)userProcessContainer.getLayout();
         layout.next(userProcessContainer);
    }//GEN-LAST:event_emergencyButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        int selectRow=Table.getSelectedRow();
        
        if(selectRow>=0){
             Vaccine info = (Vaccine)Table.getValueAt(selectRow, 0);
             ViewJPanel view = new ViewJPanel(userProcessContainer, info, this);
             userProcessContainer.add("ViewJPanel",view);
             CardLayout layout = (CardLayout)userProcessContainer.getLayout();
             layout.next(userProcessContainer);
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a row","Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JButton emergencyButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton receiverButton;
    private javax.swing.JButton sendvaccineButton;
    private javax.swing.JButton updateButton;
    private javax.swing.JTable vaccineTable;
    // End of variables declaration//GEN-END:variables
}