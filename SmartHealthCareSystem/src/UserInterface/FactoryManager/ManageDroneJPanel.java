/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FactoryManager;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.MainUserAccount.MainUserAccount;
import Business.Map.LatLng;
import Business.Network.Network;
import Business.Organization.ManagerOrganization;
import Business.Organization.Organization;
import Business.Organization.VaccineManagerOrganization;
import Business.WorkQueue.SendDroneWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Achal Sancheti
 */
public class ManageDroneJPanel extends javax.swing.JPanel {
    
        JPanel userProcessContainer;
    Enterprise enterprise;
    MainUserAccount userAccount;
    ManagerOrganization managerOrganization;
    EcoSystem business;
    private Timer t = null;
    private Timer t1 = null;
    private int count = 0;
    private int co = 0;

    /**
     * Creates new form ManageDroneJPanel
     */
    public ManageDroneJPanel( JPanel userProcessContainer,MainUserAccount userAccount,ManagerOrganization managerOrganization,Enterprise enterprise,EcoSystem business) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.userAccount=userAccount;
        this.managerOrganization=managerOrganization;
        this.enterprise=enterprise;
        this.business=business;
        
        populateTable();
        populatedroneTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request: managerOrganization.getWorkQueue().getWorkRequestList()){
            if(request instanceof SendDroneWorkRequest){
            
            Object[] row = new Object[7];
            
            String vaccine = ((SendDroneWorkRequest)request).getVaccineName();
            row[0] = request;
            int quantity = ((SendDroneWorkRequest)request).getQuantity();
            row[1] = quantity;
            row[2] = request.getSender().getEmployee().getName();
            row[3] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[4] = request.getStatus();
            row[5] = request.getDate();
            row[6] = request.getTime();
            
            model.addRow(row);
        }}
    }
    
    public void populatedroneTable(){
        DefaultTableModel model = (DefaultTableModel) droneTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request: userAccount.getWorkQueue().getWorkRequestList()){
            if(request instanceof SendDroneWorkRequest){
            
            Object[] row = new Object[5];
            
            String vaccine = ((SendDroneWorkRequest)request).getVaccineName();
            row[0] = request;
            int quantity = ((SendDroneWorkRequest)request).getQuantity();
            row[1] = quantity;
            String address = ((SendDroneWorkRequest)request).getAddress();
            row[2] = address;
            row[3] = request.getDate();
            row[4] = request.getTime();
            
            model.addRow(row);
        }}
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
        orderTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        droneTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        vaccinenameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        quantitySpinner = new javax.swing.JSpinner();
        addtodroneButton = new javax.swing.JButton();
        senddroneButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        ProgressBar = new javax.swing.JProgressBar();
        drone = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ProgressBar1 = new javax.swing.JProgressBar();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        feedButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(orderTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 800, 158));

        backButton.setBackground(new java.awt.Color(0, 0, 0));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("<<Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, -1, 33));

        droneTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Name", "Quantity", "Address", "Date", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(droneTable);
        if (droneTable.getColumnModel().getColumnCount() > 0) {
            droneTable.getColumnModel().getColumn(2).setPreferredWidth(150);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 810, 150));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Preparing Drone:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));
        add(vaccinenameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 150, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Vaccine Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Quantity:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));
        add(quantitySpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 60, 30));

        addtodroneButton.setBackground(new java.awt.Color(0, 0, 0));
        addtodroneButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addtodroneButton.setForeground(new java.awt.Color(255, 255, 255));
        addtodroneButton.setText("Add To Drone");
        addtodroneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtodroneButtonActionPerformed(evt);
            }
        });
        add(addtodroneButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 200, 33));

        senddroneButton.setBackground(new java.awt.Color(0, 0, 0));
        senddroneButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        senddroneButton.setForeground(new java.awt.Color(255, 255, 255));
        senddroneButton.setText("Send Drone");
        senddroneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senddroneButtonActionPerformed(evt);
            }
        });
        add(senddroneButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, 190, 33));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Address:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 60, -1));
        add(addressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 300, -1));

        ProgressBar.setStringPainted(true);
        add(ProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 10, 230, -1));

        drone.setBackground(new java.awt.Color(255, 255, 51));
        drone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        drone.setText("See Drone Location");
        drone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                droneActionPerformed(evt);
            }
        });
        add(drone, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 140, 180, 33));

        jButton1.setBackground(new java.awt.Color(255, 255, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("See Progress");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 90, 180, 33));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Hospital");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Factory");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, -1, -1));

        ProgressBar1.setStringPainted(true);
        add(ProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 60, 230, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Factory");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 60, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Hospital");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 60, -1, -1));
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, -1, -1));

        feedButton.setBackground(new java.awt.Color(0, 0, 0));
        feedButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        feedButton.setForeground(new java.awt.Color(255, 255, 255));
        feedButton.setText("Feed Address");
        feedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedButtonActionPerformed(evt);
            }
        });
        add(feedButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 513, 230, 33));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/drone.jpg"))); // NOI18N
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 0, 640, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManagerJPanel mjp = (ManagerJPanel) component;
        mjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void addtodroneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtodroneButtonActionPerformed
        if(!vaccinenameTextField.getText().isEmpty()){
            String vaccine=vaccinenameTextField.getText();
            String address=addressTextField.getText();
            int purchaseQuantity = (Integer)quantitySpinner.getValue();
            if(purchaseQuantity<=0){
            JOptionPane.showMessageDialog(this,"Please Provide Quantity","Warning",JOptionPane.ERROR_MESSAGE);
            return;
            }
            String date = new java.text.SimpleDateFormat("MM/dd/yyyy").format(new Date());
            String time = new java.text.SimpleDateFormat("h:mm:ss a").format(new Date());
        
        SendDroneWorkRequest droneVaccine = new SendDroneWorkRequest();
        droneVaccine.setVaccineName(vaccine);
        droneVaccine.setAddress(address);
        droneVaccine.setQuantity(purchaseQuantity);
        droneVaccine.setDate(date);
        droneVaccine.setTime(time);
        
        
        
        Enterprise ent = null;
        Organization org = null;
        for(Network network : business.getNetworkList()){
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof HospitalEnterprise)
                        ent=enterprise;
            
        
        
        
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof VaccineManagerOrganization){
                org = organization;
                break;
            }
        }
            }
        }
        
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(droneVaccine);
            userAccount.getWorkQueue().getWorkRequestList().add(droneVaccine);
        }
        
        JOptionPane.showMessageDialog(null, "Vaccine Has Been Added Into The Drone","Success",JOptionPane.INFORMATION_MESSAGE);
        vaccinenameTextField.setText("");
        addressTextField.setText("");
        populatedroneTable();
            }
            else{
            JOptionPane.showMessageDialog(null, "Please Enter All The Fields","Error",JOptionPane.ERROR_MESSAGE);
            vaccinenameTextField.setText("");
            addressTextField.setText("");
            }
    }//GEN-LAST:event_addtodroneButtonActionPerformed

    private void senddroneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senddroneButtonActionPerformed
            
        int selectedRow = orderTable.getSelectedRow();

        if (selectedRow >= 0) {
            SendDroneWorkRequest request = (SendDroneWorkRequest) orderTable.getValueAt(selectedRow, 0);
            if (request.getStatus().equalsIgnoreCase("Drone Sent")) {
                JOptionPane.showMessageDialog(null, "Request already processed.","Warning",JOptionPane.WARNING_MESSAGE);
                return;
            } else {
                request.setStatus("Drone Sent");
                JOptionPane.showMessageDialog(null, "Vaccine Has Been Sent Through Drone","Success",JOptionPane.INFORMATION_MESSAGE);
                populateTable();
        }
        }else {
            JOptionPane.showMessageDialog(null, "Choose a request to process.","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_senddroneButtonActionPerformed

    private void droneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_droneActionPerformed

        FactoryDroneJFrame jf = new FactoryDroneJFrame();
        jf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        jf.setSize(1070,300);
        jf.setLocation(180,200);
        jf.setVisible(true);

    }//GEN-LAST:event_droneActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        t = new Timer(440, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                ProgressBar.setValue(count);
                if (ProgressBar.getValue() < 100) {
                    ProgressBar.setValue(ProgressBar.getValue() + 1);
                    ProgressBar.setForeground(Color.BLUE);
                }
                if (ProgressBar.getValue() == 100) {
                    t.stop();
                    ProgressBar.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Drone Has Been Reached To The Hospital");
                    
                    t1 = new Timer(440, new ActionListener(){
                
            @Override
            public void actionPerformed(ActionEvent e) {
                co++;
                ProgressBar1.setValue(co);
                if (ProgressBar1.getValue() < 100) {
                    ProgressBar.setValue(ProgressBar.getValue() + 1);
                    ProgressBar.setForeground(Color.BLUE);
                }
                if (ProgressBar1.getValue() == 100) {
                    t1.stop();
                    ProgressBar1.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Drone Has Been Reached To The Factory");
                }
            }
        });  t1.start();
                }
            }
            });

        t.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void feedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedButtonActionPerformed
            try {
                LatLng ll = new LatLng();
                JOptionPane.showMessageDialog(null, "Enter the address on console");
                ll.execute();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Enter the valid address");
            }
    }//GEN-LAST:event_feedButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JProgressBar ProgressBar1;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JButton addtodroneButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton drone;
    private javax.swing.JTable droneTable;
    private javax.swing.JButton feedButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable orderTable;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JButton senddroneButton;
    private javax.swing.JTextField vaccinenameTextField;
    // End of variables declaration//GEN-END:variables
}
