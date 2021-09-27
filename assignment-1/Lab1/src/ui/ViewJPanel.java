/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Image;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import model.Person;

/**
 *
 * @author manojreddy
 */
public class ViewJPanel extends javax.swing.JPanel {

    private Person person;
    
    /**
     * Creates new form ViewJPanel
     */
    public ViewJPanel(Person person) {
        initComponents();
        this.person = person;
        display(person);
    }

    private void display(Person person){
        
        nameTextField.setText(person.getName());
        geographicDataTextField.setText(person.getGeographicData());
        dobTextField.setText(person.getDob()==null?"":new SimpleDateFormat("dd/MM/yyyy").format(person.getDob()));
        telephoneNoTextField.setText(person.getTelephoneNo()==0?"":String.valueOf(person.getTelephoneNo()));
        telephoneNoSecTextField.setText(person.getTelephoneNoSec()==0?"":String.valueOf(person.getTelephoneNoSec()));
        faxNoTextField.setText(person.getFaxNo()==0?"":String.valueOf(person.getFaxNo()));
        emailTextField.setText(person.getEmailId());
        emailTextSecField.setText(person.getEmailIdSec());
        ipAddressTextField.setText(person.getIpAddress());
        medicalRecordTextField.setText(person.getMedicalRecordNo()==0?"":String.valueOf(person.getMedicalRecordNo()));
        healthPlanTextField.setText(person.getHealthPlanBenficiaryNo()==0?"":String.valueOf(person.getHealthPlanBenficiaryNo()));
        ssnTextField.setText(person.getSsn());
        bankAccountNoTextField.setText(person.getBankAccountNo()==0?"":String.valueOf(person.getBankAccountNo()));
        bankAccountNoSecTextField.setText(person.getBankAccountNoSec()==0?"":String.valueOf(person.getBankAccountNoSec()));
        vehicleIdentityTextField.setText(person.getVehicleIdentifier());
        deviceIdentityTextField.setText(person.getDeviceIdentifier());
        linkedInTextField.setText(person.getLinkedIn());
        licenseNoTextField.setText(person.getLicenseNo());
        uniqueIdentityTextField.setText(person.getUniqueNo());
        biometricsTextField.setText(person.getBiometric());
        
        setPhoto();
        
    }
    
    private void setPhoto(){
        
        ImageIcon photo = new ImageIcon(person.getBiometric());
        photoLabel.setSize(134, 119);
        System.out.println(photoLabel.getHeight());
        Image photoResized = photo.getImage().getScaledInstance(photoLabel.getWidth(), photoLabel.getHeight(),4);
        photoLabel.setIcon(new ImageIcon(photoResized));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dobTextField = new javax.swing.JTextField();
        telephoneNoTextField = new javax.swing.JTextField();
        faxNoTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        ssnTextField = new javax.swing.JTextField();
        medicalRecordTextField = new javax.swing.JTextField();
        healthPlanTextField = new javax.swing.JTextField();
        bankAccountNoTextField = new javax.swing.JTextField();
        licenseNoTextField = new javax.swing.JTextField();
        vehicleIdentityTextField = new javax.swing.JTextField();
        medicalRecordJLabel = new javax.swing.JLabel();
        deviceIdentityTextField = new javax.swing.JTextField();
        healthPlanJLabel = new javax.swing.JLabel();
        linkedInTextField = new javax.swing.JTextField();
        bankAccountNoJLabel = new javax.swing.JLabel();
        ipAddressTextField = new javax.swing.JTextField();
        licenseNoJLabel = new javax.swing.JLabel();
        uniqueIdentityTextField = new javax.swing.JTextField();
        vehicleIdentityJLabel = new javax.swing.JLabel();
        biometricsTextField = new javax.swing.JTextField();
        deviceIdentityJLabel = new javax.swing.JLabel();
        linkedInJLabel = new javax.swing.JLabel();
        photoLabel = new javax.swing.JLabel();
        ipAddressJLabel = new javax.swing.JLabel();
        uniqueIdentityJLabel = new javax.swing.JLabel();
        biometricsJLabel1 = new javax.swing.JLabel();
        createJLabel = new javax.swing.JLabel();
        nameJLabel = new javax.swing.JLabel();
        geographicDataJLabel = new javax.swing.JLabel();
        dobJLabel = new javax.swing.JLabel();
        telephoneNoJLabel = new javax.swing.JLabel();
        faxNoJLabel = new javax.swing.JLabel();
        emailAddressJLabel = new javax.swing.JLabel();
        ssnJLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        geographicDataTextField = new javax.swing.JTextField();
        telephoneNoSecJLabel = new javax.swing.JLabel();
        telephoneNoSecTextField = new javax.swing.JTextField();
        emailAddressSecJLabel = new javax.swing.JLabel();
        emailTextSecField = new javax.swing.JTextField();
        bankAccountNoSecJLabel = new javax.swing.JLabel();
        bankAccountNoSecTextField = new javax.swing.JTextField();

        ssnTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssnTextFieldActionPerformed(evt);
            }
        });

        medicalRecordJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        medicalRecordJLabel.setText("Medical Record No :");

        healthPlanJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        healthPlanJLabel.setText("Health Plan No :");

        bankAccountNoJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bankAccountNoJLabel.setText("Bank Account(Pri) :");

        licenseNoJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        licenseNoJLabel.setText("License No :");

        vehicleIdentityJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        vehicleIdentityJLabel.setText("Vehicle Identity :");

        deviceIdentityJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        deviceIdentityJLabel.setText("Device Identity :");

        linkedInJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        linkedInJLabel.setText("LinkedIn :");

        ipAddressJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ipAddressJLabel.setText("Ip Address :");

        uniqueIdentityJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        uniqueIdentityJLabel.setText("Unique Identity :");

        biometricsJLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        biometricsJLabel1.setText("BioMetrics :");

        createJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        createJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createJLabel.setText("View Person");

        nameJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nameJLabel.setText("Name :");

        geographicDataJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        geographicDataJLabel.setText("Geographic Data :");

        dobJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dobJLabel.setText("Date of Birth :");

        telephoneNoJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        telephoneNoJLabel.setText("Telephone No(Pri):");

        faxNoJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        faxNoJLabel.setText("FAX No  :");

        emailAddressJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        emailAddressJLabel.setText("Email Address(Pri) :");

        ssnJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ssnJLabel.setText("SSN :");

        telephoneNoSecJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        telephoneNoSecJLabel.setText("Telephone No(Sec):");

        emailAddressSecJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        emailAddressSecJLabel.setText("Email Address(Sec) :");

        bankAccountNoSecJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bankAccountNoSecJLabel.setText("Bank Account(Sec) :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(geographicDataJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nameJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dobJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(telephoneNoJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(emailAddressJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ssnJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(medicalRecordJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(telephoneNoSecJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(emailAddressSecJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(healthPlanJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(photoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(geographicDataTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dobTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ssnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(medicalRecordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(telephoneNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telephoneNoSecTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTextSecField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(healthPlanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bankAccountNoJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(licenseNoJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vehicleIdentityJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deviceIdentityJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(linkedInJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ipAddressJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(uniqueIdentityJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(biometricsJLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(faxNoJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bankAccountNoSecJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(faxNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bankAccountNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(licenseNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vehicleIdentityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deviceIdentityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(linkedInTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ipAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uniqueIdentityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(biometricsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bankAccountNoSecTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(createJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(photoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(geographicDataJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(geographicDataTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bankAccountNoSecJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dobJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dobTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telephoneNoJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telephoneNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(telephoneNoSecJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailAddressJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(emailAddressSecJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(medicalRecordJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(medicalRecordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(licenseNoJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(faxNoJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(healthPlanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(healthPlanJLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bankAccountNoJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bankAccountNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(bankAccountNoSecTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vehicleIdentityJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vehicleIdentityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deviceIdentityJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deviceIdentityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(linkedInJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(linkedInTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telephoneNoSecTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ipAddressJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ipAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uniqueIdentityJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uniqueIdentityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTextSecField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(licenseNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(faxNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ssnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(biometricsJLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ssnJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(biometricsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ssnTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssnTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ssnTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bankAccountNoJLabel;
    private javax.swing.JLabel bankAccountNoSecJLabel;
    private javax.swing.JTextField bankAccountNoSecTextField;
    private javax.swing.JTextField bankAccountNoTextField;
    private javax.swing.JLabel biometricsJLabel1;
    private javax.swing.JTextField biometricsTextField;
    private javax.swing.JLabel createJLabel;
    private javax.swing.JLabel deviceIdentityJLabel;
    private javax.swing.JTextField deviceIdentityTextField;
    private javax.swing.JLabel dobJLabel;
    private javax.swing.JTextField dobTextField;
    private javax.swing.JLabel emailAddressJLabel;
    private javax.swing.JLabel emailAddressSecJLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField emailTextSecField;
    private javax.swing.JLabel faxNoJLabel;
    private javax.swing.JTextField faxNoTextField;
    private javax.swing.JLabel geographicDataJLabel;
    private javax.swing.JTextField geographicDataTextField;
    private javax.swing.JLabel healthPlanJLabel;
    private javax.swing.JTextField healthPlanTextField;
    private javax.swing.JLabel ipAddressJLabel;
    private javax.swing.JTextField ipAddressTextField;
    private javax.swing.JLabel licenseNoJLabel;
    private javax.swing.JTextField licenseNoTextField;
    private javax.swing.JLabel linkedInJLabel;
    private javax.swing.JTextField linkedInTextField;
    private javax.swing.JLabel medicalRecordJLabel;
    private javax.swing.JTextField medicalRecordTextField;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JLabel ssnJLabel;
    private javax.swing.JTextField ssnTextField;
    private javax.swing.JLabel telephoneNoJLabel;
    private javax.swing.JLabel telephoneNoSecJLabel;
    private javax.swing.JTextField telephoneNoSecTextField;
    private javax.swing.JTextField telephoneNoTextField;
    private javax.swing.JLabel uniqueIdentityJLabel;
    private javax.swing.JTextField uniqueIdentityTextField;
    private javax.swing.JLabel vehicleIdentityJLabel;
    private javax.swing.JTextField vehicleIdentityTextField;
    // End of variables declaration//GEN-END:variables
}
