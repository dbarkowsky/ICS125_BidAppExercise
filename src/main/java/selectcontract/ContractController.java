/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package selectcontract;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author Dylan
 */
class ContractController {

    private ContractView theView;
    private ContractModel theModel;
    
    //Constructor: takes the view and model components
    ContractController(ContractView theView, ContractModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
        
        //add all the action listeners
        this.theView.addPrevListener(new PrevButtonListener());
        this.theView.addBidListener(new BidButtonListener());
        this.theView.addNextListener(new NextButtonListener());
        this.theView.addComboBoxListener(new ComboListener());
        this.theView.addNewContractListener(new NewContractListener());
        this.theView.addQuitListener(new QuitListener());
        
        //pass city list to theView
        theView.setOriginCityList(theModel.getOriginCityList());
        
        //populate/refresh window
        setUpDisplay();
    }
    
    //sets all the fields with their proper values after contract changes
    //often used as a "refresh"
    private void setUpDisplay(){
        try {
            if (theModel.foundContracts()){
                Contract c = theModel.getTheContract();
                theView.setContractID(c.getContractID());
                theView.setDestCity(c.getDestCity());
                theView.setOriginCity(c.getOriginCity());
                theView.setOrderItem(c.getOrderItem());
                theView.updateContractViewPanel(theModel.getCurrentContractNum(), theModel.getContractCount());
            } else {
                theView.setContractID("???");
                theView.setDestCity("???");
                theView.setOriginCity("???");
                theView.setOrderItem("???");
            }
            System.out.println("Controller setUpDisplay.");
        } catch (Error ex){
            System.out.println(ex);
            theView.displayErrorMessage("Error: There was a problem setting the contract.\n"
                    + "                 Contract number: " + theModel.getCurrentContractNum());
        }
        
    }
    
    //Inner Classes
    //Action Listener implementations go here
    //When previous button is pressed
    class PrevButtonListener implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            //if first contract, can't go back further
            if(theModel.getCurrentContractNum() == 0){
                return;
            }
            
            try {
                //get previous contract
                theModel.prevContract();
            } catch (Exception ex){
                System.out.println(ex);
                theView.displayErrorMessage("Error: There is a problem setting a previous contract.");
            }
            
            setUpDisplay();
        }
    }
    
    //When next button is pressed
    class NextButtonListener implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            //if last contract, can't go forward further
            if(theModel.getCurrentContractNum() == theModel.getContractCount() - 1){
                return;
            }
            
            try {
                //get next contract
                theModel.nextContract();
            } catch (Exception ex){
                System.out.println(ex);
                theView.displayErrorMessage("Error: There is a problem setting a next contract.");
            }
            
            setUpDisplay();
        }
    }
 
    //When combo box for city names is changed
    class ComboListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e){
            System.out.println(e.getItem().toString());
            //if the state is changed, update list based on returned string
            if (e.getStateChange() == ItemEvent.SELECTED){
                String selectedCity = e.getItem().toString();
                System.out.println(selectedCity);
                theModel.updateContractList(selectedCity);
                setUpDisplay();
            }
        }
    }
    
    //When bid button is pressed
    class BidButtonListener implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            
            try {
                //bid on contract
                ConfirmBid cb = new ConfirmBid(theView, true, theModel.getTheContract());
                //centres dialogue on screen
                cb.setLocationRelativeTo(null);
                cb.setVisible(true);
                //values could be null if they just close the window. Don't write that info to file.
                if(cb.name != null){
                    theModel.writeNewBidJSON(cb.name, cb.contractID, cb.bidAmount, cb.timestamp, cb);
                    theView.displayErrorMessage("Your name as " + cb.name + " with bid amount " + cb.bidAmount + " has been successfully saved.");
                }
            } catch (Exception ex){
                System.out.println(ex);
                theView.displayErrorMessage("Error: Could not bid on this contract.");
            }
            
        }
    }
    
    //When New Contract option is selected
    class NewContractListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            //testing values
            System.out.println(theModel.listContractID.toString());
            NewContract newContractView = new NewContract(theView, true, theModel.listContractID);
            newContractView.setVisible(true);
               
            if(newContractView.passedAllChecks){
                //pass values to theModel for saving
                theModel.writeNewContractXML(newContractView.contractID, newContractView.originCity, newContractView.destCity, newContractView.orderItem, newContractView);

                //model rebuilds XML document
                theModel.xmlContracts = theModel.createXMLFile(theModel.contractsFile);
            }
            
            //model reloads file
            theModel.readContractsFileXML();

            //set origin city list
            theView.setOriginCityList(theModel.getOriginCityList());
            
            //refresh the display
            setUpDisplay();
            
        }
    }
    
    //When quit button is pressed
    class QuitListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }
}
