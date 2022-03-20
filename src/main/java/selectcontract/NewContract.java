/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package selectcontract;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Dylan
 */
public class NewContract extends JDialog {
    
    private static final int NUMBER_OF_CONTRACT_ATTRIBUTES = 4;
    private static final int INDEX_OF_CONTRACT_ID = 0;
    private static final int INDEX_OF_ORIGIN_CITY = 1;
    private static final int INDEX_OF_DEST_CITY = 2;
    private static final int INDEX_OF_ORDER_ID = 3;
    
    //pre-determined list of city choices
    private final String [] cityList = {"Victoria", "Vancouver", "Seattle", "Nanaimo", "Prince George"};
    private String contractFilename;    /**
     * Creates new form NewContract
     */
    public NewContract(ContractView theView, boolean modal, String contractFilename) {
        super(theView, modal);
        System.out.println("Creating new contract window");
        this.contractFilename = contractFilename;
        initComponents();
        setCityLists();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelContractID = new javax.swing.JLabel();
        jLabelOriginCity = new javax.swing.JLabel();
        jLabelDestCity = new javax.swing.JLabel();
        jLabelOrderItem = new javax.swing.JLabel();
        jTextFieldContractID = new javax.swing.JTextField();
        jTextFieldOrderItem = new javax.swing.JTextField();
        jButtonReset = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jComboBoxOriginCity = new javax.swing.JComboBox<>();
        jComboBoxDestCity = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add a New Contract");

        jLabelContractID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelContractID.setText("Contract ID");

        jLabelOriginCity.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelOriginCity.setText("Origin City");

        jLabelDestCity.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelDestCity.setText("Destination City");

        jLabelOrderItem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelOrderItem.setText("Order Item");

        jTextFieldContractID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldContractID.setToolTipText("Required format: #AAA");

        jTextFieldOrderItem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jButtonReset.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jButtonCancel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonSave.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jComboBoxOriginCity.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBoxOriginCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxDestCity.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBoxDestCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(34, 34, 34))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelContractID)
                                    .addGap(69, 69, 69)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelOriginCity)
                                .addGap(75, 75, 75)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelDestCity)
                            .addGap(34, 34, 34)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelOrderItem)
                        .addGap(72, 72, 72)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldOrderItem, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(jComboBoxDestCity, 0, 160, Short.MAX_VALUE)
                    .addComponent(jComboBoxOriginCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldContractID)
                    .addComponent(jButtonSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelContractID)
                    .addComponent(jTextFieldContractID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelOriginCity)
                    .addComponent(jComboBoxOriginCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDestCity)
                    .addComponent(jComboBoxDestCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelOrderItem)
                    .addComponent(jTextFieldOrderItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Reset button; resets all fields
    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        this.jTextFieldContractID.setText("");
        this.jTextFieldOrderItem.setText("");
        setCityLists(); //dirty way to reset list values
    }//GEN-LAST:event_jButtonResetActionPerformed

    //Cancel button; closes window
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        //targets jFrame and closes the window
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    //Save button; checks fields, writes to file, forces theView to update
    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        System.out.println("Attempting save");
        //convert contract ID to uppercase
        jTextFieldContractID.setText(jTextFieldContractID.getText().toUpperCase());
        
        try {
            //Contract ID and Order Item cannot be blank
            if (jTextFieldContractID.getText().equals("") || jTextFieldOrderItem.getText().equals("")){
                throw new Exception("All fields must be populated.");
            }
            //contract ID must be this format: [1-9][A-Z]{3}
            if (!jTextFieldContractID.getText().matches("^[1-9][A-Z]{3}")){
                throw new Exception("Contract ID format must be: [A number 1-9] followed by 3 letters.");
            }
            //origin city and destination city cannot be the same
            if (jComboBoxDestCity.getSelectedItem().toString().equals(jComboBoxOriginCity.getSelectedItem().toString())){
                throw new Exception("Destination and Origin cities must be different.");
            }
            //Order Item must not contain commas or only be numbers
            if (jTextFieldOrderItem.getText().contains(",") || jTextFieldOrderItem.getText().matches("^[0-9]+$")){
                throw new Exception("Order Items cannot be exclusively numbers or contain commas.");
            }
            //Contract ID cannot already exist in file; check theModel.theContractsAll
            //try to read file and get IDs
            ArrayList<String> contractIDs = new ArrayList<String>();
            try {
               
                //wrap filereader in buffered reader
                FileReader fileReader = new FileReader(contractFilename);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;


                //while the next line of the file exists
                while((line = bufferedReader.readLine()) != null){
                    //break it into an array, assign values
                    String [] tokens = line.split(",", NUMBER_OF_CONTRACT_ATTRIBUTES);
                    String contractID = tokens[INDEX_OF_CONTRACT_ID];

                    //add new contract to array list
                    contractIDs.add(contractID);
                }
                fileReader.close();
            } catch (IOException e){
                System.out.println(e.getMessage());
            }
            
            //compare entered ID with existing IDs
            if (contractIDs.contains(jTextFieldContractID.getText())){
                throw new Exception("This ID already exists in the contracts file.");
            }
            
            //all checks passed? append to contracts file
            try {
                //create filewriter; boolean indicates append preference
                System.out.println("Trying to write to file.");
                FileWriter writeContracts = new FileWriter(contractFilename, true);
                writeContracts.write("\n" +
                                     jTextFieldContractID.getText() + "," +
                                     jComboBoxOriginCity.getSelectedItem().toString() + "," +
                                     jComboBoxDestCity.getSelectedItem().toString() + "," +
                                     jTextFieldOrderItem.getText()); 
                writeContracts.close();
                System.out.println("Save successful");

            } catch (IOException e) {
                System.out.println("Writing new contract to file failed.");
                displayErrorMessage("Failed to write contract to file.");
            }
          
            displayErrorMessage("Contract successfully added.");
            
            //close this window
            this.dispose();
        } catch (Exception e){
            displayErrorMessage(e.toString());
            System.out.println(e);
        }
        
    }//GEN-LAST:event_jButtonSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox<String> jComboBoxDestCity;
    private javax.swing.JComboBox<String> jComboBoxOriginCity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelContractID;
    private javax.swing.JLabel jLabelDestCity;
    private javax.swing.JLabel jLabelOrderItem;
    private javax.swing.JLabel jLabelOriginCity;
    private javax.swing.JTextField jTextFieldContractID;
    private javax.swing.JTextField jTextFieldOrderItem;
    // End of variables declaration//GEN-END:variables
    

    // Display error message
    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }
    
    //populates combo box with string array
    private void setCityLists(){
        final DefaultComboBoxModel destModel = new DefaultComboBoxModel(cityList);
        final DefaultComboBoxModel originModel = new DefaultComboBoxModel(cityList);
        this.jComboBoxOriginCity.setModel(originModel);
        this.jComboBoxDestCity.setModel(destModel);
    }

}



