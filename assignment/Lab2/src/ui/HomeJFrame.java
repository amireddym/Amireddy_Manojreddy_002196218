/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import helper.DataSerializer;
import java.util.ArrayList;
import java.util.List;
import model.Car;
import model.CarsInformation;

/**
 *
 * @author manojreddy
 */
public class HomeJFrame extends javax.swing.JFrame {

    private CarsInformation carsInformation;
    
    /**
     * Creates new form HomeJFrame
     */
    public HomeJFrame() {
        initComponents();
        this.carsInformation = new CarsInformation(DataSerializer.serializeData()); 
        HomeJPanel homeJPanel = new HomeJPanel();
        homeSplitPane.setRightComponent(homeJPanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homeSplitPane = new javax.swing.JSplitPane();
        controlJPanel = new javax.swing.JPanel();
        createJButton = new javax.swing.JButton();
        viewJButton = new javax.swing.JButton();
        filterJButton = new javax.swing.JButton();
        edaJButton = new javax.swing.JButton();
        viewJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        controlJPanel.setBackground(new java.awt.Color(102, 153, 255));

        createJButton.setText("Create");
        createJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createJButtonActionPerformed(evt);
            }
        });

        viewJButton.setText("View");
        viewJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewJButtonActionPerformed(evt);
            }
        });

        filterJButton.setText("Filter");
        filterJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterJButtonActionPerformed(evt);
            }
        });

        edaJButton.setText("EDA");
        edaJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edaJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlJPanelLayout = new javax.swing.GroupLayout(controlJPanel);
        controlJPanel.setLayout(controlJPanelLayout);
        controlJPanelLayout.setHorizontalGroup(
            controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(createJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(viewJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(filterJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(edaJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        controlJPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {createJButton, viewJButton});

        controlJPanelLayout.setVerticalGroup(
            controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlJPanelLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(createJButton)
                .addGap(18, 18, 18)
                .addComponent(viewJButton)
                .addGap(18, 18, 18)
                .addComponent(filterJButton)
                .addGap(18, 18, 18)
                .addComponent(edaJButton)
                .addContainerGap(599, Short.MAX_VALUE))
        );

        controlJPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {createJButton, viewJButton});

        homeSplitPane.setLeftComponent(controlJPanel);

        javax.swing.GroupLayout viewJPanelLayout = new javax.swing.GroupLayout(viewJPanel);
        viewJPanel.setLayout(viewJPanelLayout);
        viewJPanelLayout.setHorizontalGroup(
            viewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1427, Short.MAX_VALUE)
        );
        viewJPanelLayout.setVerticalGroup(
            viewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );

        homeSplitPane.setRightComponent(viewJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeSplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeSplitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createJButtonActionPerformed
        // TODO add your handling code here:
        CreateJPanel createJPanel = new CreateJPanel(carsInformation);
        homeSplitPane.setRightComponent(createJPanel);
    }//GEN-LAST:event_createJButtonActionPerformed

    private void viewJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewJButtonActionPerformed
        // TODO add your handling code here:
        ViewJPanel viewJPanel = new ViewJPanel(carsInformation);
        homeSplitPane.setRightComponent(viewJPanel);
    }//GEN-LAST:event_viewJButtonActionPerformed

    private void filterJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterJButtonActionPerformed
        // TODO add your handling code here:
        FilterJPanel filterJpanel = new FilterJPanel(carsInformation);
        homeSplitPane.setRightComponent(filterJpanel);
    }//GEN-LAST:event_filterJButtonActionPerformed

    private void edaJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edaJButtonActionPerformed
        // TODO add your handling code here:
        EdaJPanel edaPanel = new EdaJPanel(carsInformation);
        homeSplitPane.setRightComponent(edaPanel);
    }//GEN-LAST:event_edaJButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel controlJPanel;
    private javax.swing.JButton createJButton;
    private javax.swing.JButton edaJButton;
    private javax.swing.JButton filterJButton;
    private javax.swing.JSplitPane homeSplitPane;
    private javax.swing.JButton viewJButton;
    private javax.swing.JPanel viewJPanel;
    // End of variables declaration//GEN-END:variables
}
