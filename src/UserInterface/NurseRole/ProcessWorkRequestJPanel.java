/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.NurseRole;

import Business.WorkQueue.NurseTestWorkRequest;
import com.sun.glass.events.KeyEvent;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Achal Sancheti
 */
public class ProcessWorkRequestJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    NurseTestWorkRequest request;

    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public ProcessWorkRequestJPanel(JPanel userProcessContainer,NurseTestWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bloodgroupTextField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        barcodeTextField = new javax.swing.JTextField();
        resolvedateTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submitButton.setBackground(new java.awt.Color(0, 0, 0));
        submitButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("Submit Result");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, -1, 31));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Blood Group");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        bloodgroupTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bloodgroupTextFieldKeyTyped(evt);
            }
        });
        add(bloodgroupTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 120, -1));

        backButton.setBackground(new java.awt.Color(0, 0, 0));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("<<Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, 31));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Bar Code");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Resolve Date");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        barcodeTextField.setEnabled(false);
        add(barcodeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 120, -1));

        resolvedateTextField.setEnabled(false);
        add(resolvedateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 120, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/blood.jpg"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 340, 230));

        jLabel5.setText("jLabel5");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        if(!bloodgroupTextField.getText().isEmpty()){
        request.setBloodGroup(bloodgroupTextField.getText());
        request.setStatus("Completed");
        
        JOptionPane.showMessageDialog(null, "Request Is processed","Success",JOptionPane.INFORMATION_MESSAGE);
        bloodgroupTextField.setText("");
        }
        else{
        JOptionPane.showMessageDialog(null, "Please Enter The Blood Group","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        NurseWorkAreaJPanel lwjp = (NurseWorkAreaJPanel) component;
        lwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void bloodgroupTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bloodgroupTextFieldKeyTyped
        
        char c = evt.getKeyChar();
        if(!(c=='A'||c=='B'||c=='+'||c=='-'||c=='O'||c==KeyEvent.VK_BACKSPACE||c==KeyEvent.VK_DELETE||c==KeyEvent.VK_SPACE||c==KeyEvent.VK_SHIFT))
        {
        evt.consume();
        JOptionPane.showMessageDialog(null, "Please Enter Correct Blood Group","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bloodgroupTextFieldKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField barcodeTextField;
    private javax.swing.JTextField bloodgroupTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField resolvedateTextField;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
