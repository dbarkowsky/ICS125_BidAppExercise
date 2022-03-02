/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package selectcontract;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Dylan
 */
class ContractModel {
    private ArrayList<Contract> theContracts;
    private int contractCounter; //for currently displayed contract, not total
    
    ContractModel(String fileName){
        theContracts = new ArrayList<Contract>();
        contractCounter = 0;
        
        try {
            //wrap filereader in buffered reader
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            
            //while the next line of the file exists
            while((line = bufferedReader.readLine()) != null){
                //break it into an array, assign values
                String [] tokens = line.split(",", 4);
                
                String contractID = tokens[0];
                String originCity = tokens[1];
                String destCity = tokens[2];
                String orderItem = tokens[3];
                
                Contract dataContract = new Contract(contractID, originCity, destCity, orderItem);
                
                //add new contract to array list
                theContracts.add(dataContract);
            }
            
            fileReader.close();
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    boolean foundContracts(){
        if (theContracts.size() > 0)
            return true;
        else
            return false;
    }
    
    public Contract getTheContract(){
        return theContracts.get(contractCounter);
    }
    
    public int getContractCount(){
        return theContracts.size();
    }
    
    public int getCurrentContractNum(){
        return contractCounter;
    }
    
    public void nextContract(){
        if (contractCounter < theContracts.size())
            contractCounter++;
    }
    
    public void prevContract(){
        if (contractCounter > 0)
            contractCounter--;
    }
}
