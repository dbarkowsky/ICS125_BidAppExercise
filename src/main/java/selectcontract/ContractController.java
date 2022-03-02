/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package selectcontract;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Dylan
 */
class ContractController {

    private ContractView theView;
    private ContractModel theModel;
    
    ContractController(ContractView theView, ContractModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
        
        this.theView.addPrevListener(new PrevButtonListener());
        this.theView.addBidListener(new BidButtonListener());
        this.theView.addNextListener(new NextButtonListener());
        
        setUpDisplay();
    }
    
    private void setUpDisplay(){
        try {
            theView.setContractID("???");
            theView.setDestCity("???");
            theView.setOriginCity("???");
            theView.setOrderItem("???");
        } catch (Error ex){
            System.out.println(ex);
            theView.displayErrorMessage("Error: There was a problem setting the contract.\n");
        }
    }
    
    //Inner Classes
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
    
    class NextButtonListener implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            //if last contract, can't go forward further
            if(theModel.getCurrentContractNum() == 0){
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
    
    class BidButtonListener implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            
            try {
                //bid on contract
                //FIX ME
            } catch (Exception ex){
                System.out.println(ex);
                theView.displayErrorMessage("Error: Could not bid on this contract.");
            }
            
            setUpDisplay();
        }
    }
}
