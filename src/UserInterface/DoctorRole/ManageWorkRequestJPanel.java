/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DoctorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.MainUserAccount.MainUserAccount;
import Business.Organization.DoctorOrganization;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Achal Sancheti
 */
public class ManageWorkRequestJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    WorkRequest request;
    DoctorOrganization doctorOrganization;
    MainUserAccount userAccount;
    Enterprise enterprise;
    EcoSystem business;
    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public ManageWorkRequestJPanel(JPanel userProcessContainer,Enterprise enterprise,WorkRequest request,MainUserAccount userAccount,DoctorOrganization doctorOrganization,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.doctorOrganization = doctorOrganization;
        this.userAccount=userAccount;
        this.enterprise=enterprise;
        this.business=business;
        name.setText(request.getName());
        age.setText(String.valueOf(request.getAge()));
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        calculatevitalsignButton = new javax.swing.JButton();
        managevitalsignButton = new javax.swing.JButton();
        age = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setBackground(new java.awt.Color(0, 0, 0));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("<<Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, 31));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Patient Name :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 153));
        name.setText("jLabel1");
        add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        calculatevitalsignButton.setBackground(new java.awt.Color(0, 0, 0));
        calculatevitalsignButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        calculatevitalsignButton.setForeground(new java.awt.Color(255, 255, 255));
        calculatevitalsignButton.setText("Calculate Vital Sign");
        calculatevitalsignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatevitalsignButtonActionPerformed(evt);
            }
        });
        add(calculatevitalsignButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 190, 40));

        managevitalsignButton.setBackground(new java.awt.Color(0, 0, 0));
        managevitalsignButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        managevitalsignButton.setForeground(new java.awt.Color(255, 255, 255));
        managevitalsignButton.setText("Manage Smart Watch");
        managevitalsignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managevitalsignButtonActionPerformed(evt);
            }
        });
        add(managevitalsignButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 190, 40));

        age.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        age.setText("jLabel1");
        add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("(Age-");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText(")");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 10, -1));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/doctorvs.jpg"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 470, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void calculatevitalsignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatevitalsignButtonActionPerformed
        
        CalculateVitalSignJPanel area = new CalculateVitalSignJPanel(userProcessContainer,enterprise,userAccount,request,business);
        userProcessContainer.add("WorkArea",area);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_calculatevitalsignButtonActionPerformed

    private void managevitalsignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managevitalsignButtonActionPerformed
        
            ManageSmartWatchJPanel manageSmartWatchJPanel = new ManageSmartWatchJPanel(userProcessContainer, enterprise,request, userAccount,doctorOrganization,business);
            userProcessContainer.add("ManageSmartWatchJPanel", manageSmartWatchJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
    }//GEN-LAST:event_managevitalsignButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JButton backButton;
    private javax.swing.JButton calculatevitalsignButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton managevitalsignButton;
    private javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables
}
