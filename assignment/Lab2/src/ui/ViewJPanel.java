/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Car;
import model.CarsInformation;
import model.City;
import model.LeaseType;
import model.Manufacturer;

/**
 *
 * @author manojreddy
 */
public class ViewJPanel extends javax.swing.JPanel {

    private CarsInformation carsInformation;
    
    /**
     * Creates new form ViewJPanel
     */
    public ViewJPanel() {
        initComponents();
    }
    
    public ViewJPanel(CarsInformation carsInformation) {
        
        this.carsInformation = carsInformation;
        initComponents();
        userSelectedJPanel.setVisible(false);
        populateTable();
    }
    
    private void populateTable(){
        
        DefaultTableModel model = (DefaultTableModel) viewCarsTable.getModel();
        model.setRowCount(0);

        for(Car car:carsInformation.getCars()){
            
            Object[] row = new Object[12];
            row[0] = car;
            row[1] = car.isAvailability();
            row[2] = car.getManufacturer().name();
            row[3] = car.getManufacturedYear();
            row[4] = car.getSeatCapacity();
            row[5] = car.getSerialNumber();
            row[6] = car.getModelNumber();
            row[7] = formatDate(car.getCreatedDate());
            row[8] = formatDate(car.getLastUpdated());            
            row[9] = car.getOperatingCity().toString();
            row[10] = car.isMaintainanceCertificateExpired();
            row[11] = car.getLeaseType().toString();
            
            model.addRow(row);
        }
        
        if(carsInformation.getLastUpdatedOn()!=null){
            lastUpdatedOnDataJLabel.setText(formatDate(carsInformation.getLastUpdatedOn()));
        }
        countDataJLabel.setText(String.valueOf(carsInformation.getCars().size()));
        
    }

    private String formatDate(Date date){
       
        String pattern = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        return simpleDateFormat.format(date);
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
        viewCarsTable = new javax.swing.JTable();
        fleetUpdatedJLabel = new javax.swing.JLabel();
        viewJButton = new javax.swing.JButton();
        deleteJButton = new javax.swing.JButton();
        lastUpdatedOnDataJLabel = new javax.swing.JLabel();
        userSelectedJPanel = new javax.swing.JPanel();
        currentDistanceJLabel = new javax.swing.JLabel();
        currentDistanceJTextField = new javax.swing.JTextField();
        seatCapacityJLabel = new javax.swing.JLabel();
        seatCapacityJTextField = new javax.swing.JTextField();
        availabilityJLabel = new javax.swing.JLabel();
        availabilityJCheckBox = new javax.swing.JCheckBox();
        serialNoJLabel = new javax.swing.JLabel();
        serialNoJTextField = new javax.swing.JTextField();
        modelNoJLabel = new javax.swing.JLabel();
        modelNoJTextField = new javax.swing.JTextField();
        manufacturerJLabel = new javax.swing.JLabel();
        manufacturerJComboBox = new javax.swing.JComboBox<>();
        manufacturedYrJLabel = new javax.swing.JLabel();
        manufacturedYrJTextField = new javax.swing.JTextField();
        maintainanceExperiedJLabel = new javax.swing.JLabel();
        operatingCityJLabel = new javax.swing.JLabel();
        operatingCityJComboBox = new javax.swing.JComboBox<>();
        updateJButton = new javax.swing.JButton();
        maintainanceExpiryJCheckBox = new javax.swing.JCheckBox();
        leaseTypeJLabel = new javax.swing.JLabel();
        leaseTypeJComboBox = new javax.swing.JComboBox<>();
        headerDisplayJLabel = new javax.swing.JLabel();
        countJLabel = new javax.swing.JLabel();
        countDataJLabel = new javax.swing.JLabel();

        viewCarsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Distance", "Availability", "Manufacturer", "Manufactured-Yr", "Seat Capacity", "Serial No", "Model No", "Created On", "Updated On", "City", "Maintaince Cert Exp", "Lease Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        viewCarsTable.getTableHeader().setReorderingAllowed(false);
        viewCarsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewCarsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(viewCarsTable);

        fleetUpdatedJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        fleetUpdatedJLabel.setText("Fleet Last Updated On :");

        viewJButton.setText("View");
        viewJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewJButtonActionPerformed(evt);
            }
        });

        deleteJButton.setText("Delete");
        deleteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJButtonActionPerformed(evt);
            }
        });

        userSelectedJPanel.setBackground(new java.awt.Color(102, 255, 255));

        currentDistanceJLabel.setText("Current Distance:");

        currentDistanceJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                currentDistanceJTextFieldKeyReleased(evt);
            }
        });

        seatCapacityJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        seatCapacityJLabel.setText("Seat Capacity:");

        seatCapacityJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                seatCapacityJTextFieldKeyReleased(evt);
            }
        });

        availabilityJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        availabilityJLabel.setText("Availability:");

        serialNoJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        serialNoJLabel.setText("Serial No:");

        serialNoJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                serialNoJTextFieldKeyReleased(evt);
            }
        });

        modelNoJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        modelNoJLabel.setText("Model No:");

        modelNoJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                modelNoJTextFieldKeyReleased(evt);
            }
        });

        manufacturerJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        manufacturerJLabel.setText("Manufacturer:");

        manufacturedYrJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        manufacturedYrJLabel.setText("Manufactured Yr:");

        manufacturedYrJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                manufacturedYrJTextFieldKeyReleased(evt);
            }
        });

        maintainanceExperiedJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        maintainanceExperiedJLabel.setText("Maintainance Exp:");

        operatingCityJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        operatingCityJLabel.setText("Operating City:");

        updateJButton.setText("Update");
        updateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJButtonActionPerformed(evt);
            }
        });

        leaseTypeJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        leaseTypeJLabel.setText("Lease Type:");

        javax.swing.GroupLayout userSelectedJPanelLayout = new javax.swing.GroupLayout(userSelectedJPanel);
        userSelectedJPanel.setLayout(userSelectedJPanelLayout);
        userSelectedJPanelLayout.setHorizontalGroup(
            userSelectedJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userSelectedJPanelLayout.createSequentialGroup()
                .addGroup(userSelectedJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userSelectedJPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(userSelectedJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(userSelectedJPanelLayout.createSequentialGroup()
                                .addComponent(currentDistanceJLabel)
                                .addGap(18, 18, 18)
                                .addComponent(currentDistanceJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(userSelectedJPanelLayout.createSequentialGroup()
                                .addGroup(userSelectedJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(leaseTypeJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(userSelectedJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(manufacturedYrJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(serialNoJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(userSelectedJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(serialNoJTextField)
                                    .addComponent(manufacturedYrJTextField)
                                    .addGroup(userSelectedJPanelLayout.createSequentialGroup()
                                        .addComponent(leaseTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(124, 124, 124)
                        .addGroup(userSelectedJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(userSelectedJPanelLayout.createSequentialGroup()
                                .addGroup(userSelectedJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(modelNoJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(seatCapacityJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(userSelectedJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(modelNoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(seatCapacityJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(userSelectedJPanelLayout.createSequentialGroup()
                                .addComponent(maintainanceExperiedJLabel)
                                .addGap(18, 18, 18)
                                .addComponent(maintainanceExpiryJCheckBox)))
                        .addGap(56, 56, 56)
                        .addGroup(userSelectedJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(userSelectedJPanelLayout.createSequentialGroup()
                                .addComponent(operatingCityJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(operatingCityJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(userSelectedJPanelLayout.createSequentialGroup()
                                .addComponent(availabilityJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(availabilityJCheckBox))
                            .addGroup(userSelectedJPanelLayout.createSequentialGroup()
                                .addComponent(manufacturerJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(manufacturerJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(userSelectedJPanelLayout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addComponent(updateJButton)))
                .addGap(42, 51, Short.MAX_VALUE))
        );

        userSelectedJPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {currentDistanceJLabel, serialNoJLabel});

        userSelectedJPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {manufacturerJComboBox, operatingCityJComboBox});

        userSelectedJPanelLayout.setVerticalGroup(
            userSelectedJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userSelectedJPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(userSelectedJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(availabilityJCheckBox)
                    .addGroup(userSelectedJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(currentDistanceJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(currentDistanceJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(seatCapacityJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(seatCapacityJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(availabilityJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(userSelectedJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serialNoJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serialNoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modelNoJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modelNoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manufacturerJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manufacturerJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(userSelectedJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userSelectedJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(operatingCityJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(operatingCityJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(userSelectedJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(manufacturedYrJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(manufacturedYrJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(maintainanceExperiedJLabel)
                        .addComponent(maintainanceExpiryJCheckBox)))
                .addGroup(userSelectedJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userSelectedJPanelLayout.createSequentialGroup()
                        .addGroup(userSelectedJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(leaseTypeJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(leaseTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(75, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userSelectedJPanelLayout.createSequentialGroup()
                        .addGap(0, 53, Short.MAX_VALUE)
                        .addComponent(updateJButton)
                        .addGap(20, 20, 20))))
        );

        headerDisplayJLabel.setFont(new java.awt.Font("Kokonor", 1, 18)); // NOI18N
        headerDisplayJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerDisplayJLabel.setText("Displaying all the Fleet of Cars currently on UBER");

        countJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        countJLabel.setText("Count :");

        countDataJLabel.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(fleetUpdatedJLabel)
                        .addGap(18, 18, 18)
                        .addComponent(lastUpdatedOnDataJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(countJLabel)
                        .addGap(18, 18, 18)
                        .addComponent(countDataJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewJButton)
                        .addGap(18, 18, 18)
                        .addComponent(deleteJButton)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(userSelectedJPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(headerDisplayJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {fleetUpdatedJLabel, lastUpdatedOnDataJLabel});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {deleteJButton, viewJButton});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {countDataJLabel, countJLabel});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(headerDisplayJLabel)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lastUpdatedOnDataJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fleetUpdatedJLabel)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(countJLabel)
                                .addComponent(countDataJLabel))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(deleteJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(viewJButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userSelectedJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {fleetUpdatedJLabel, lastUpdatedOnDataJLabel});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {countDataJLabel, countJLabel});

    }// </editor-fold>//GEN-END:initComponents

    private void viewJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewJButtonActionPerformed
        // TODO add your handling code here:
        int userSelectedIndex = viewCarsTable.getSelectedRow();
        if(userSelectedIndex <0){
            JOptionPane.showMessageDialog(this, "Please Select any Car to View");
            return;
        }
        displaySelectedCarData(userSelectedIndex);
    }//GEN-LAST:event_viewJButtonActionPerformed

    private void deleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJButtonActionPerformed
        // TODO add your handling code here:
        int userSelectedIndex = viewCarsTable.getSelectedRow();
        if(userSelectedIndex <0){
            JOptionPane.showMessageDialog(this, "Please Select any Car to Delete");
            return;
        }
        deleteSelectedCarData(userSelectedIndex);
        
    }//GEN-LAST:event_deleteJButtonActionPerformed

    private void viewCarsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewCarsTableMouseClicked
        // TODO add your handling code here:
        viewJButtonActionPerformed(null);
    }//GEN-LAST:event_viewCarsTableMouseClicked

    private void updateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJButtonActionPerformed
        // TODO add your handling code here:
        
        currentDistanceJTextFieldKeyReleased(null);
        serialNoJTextFieldKeyReleased(null);
        manufacturedYrJTextFieldKeyReleased(null);
        seatCapacityJTextFieldKeyReleased(null);
        modelNoJTextFieldKeyReleased(null);
        
        if(isDataEnteredValid()){
            if(!isDataNotUpdatedByUser()){

                if(isSerialNounique()){
                    setUpdatedData();   
                    int selectedRow = viewCarsTable.getSelectedRow();
                    populateTable();
                    viewCarsTable.setRowSelectionInterval(selectedRow, selectedRow);
                    JOptionPane.showMessageDialog(this, "Changes has been Successfully saved");
                }else{
                    JOptionPane.showMessageDialog(this, "Changes not Saved. Serial No already Existed");                
                }

            }else{
                JOptionPane.showMessageDialog(this, "No changes has been made");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Please enter valid data");
        }
    }//GEN-LAST:event_updateJButtonActionPerformed

    private boolean isDataEnteredValid() {
        
        if(isDistanceValid() && isSeatCapacityValid() && isSerialNoValid() &&
                isModelNoValid() && isManufacturedYrValid()){
            return true;
        }
        return false;
    }
    
    private void currentDistanceJTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_currentDistanceJTextFieldKeyReleased
        // TODO add your handling code here:
        if(isDistanceValid()) {
            currentDistanceJTextField.setBackground(Color.WHITE);
        }else{
            currentDistanceJTextField.setBackground(Color.RED);
        }
    }//GEN-LAST:event_currentDistanceJTextFieldKeyReleased

    private void serialNoJTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serialNoJTextFieldKeyReleased
        // TODO add your handling code here:
        if(isSerialNoValid()){
            serialNoJTextField.setBackground(Color.WHITE);
        }else{
            serialNoJTextField.setBackground(Color.RED);
        }
    }//GEN-LAST:event_serialNoJTextFieldKeyReleased

    private void manufacturedYrJTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_manufacturedYrJTextFieldKeyReleased
        // TODO add your handling code here:
        if(isManufacturedYrValid()){
            manufacturedYrJTextField.setBackground(Color.WHITE);
        }else{
            manufacturedYrJTextField.setBackground(Color.RED);
        }
    }//GEN-LAST:event_manufacturedYrJTextFieldKeyReleased

    private void seatCapacityJTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_seatCapacityJTextFieldKeyReleased
        // TODO add your handling code here:
        if(isSeatCapacityValid()){
            seatCapacityJTextField.setBackground(Color.WHITE);
        }else {
            seatCapacityJTextField.setBackground(Color.RED);
        }
    }//GEN-LAST:event_seatCapacityJTextFieldKeyReleased

    private void modelNoJTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modelNoJTextFieldKeyReleased
        // TODO add your handling code here:
        if(isModelNoValid()) {
            modelNoJTextField.setBackground(Color.WHITE);
        }else{
            modelNoJTextField.setBackground(Color.RED);
        }
    }//GEN-LAST:event_modelNoJTextFieldKeyReleased

    
    private boolean isSerialNounique() {
        
        boolean serianNoUnique = true;
        int userSelectedIndex = viewCarsTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) viewCarsTable.getModel();        
        Car userSelectedCar = (Car) model.getValueAt(userSelectedIndex,0);
        if(userSelectedCar.getSerialNumber().contentEquals(serialNoJTextField.getText().replace(" ", ""))){
            return serianNoUnique;
        }
        for(Car car:carsInformation.getCars()){
            if(car.getSerialNumber().contentEquals(serialNoJTextField.getText().replace(" ", ""))){
                serianNoUnique = false;
            }
        }
        
        return serianNoUnique;
    }
    
    private boolean isSerialNoValid() {
        
        String serialNo = serialNoJTextField.getText().replace(" ", "");
        if(serialNo.isBlank()){
            return false;
        }
        if(isSerialNounique()){
            return true;
        }
        return false;
    }
    
    private void setUpdatedData(){
        
        int userSelectedIndex = viewCarsTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) viewCarsTable.getModel();        
        Car userSelectedCar = (Car) model.getValueAt(userSelectedIndex,0);
        
        userSelectedCar.setAvailability(availabilityJCheckBox.isSelected());
        userSelectedCar.setDistanceFromUser(Double.valueOf(currentDistanceJTextField.getText()));
        userSelectedCar.setManufacturer(Manufacturer.valueOf((String) manufacturerJComboBox.getSelectedItem()));
        userSelectedCar.setManufacturedYear(manufacturedYrJTextField.getText());
        userSelectedCar.setModelNumber(modelNoJTextField.getText());
        userSelectedCar.setOperatingCity(City.valueOf((String) operatingCityJComboBox.getSelectedItem()));
        userSelectedCar.setMaintainanceCertificateExpired(maintainanceExpiryJCheckBox.isSelected());
        userSelectedCar.setSeatCapacity(Integer.valueOf(seatCapacityJTextField.getText()));
        userSelectedCar.setSerialNumber(serialNoJTextField.getText());
        userSelectedCar.setLastUpdated(new Date());
        userSelectedCar.setLeaseType(LeaseType.valueOf((String) leaseTypeJComboBox.getSelectedItem()));
        carsInformation.setLastUpdatedOn(new Date());

    }
    
    private boolean isDataNotUpdatedByUser(){
        //TODO
        int userSelectedIndex = viewCarsTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) viewCarsTable.getModel();        
        Car userSelectedCar = (Car) model.getValueAt(userSelectedIndex,0);
        return userSelectedCar.objectEqualityCheck(Double.valueOf(currentDistanceJTextField.getText().replace(" ","")), availabilityJCheckBox.isSelected(), 
                Manufacturer.valueOf((String) manufacturerJComboBox.getSelectedItem()), manufacturedYrJTextField.getText().replace(" ", ""), 
                Integer.valueOf(seatCapacityJTextField.getText().replace(" ","")), serialNoJTextField.getText().replace(" ",""), modelNoJTextField.getText().replace(" ",""), 
                City.valueOf((String) operatingCityJComboBox.getSelectedItem()), maintainanceExpiryJCheckBox.isSelected(),
                LeaseType.valueOf((String) leaseTypeJComboBox.getSelectedItem()));
    }
    
    private void deleteSelectedCarData(int userSelectedIndex) {
        
        userSelectedJPanel.setVisible(false);
        DefaultTableModel model = (DefaultTableModel) viewCarsTable.getModel();
        Car userSelectedCar = (Car) model.getValueAt(userSelectedIndex,0);
        carsInformation.remove(userSelectedCar);
        populateTable();
        JOptionPane.showMessageDialog(this, "Successfully Deleted the Car details");
    }
    
    private void displaySelectedCarData(int userSelectedIndex){
        
        userSelectedJPanel.setVisible(true);
        DefaultTableModel model = (DefaultTableModel) viewCarsTable.getModel();
        Car userSelectedCar = (Car) model.getValueAt(userSelectedIndex,0);
        setDataInUI(userSelectedCar);
        
    }
    
    private void setDataInUI(Car car) {
        
        currentDistanceJTextField.setText(String.valueOf(car.getDistanceFromUser()));
        seatCapacityJTextField.setText(String.valueOf(car.getSeatCapacity()));
        manufacturedYrJTextField.setText(car.getManufacturedYear());
        serialNoJTextField.setText(car.getSerialNumber());
        modelNoJTextField.setText(car.getModelNumber());
        if(car.isAvailability()){
            availabilityJCheckBox.setSelected(true);
        }else{
            availabilityJCheckBox.setSelected(false);
        }
        if(car.isMaintainanceCertificateExpired()){
            maintainanceExpiryJCheckBox.setSelected(true);
        }else{
            maintainanceExpiryJCheckBox.setSelected(false);
        }
        
        initializeUIDefaultvalues();
        
        manufacturerJComboBox.setSelectedItem(car.getManufacturer().name());
        operatingCityJComboBox.setSelectedItem(car.getOperatingCity().name());
        leaseTypeJComboBox.setSelectedItem(car.getLeaseType().name());
        
    }
    
    private void initializeUIDefaultvalues(){
        
        manufacturerJComboBox.removeAllItems();
        String[] manufacturers = Manufacturer.getManufactureArray();
        for(String manufacturer:manufacturers){
            manufacturerJComboBox.addItem(manufacturer);
        }
        
        operatingCityJComboBox.removeAllItems();
        String[] operatingCities = City.getOperatingCitiesArray();
        for(String city:operatingCities){
            operatingCityJComboBox.addItem(city);
        }
        
        leaseTypeJComboBox.removeAllItems();
        String[] leaseTypes = LeaseType.getAllLeaseTypes();
        for(String leaseType:leaseTypes){
            leaseTypeJComboBox.addItem(leaseType);
        }
        
    }
    
    private boolean isDistanceValid() {
        
        String distance = currentDistanceJTextField.getText().replace(" ", "");
        if(distance.isBlank()){
            return false;
        }
        try{
            Double distanceValue = Double.valueOf(distance);
            if(Double.compare(distanceValue, 0) >0){
                return true;
            }else{
                return false;
            }
        }catch(Exception e){
            return false;
        }
    }

    private boolean isManufacturedYrValid() {
        
        String manufacturedYr = manufacturedYrJTextField.getText().replace(" ", "");
        if(manufacturedYr.isBlank()){
            return false;
        }
        try {
            Integer year = Integer.valueOf(manufacturedYr);
            if(Integer.compare(year, 0) >0 && Integer.compare(2022, year) > 0){
                return true;
            }
            return false;
        } catch (Exception e){
            return false;
        }
    }    
    
    private boolean isSeatCapacityValid() {
        
        String seats = seatCapacityJTextField.getText().replace(" ", "");
        if(seats.isBlank()){
            return false;
        }
        try{
            Integer seatCapacity = Integer.valueOf(seats);
            if(Integer.compare(seatCapacity, 0) > 0){
                return true;
            }
            return false;
        }catch (Exception e){
            return false;
        }
    }

    private boolean isModelNoValid() {
        
        String modelNo = modelNoJTextField.getText().replace(" ", "");
        if(modelNo.isBlank()){
            return false;
        }
        return true;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox availabilityJCheckBox;
    private javax.swing.JLabel availabilityJLabel;
    private javax.swing.JLabel countDataJLabel;
    private javax.swing.JLabel countJLabel;
    private javax.swing.JLabel currentDistanceJLabel;
    private javax.swing.JTextField currentDistanceJTextField;
    private javax.swing.JButton deleteJButton;
    private javax.swing.JLabel fleetUpdatedJLabel;
    private javax.swing.JLabel headerDisplayJLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastUpdatedOnDataJLabel;
    private javax.swing.JComboBox<String> leaseTypeJComboBox;
    private javax.swing.JLabel leaseTypeJLabel;
    private javax.swing.JLabel maintainanceExperiedJLabel;
    private javax.swing.JCheckBox maintainanceExpiryJCheckBox;
    private javax.swing.JLabel manufacturedYrJLabel;
    private javax.swing.JTextField manufacturedYrJTextField;
    private javax.swing.JComboBox<String> manufacturerJComboBox;
    private javax.swing.JLabel manufacturerJLabel;
    private javax.swing.JLabel modelNoJLabel;
    private javax.swing.JTextField modelNoJTextField;
    private javax.swing.JComboBox<String> operatingCityJComboBox;
    private javax.swing.JLabel operatingCityJLabel;
    private javax.swing.JLabel seatCapacityJLabel;
    private javax.swing.JTextField seatCapacityJTextField;
    private javax.swing.JLabel serialNoJLabel;
    private javax.swing.JTextField serialNoJTextField;
    private javax.swing.JButton updateJButton;
    private javax.swing.JPanel userSelectedJPanel;
    private javax.swing.JTable viewCarsTable;
    private javax.swing.JButton viewJButton;
    // End of variables declaration//GEN-END:variables
}
