/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ReceptionistRole;

import Business.Enterprise.Enterprise;
import Business.Organization.ReceptionistOrganization;
import Business.MainUserAccount.MainUserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Achal Sancheti
 */
public class ReceptionistJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private ReceptionistOrganization organization;
    private Enterprise enterprise;
    private MainUserAccount userAccount;
    /**
     * Creates new form ReceptionistJPanel
     */
    public ReceptionistJPanel(JPanel userProcessContainer, MainUserAccount account, ReceptionistOrganization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        valueLabel.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        managepatientButton = new javax.swing.JButton();
        managedonorButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(51, 51, 255));
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 190, 30));

        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(51, 51, 255));
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 150, 30));

        managepatientButton.setBackground(new java.awt.Color(0, 0, 0));
        managepatientButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        managepatientButton.setForeground(new java.awt.Color(255, 255, 255));
        managepatientButton.setText("Manage Patient");
        managepatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managepatientButtonActionPerformed(evt);
            }
        });
        add(managepatientButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 160, 40));

        managedonorButton.setBackground(new java.awt.Color(0, 0, 0));
        managedonorButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        managedonorButton.setForeground(new java.awt.Color(255, 255, 255));
        managedonorButton.setText("Manage Donor");
        managedonorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managedonorButtonActionPerformed(evt);
            }
        });
        add(managedonorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 160, 40));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Receptionist Work Area");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 510, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/recep.jpg"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void managepatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managepatientButtonActionPerformed
        
         ReceptionistWorkAreaJPanel view = new ReceptionistWorkAreaJPanel(userProcessContainer,userAccount,organization,enterprise);
         userProcessContainer.add("ReceptionistWorkAreaJPanel",view);
         CardLayout layout = (CardLayout)userProcessContainer.getLayout();
         layout.next(userProcessContainer);
    }//GEN-LAST:event_managepatientButtonActionPerformed

    private void managedonorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managedonorButtonActionPerformed
        
         ReceptionistDonorJPanel view = new ReceptionistDonorJPanel(userProcessContainer,userAccount,organization,enterprise);
         userProcessContainer.add("ReceptionistDonorJPanel",view);
         CardLayout layout = (CardLayout)userProcessContainer.getLayout();
         layout.next(userProcessContainer);
    }//GEN-LAST:event_managedonorButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton managedonorButton;
    private javax.swing.JButton managepatientButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
