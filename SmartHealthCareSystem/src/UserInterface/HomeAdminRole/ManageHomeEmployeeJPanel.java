/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HomeAdminRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.MainUserAccount.MainUserAccount;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Achal Sancheti
 */
public class ManageHomeEmployeeJPanel extends javax.swing.JPanel {
    
    private OrganizationDirectory organizationDirectory;
    private JPanel userProcessContainer;
    private MainUserAccount userAccount;
    private EcoSystem business;

    /**
     * Creates new form ManageEmployeeJPanel
     */
    public ManageHomeEmployeeJPanel(JPanel userProcessContainer,OrganizationDirectory organizationDirectory,MainUserAccount userAccount,EcoSystem business) {
        initComponents();
        this.business=business;
        this.userProcessContainer = userProcessContainer;
        this.organizationDirectory = organizationDirectory;
        this.userAccount=userAccount;
        //this.enterprise=enterprise;
        populateOrganizationComboBox();
    }
    
    public void populateOrganizationComboBox(){
        organizationComboBox.removeAllItems();
        
        for (Organization organization : organizationDirectory.getOrganizationList()){
            organizationComboBox.addItem(organization);
        }
    }

    void populateTable(Organization organization){
        DefaultTableModel model = (DefaultTableModel) organizationTable.getModel();
        
        model.setRowCount(0);
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            Object[] row = new Object[3];
            row[0] = employee.getId();
            row[1] = employee.getName();
            model.addRow(row);
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

        organizationComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationTable = new javax.swing.JTable();
        createemployeeButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organizationComboBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        organizationComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationComboBoxActionPerformed(evt);
            }
        });
        add(organizationComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 230, 35));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Organization");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        organizationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 680, 160));

        createemployeeButton.setBackground(new java.awt.Color(0, 0, 0));
        createemployeeButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        createemployeeButton.setForeground(new java.awt.Color(255, 255, 255));
        createemployeeButton.setText("Create Person");
        createemployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createemployeeButtonActionPerformed(evt);
            }
        });
        add(createemployeeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 380, 140, 35));

        backButton.setBackground(new java.awt.Color(0, 0, 0));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, 35));

        refreshButton.setBackground(new java.awt.Color(0, 0, 0));
        refreshButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        refreshButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });
        add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, 30));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 80, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/manageEmployee.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 60, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void organizationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationComboBoxActionPerformed
        
        Organization organization = (Organization) organizationComboBox.getSelectedItem();
        if (organization != null){
            populateTable(organization);
        }
    }//GEN-LAST:event_organizationComboBoxActionPerformed

    private void createemployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createemployeeButtonActionPerformed
        
        CreateHomeEmployeeJPanel create=new CreateHomeEmployeeJPanel(userProcessContainer, organizationDirectory, this);
        userProcessContainer.add("AdminWork", create);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_createemployeeButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        populateOrganizationComboBox();
    }//GEN-LAST:event_refreshButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton createemployeeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationComboBox;
    private javax.swing.JTable organizationTable;
    private javax.swing.JButton refreshButton;
    // End of variables declaration//GEN-END:variables
}
