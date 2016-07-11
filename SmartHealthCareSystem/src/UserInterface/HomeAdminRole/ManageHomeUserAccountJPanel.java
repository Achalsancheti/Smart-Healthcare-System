/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HomeAdminRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.MainRole;
import Business.MainUserAccount.MainUserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Achal Sancheti
 */
public class ManageHomeUserAccountJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private EcoSystem business;

    /**
     * Creates new form ManageUserAccountJPanel
     */
    public ManageHomeUserAccountJPanel(JPanel userProcessContainer, Enterprise enterprise,EcoSystem business) {
        initComponents();
        this.enterprise = enterprise;
        this.userProcessContainer = userProcessContainer;
        this.business=business;

        OrganizationComboBox();
        employeeComboBox.removeAllItems();
        Data();
    }
    
    public void OrganizationComboBox() {
        organizationComboBox.removeAllItems();
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            organizationComboBox.addItem(organization);
        }
    }
    
    public void populateEmployeeComboBox(Organization organization){
        employeeComboBox.removeAllItems();
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            employeeComboBox.addItem(employee);
        }
    }
    
    private void populateRoleComboBox(Organization organization){
        roleComboBox.removeAllItems();
        for (MainRole role : organization.getSupportedRole()){
            roleComboBox.addItem(role);
        }
    }

    public void Data() {

        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (MainUserAccount ua : organization.getMainuserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) userTable.getModel()).addRow(row);
            }
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
        userTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        organizationComboBox = new javax.swing.JComboBox();
        employeeComboBox = new javax.swing.JComboBox();
        roleComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 51, 670, 103));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Organization");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 175, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Employee");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 228, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Role");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 281, -1, -1));

        organizationComboBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        organizationComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationComboBoxActionPerformed(evt);
            }
        });
        add(organizationComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 165, 250, 35));

        employeeComboBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        employeeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(employeeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 218, 250, 35));

        roleComboBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        roleComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        roleComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleComboBoxActionPerformed(evt);
            }
        });
        add(roleComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 271, 250, 35));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("User Name");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 333, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Password");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 380, -1, -1));
        add(usernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 331, 110, -1));
        add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 378, 110, -1));

        createButton.setBackground(new java.awt.Color(0, 0, 0));
        createButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        createButton.setForeground(new java.awt.Color(255, 255, 255));
        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });
        add(createButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 450, -1, 34));

        backButton.setBackground(new java.awt.Color(0, 0, 0));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("<<Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 450, -1, 34));
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 70, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/manageuseraccount.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 60, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void organizationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationComboBoxActionPerformed
        
        Organization organization = (Organization) organizationComboBox.getSelectedItem();
        if (organization != null){
            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
        }
    }//GEN-LAST:event_organizationComboBoxActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        
        if(!usernameTextField.getText().isEmpty()&&!passwordTextField.getText().isEmpty()){
        String userName = usernameTextField.getText();
        String password = passwordTextField.getText();
        Organization organization = (Organization) organizationComboBox.getSelectedItem();
        Employee employee = (Employee) employeeComboBox.getSelectedItem();
        MainRole role = (MainRole) roleComboBox.getSelectedItem();
        
        
        if(business.checkIfUsernameIsUnique(userName)){
        organization.getMainuserAccountDirectory().createUserAccount(userName, password, employee, role);
              
        Data();
        
        JOptionPane.showMessageDialog(null, "User Account Has Been Added Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
        usernameTextField.setText("");
        passwordTextField.setText("");
        }else{
        JOptionPane.showMessageDialog(null, "Username Already Exists","Warning",JOptionPane.WARNING_MESSAGE);
        }
        }else{
        JOptionPane.showMessageDialog(null, "Please Enter Both Username and Password","Error",JOptionPane.ERROR_MESSAGE);
        usernameTextField.setText("");
        passwordTextField.setText("");
        }
    }//GEN-LAST:event_createButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void roleComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleComboBoxActionPerformed
        
    }//GEN-LAST:event_roleComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton createButton;
    private javax.swing.JComboBox employeeComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationComboBox;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JComboBox roleComboBox;
    private javax.swing.JTable userTable;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
