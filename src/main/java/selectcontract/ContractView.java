/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package selectcontract;

import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Dylan
 */
public class ContractView extends javax.swing.JFrame {

    /**
     * Creates new form ContractView
     */
    public ContractView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jComboOriginCity = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelContractID = new javax.swing.JLabel();
        jLabelOriginCity = new javax.swing.JLabel();
        jLabelDestCity = new javax.swing.JLabel();
        jLabelOrderItem = new javax.swing.JLabel();
        jLabelContractCount = new javax.swing.JLabel();
        jNextButton = new javax.swing.JButton();
        jBidButton = new javax.swing.JButton();
        jPrevButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuEdit = new javax.swing.JMenu();
        jMenuNewContract = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bid on Contracts");
        setMinimumSize(new java.awt.Dimension(750, 600));
        setPreferredSize(new java.awt.Dimension(750, 600));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("City of Origin");

        jComboOriginCity.setBackground(new java.awt.Color(102, 102, 102));
        jComboOriginCity.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboOriginCity.setForeground(new java.awt.Color(255, 255, 255));
        jComboOriginCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(183, 183, 183)
                .addComponent(jComboOriginCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(288, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboOriginCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        jPanel2.setBackground(new java.awt.Color(51, 0, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Contract ID:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Origin:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Destination:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Order:");

        jLabelContractID.setBackground(new java.awt.Color(204, 204, 255));
        jLabelContractID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelContractID.setForeground(new java.awt.Color(255, 255, 255));
        jLabelContractID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelContractID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));
        jLabelContractID.setMaximumSize(new java.awt.Dimension(57, 27));
        jLabelContractID.setMinimumSize(new java.awt.Dimension(57, 27));
        jLabelContractID.setPreferredSize(new java.awt.Dimension(57, 27));

        jLabelOriginCity.setBackground(new java.awt.Color(204, 204, 255));
        jLabelOriginCity.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelOriginCity.setForeground(new java.awt.Color(255, 255, 255));
        jLabelOriginCity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelOriginCity.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));
        jLabelOriginCity.setPreferredSize(new java.awt.Dimension(57, 27));

        jLabelDestCity.setBackground(new java.awt.Color(204, 204, 255));
        jLabelDestCity.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelDestCity.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDestCity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelDestCity.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));
        jLabelDestCity.setPreferredSize(new java.awt.Dimension(57, 27));

        jLabelOrderItem.setBackground(new java.awt.Color(204, 204, 255));
        jLabelOrderItem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelOrderItem.setForeground(new java.awt.Color(255, 255, 255));
        jLabelOrderItem.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelOrderItem.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));
        jLabelOrderItem.setPreferredSize(new java.awt.Dimension(57, 27));

        jLabelContractCount.setBackground(new java.awt.Color(204, 204, 255));
        jLabelContractCount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelContractCount.setForeground(new java.awt.Color(255, 255, 255));
        jLabelContractCount.setPreferredSize(new java.awt.Dimension(57, 27));

        jNextButton.setBackground(new java.awt.Color(51, 51, 51));
        jNextButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jNextButton.setForeground(new java.awt.Color(255, 255, 255));
        jNextButton.setText("Next");
        jNextButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jNextButton.setFocusPainted(false);
        jNextButton.setFocusable(false);

        jBidButton.setBackground(new java.awt.Color(51, 51, 51));
        jBidButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBidButton.setForeground(new java.awt.Color(255, 255, 255));
        jBidButton.setText("Bid");
        jBidButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBidButton.setFocusPainted(false);
        jBidButton.setFocusable(false);

        jPrevButton.setBackground(new java.awt.Color(51, 51, 51));
        jPrevButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPrevButton.setForeground(new java.awt.Color(255, 255, 255));
        jPrevButton.setText("Previous");
        jPrevButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPrevButton.setFocusPainted(false);
        jPrevButton.setFocusable(false);
        jPrevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPrevButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(298, Short.MAX_VALUE)
                        .addComponent(jPrevButton)
                        .addGap(18, 18, 18)
                        .addComponent(jBidButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jNextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelContractCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(130, 130, 130)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelContractID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelOrderItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelDestCity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(171, 171, 171)
                                .addComponent(jLabelOriginCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelContractID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOriginCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelDestCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabelOrderItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNextButton)
                    .addComponent(jBidButton)
                    .addComponent(jPrevButton))
                .addGap(24, 24, 24)
                .addComponent(jLabelContractCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jMenuFile.setText("File");
        jMenuBar1.add(jMenuFile);

        jMenuEdit.setText("Edit");

        jMenuNewContract.setLabel("New Contract");
        jMenuEdit.add(jMenuNewContract);

        jMenuBar1.add(jMenuEdit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPrevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPrevButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPrevButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBidButton;
    private javax.swing.JComboBox<String> jComboOriginCity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelContractCount;
    private javax.swing.JLabel jLabelContractID;
    private javax.swing.JLabel jLabelDestCity;
    private javax.swing.JLabel jLabelOrderItem;
    private javax.swing.JLabel jLabelOriginCity;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuEdit;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenuItem jMenuNewContract;
    private javax.swing.JButton jNextButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jPrevButton;
    // End of variables declaration//GEN-END:variables

    // Manually entered methods go here:
    // Add listeners to buttons
    void addPrevListener(ActionListener listenForPrevButton){
        jPrevButton.addActionListener(listenForPrevButton);
    }
    
    void addNextListener(ActionListener listenForNextButton){
        jNextButton.addActionListener(listenForNextButton);
    }
    
    void addBidListener(ActionListener listenForBidButton){
        jBidButton.addActionListener(listenForBidButton);
    }
    
    void addComboBoxListener(ItemListener listenForComboBox){
        jComboOriginCity.addItemListener(listenForComboBox);
    }
    
    void addNewContractListener(ActionListener listenForNewContract){
        jMenuNewContract.addActionListener(listenForNewContract);
    }
    
    // Display error message
    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }
    
    // Set jLabel contents
    void setContractID(String contractID){
        jLabelContractID.setText(contractID);
    }
    
    void setOriginCity(String originCity){
        jLabelOriginCity.setText(originCity);
    }
    
    void setDestCity(String destCity){
        jLabelDestCity.setText(destCity);
    }
    
    void setOrderItem(String orderItem){
        jLabelOrderItem.setText(orderItem);
    }
    
    void setContractCount(String contractCount){
        jLabelContractCount.setText(contractCount);
    }
    
    //populates combo box with string array
    void setOriginCityList(String [] cityList){
        final DefaultComboBoxModel model = new DefaultComboBoxModel(cityList);
        this.jComboOriginCity.setModel(model);
    }
    
    // Update ContractCount String
    void updateContractViewPanel(int currentContractNum, int contractCount){
        setContractCount((1 + currentContractNum) + " of " + contractCount + " contracts");
        if (currentContractNum == 0 && currentContractNum == contractCount - 1){
            jPrevButton.setEnabled(false);
            jNextButton.setEnabled(false);
        } else if (currentContractNum == contractCount - 1){
            jPrevButton.setEnabled(true);
            jNextButton.setEnabled(false);
        } else if (currentContractNum == 0){
            jPrevButton.setEnabled(false);
            jNextButton.setEnabled(true);
        } else {
            jPrevButton.setEnabled(true);
            jNextButton.setEnabled(true);
        }       
    }
}
