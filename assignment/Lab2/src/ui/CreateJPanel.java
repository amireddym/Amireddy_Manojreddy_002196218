package ui;

import java.awt.Color;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Car;
import model.CarsInformation;
import model.City;
import model.LeaseType;
import model.Manufacturer;

/**
 *
 * @author manojreddy
 */
public class CreateJPanel extends javax.swing.JPanel {

    private CarsInformation carsInformation;
    
    /**
     * Creates new form CreateJPanel
     */
    public CreateJPanel() {
        initComponents();
    }
    
    public CreateJPanel(CarsInformation carsInformation) {
        initComponents();
        initializeUIvalues();
        this.carsInformation = carsInformation;
    }
    
    private void initializeUIvalues(){
        
        String[] manufacturers = Manufacturer.getManufactureArray();
        for(String manufacturer:manufacturers){
            manufacturerJComboBox.addItem(manufacturer);
        }
        
        String[] operatingCities = City.getOperatingCitiesArray();
        for(String city:operatingCities){
            operatingCityJComboBox.addItem(city);
        }
        
        String[] leaseTypes = LeaseType.getAllLeaseTypes();
        for(String leaseType:leaseTypes){
            leaseTypeJComboBox.addItem(leaseType);
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

        createJLabel = new javax.swing.JLabel();
        currentDistanceJLabel = new javax.swing.JLabel();
        distanceJTextField = new javax.swing.JTextField();
        availabilityJLabel = new javax.swing.JLabel();
        availabilityJCheckBox = new javax.swing.JCheckBox();
        manufacturerJLabel = new javax.swing.JLabel();
        manufacturedYearJLabel = new javax.swing.JLabel();
        manufacturedYearJTextField = new javax.swing.JTextField();
        seatCapacityJLabel = new javax.swing.JLabel();
        seatCapacityJTextField = new javax.swing.JTextField();
        serialNoJLabel = new javax.swing.JLabel();
        serialNoJTextField = new javax.swing.JTextField();
        modelNoJLabel = new javax.swing.JLabel();
        modelNoJTextField = new javax.swing.JTextField();
        operatingCityJLabel = new javax.swing.JLabel();
        maintainanceExperiedJLabel = new javax.swing.JLabel();
        maintainanceJCheckBox = new javax.swing.JCheckBox();
        addJButton = new javax.swing.JButton();
        operatingCityJComboBox = new javax.swing.JComboBox<>();
        manufacturerJComboBox = new javax.swing.JComboBox<>();
        leaseTypeJComboBox = new javax.swing.JComboBox<>();
        leaseTypeJLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));

        createJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        createJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createJLabel.setText("Add New Car to Fleet");

        currentDistanceJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        currentDistanceJLabel.setText("Current Distance:");

        distanceJTextField.setToolTipText("Enter only Floating Number");
        distanceJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                distanceJTextFieldKeyReleased(evt);
            }
        });

        availabilityJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        availabilityJLabel.setText("Availability:");

        manufacturerJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        manufacturerJLabel.setText("Manufacturer:");

        manufacturedYearJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        manufacturedYearJLabel.setText("Manufactured Yr:");

        manufacturedYearJTextField.setToolTipText("yyyy Format only");
        manufacturedYearJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                manufacturedYearJTextFieldKeyReleased(evt);
            }
        });

        seatCapacityJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        seatCapacityJLabel.setText("Seat Capacity:");

        seatCapacityJTextField.setToolTipText("Enter only Numbers");
        seatCapacityJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                seatCapacityJTextFieldKeyReleased(evt);
            }
        });

        serialNoJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        serialNoJLabel.setText("Serial No:");

        serialNoJTextField.setToolTipText("Only charecters and Numbers");
        serialNoJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                serialNoJTextFieldKeyReleased(evt);
            }
        });

        modelNoJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        modelNoJLabel.setText("Model No:");

        modelNoJTextField.setToolTipText("Only charecters and Numbers");
        modelNoJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                modelNoJTextFieldKeyReleased(evt);
            }
        });

        operatingCityJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        operatingCityJLabel.setText("Operating City:");

        maintainanceExperiedJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        maintainanceExperiedJLabel.setText("Maintainance Exp:");

        addJButton.setText("Add");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        leaseTypeJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        leaseTypeJLabel.setText("Lease Type:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(currentDistanceJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(availabilityJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(manufacturerJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(manufacturedYearJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(maintainanceExperiedJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(distanceJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                .addComponent(availabilityJCheckBox)
                                .addComponent(manufacturedYearJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                .addComponent(manufacturerJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(maintainanceJCheckBox))
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(operatingCityJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(leaseTypeJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(operatingCityJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(seatCapacityJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                .addComponent(serialNoJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                .addComponent(modelNoJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                            .addComponent(leaseTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(createJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(535, Short.MAX_VALUE)
                                .addComponent(modelNoJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(serialNoJLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                    .addComponent(seatCapacityJLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))))
                        .addGap(150, 150, 150)))
                .addContainerGap(182, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(367, 367, 367)
                .addComponent(addJButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {distanceJTextField, manufacturedYearJTextField});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {seatCapacityJLabel, serialNoJLabel});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(createJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentDistanceJLabel)
                    .addComponent(distanceJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatCapacityJLabel)
                    .addComponent(seatCapacityJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(availabilityJCheckBox, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(availabilityJLabel)
                        .addComponent(serialNoJLabel)
                        .addComponent(serialNoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manufacturerJLabel)
                    .addComponent(modelNoJLabel)
                    .addComponent(modelNoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manufacturerJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manufacturedYearJLabel)
                    .addComponent(manufacturedYearJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(operatingCityJLabel)
                    .addComponent(operatingCityJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maintainanceExperiedJLabel)
                            .addComponent(maintainanceJCheckBox)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(leaseTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(leaseTypeJLabel))))
                .addGap(40, 40, 40)
                .addComponent(addJButton)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {distanceJTextField, manufacturedYearJTextField});

    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        // TODO add your handling code here:
        
        distanceJTextFieldKeyReleased(null);
        seatCapacityJTextFieldKeyReleased(null);
        modelNoJTextFieldKeyReleased(null);
        manufacturedYearJTextFieldKeyReleased(null);
        serialNoJTextFieldKeyReleased(null);
        
        if(isDataEnteredValid()){
            addCarToFleet();
            JOptionPane.showMessageDialog(this, "Car successfully added to the fleet");
            resetUi();
        }else{
            JOptionPane.showMessageDialog(this, "Car info is not Saved. Please enter valid data");
        }
    }//GEN-LAST:event_addJButtonActionPerformed

    private void distanceJTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_distanceJTextFieldKeyReleased
        // TODO add your handling code here:
        if(isDistanceValid()){
            distanceJTextField.setBackground(Color.WHITE);
        }else{
            distanceJTextField.setBackground(Color.RED);
        }
    }//GEN-LAST:event_distanceJTextFieldKeyReleased

    private void manufacturedYearJTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_manufacturedYearJTextFieldKeyReleased
        // TODO add your handling code here:
        if(isManufacturedYrValid()){
            manufacturedYearJTextField.setBackground(Color.WHITE);
        }else{
            manufacturedYearJTextField.setBackground(Color.RED);
        }
    }//GEN-LAST:event_manufacturedYearJTextFieldKeyReleased

    private void seatCapacityJTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_seatCapacityJTextFieldKeyReleased
        // TODO add your handling code here:
        if(isSeatCapacityValid()){
            seatCapacityJTextField.setBackground(Color.WHITE);
        }else {
            seatCapacityJTextField.setBackground(Color.RED);
        }
    }//GEN-LAST:event_seatCapacityJTextFieldKeyReleased

    private void serialNoJTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serialNoJTextFieldKeyReleased
        // TODO add your handling code here:
        if(isSerialNoValid()){
            serialNoJTextField.setBackground(Color.WHITE);
        }else{
            serialNoJTextField.setBackground(Color.RED);
        }
    }//GEN-LAST:event_serialNoJTextFieldKeyReleased

    private void modelNoJTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modelNoJTextFieldKeyReleased
        // TODO add your handling code here:
        if(isModelNoValid()){
            modelNoJTextField.setBackground(Color.WHITE);
        }else{
            modelNoJTextField.setBackground(Color.RED);
        }
    }//GEN-LAST:event_modelNoJTextFieldKeyReleased
    
    private boolean isDataEnteredValid() {
        
        if(isDistanceValid() && isSeatCapacityValid() && isSerialNoValid() &&
                isModelNoValid() && isManufacturedYrValid()){
            return true;
        }
        return false;
    }
    
    private boolean isManufacturedYrValid() {
        
        String manufacturedYr = manufacturedYearJTextField.getText().replace(" ", "");
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
    
    private boolean isSerialNounique() {
        
        boolean serianNoUnique = true;
        for(Car car:carsInformation.getCars()){
            if(car.getSerialNumber().contentEquals(serialNoJTextField.getText().replace(" ", ""))){
                serianNoUnique = false;
            }
        }
        
        return serianNoUnique;
    }
    
    private boolean isModelNoValid() {
        
        String modelNo = modelNoJTextField.getText().replace(" ", "");
        if(modelNo.isBlank()){
            return false;
        }
        return true;
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
    
    private boolean isDistanceValid() {
        
        String distance = distanceJTextField.getText().replace(" ", "");
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
    
    private void addCarToFleet() {
        
        carsInformation.add(
                new Car(Double.valueOf(distanceJTextField.getText().replace(" ", "")), availabilityJCheckBox.isSelected(), 
                Manufacturer.valueOf(String.valueOf(manufacturerJComboBox.getSelectedItem())), manufacturedYearJTextField.getText().replace(" ",""), 
                Integer.valueOf(seatCapacityJTextField.getText().replace(" ","")),serialNoJTextField.getText().replace(" ",""),
                modelNoJTextField.getText().replace(" ", ""), new Date(), 
                City.valueOf(String.valueOf(operatingCityJComboBox.getSelectedItem())), maintainanceJCheckBox.isSelected(),
                LeaseType.valueOf(String.valueOf(leaseTypeJComboBox.getSelectedItem()))));
    }
    
    private void resetUi() {
        
        distanceJTextField.setText("");
        availabilityJCheckBox.setSelected(false);
        manufacturerJComboBox.setSelectedIndex(0);
        manufacturedYearJTextField.setText("");
        seatCapacityJTextField.setText("");
        serialNoJTextField.setText("");
        modelNoJTextField.setText("");
        operatingCityJComboBox.setSelectedIndex(0);
        maintainanceJCheckBox.setSelected(false);
        leaseTypeJComboBox.setSelectedIndex(0);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JCheckBox availabilityJCheckBox;
    private javax.swing.JLabel availabilityJLabel;
    private javax.swing.JLabel createJLabel;
    private javax.swing.JLabel currentDistanceJLabel;
    private javax.swing.JTextField distanceJTextField;
    private javax.swing.JComboBox<String> leaseTypeJComboBox;
    private javax.swing.JLabel leaseTypeJLabel;
    private javax.swing.JLabel maintainanceExperiedJLabel;
    private javax.swing.JCheckBox maintainanceJCheckBox;
    private javax.swing.JLabel manufacturedYearJLabel;
    private javax.swing.JTextField manufacturedYearJTextField;
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
    // End of variables declaration//GEN-END:variables
}
