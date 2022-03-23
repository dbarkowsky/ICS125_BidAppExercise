/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package selectcontract;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Dylan
 */
class ContractModel {
    private ArrayList<Contract> theContracts;
    protected ArrayList<Contract> theContractsAll;
    private int contractCounter; //for currently displayed contract, not total
    private SortedSet<String> originCityList;
    protected String fileName;
    
    
    private static final int NUMBER_OF_CONTRACT_ATTRIBUTES = 4;
    private static final int INDEX_OF_CONTRACT_ID = 0;
    private static final int INDEX_OF_ORIGIN_CITY = 1;
    private static final int INDEX_OF_DEST_CITY = 2;
    private static final int INDEX_OF_ORDER_ID = 3;
    
    ContractModel(String fileName){
        

        this.fileName = fileName;
        
        readContractsFile();
    }
    
    protected void readContractsFile(){
        //Clear existing ArrayList; used when adding contract and reloading file
        theContracts = new ArrayList<Contract>();
        contractCounter = 0;
        originCityList = new TreeSet<>();
        
        try {
            //wrap filereader in buffered reader
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            
            //while the next line of the file exists
            while((line = bufferedReader.readLine()) != null){
                //break it into an array, assign values
                String [] tokens = line.split(",", NUMBER_OF_CONTRACT_ATTRIBUTES);
                
                String contractID = tokens[INDEX_OF_CONTRACT_ID];
                String originCity = tokens[INDEX_OF_ORIGIN_CITY];
                String destCity = tokens[INDEX_OF_DEST_CITY];
                String orderItem = tokens[INDEX_OF_ORDER_ID];
                
                Contract dataContract = new Contract(contractID, originCity, destCity, orderItem);
                
                //add new contract to array list
                theContracts.add(dataContract);
                //add originCity to originCityList combo box
                originCityList.add(originCity);
            }
            //add "All" to the combo box
            originCityList.add("All");
            //copy theContracts to theContractsAll
            theContractsAll = new ArrayList<>(theContracts);
            //reset the cities dropdown list
            updateContractList("All");
            fileReader.close();
            System.out.println("Model reloaded file.");
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
    
    //returns Contract object
    public Contract getTheContract(){
        return theContracts.get(contractCounter);
    }
    
    public int getContractCount(){
        return theContracts.size();
    }
    
    //returns current position in contract list
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
    
    //returns originCityList as a String array
    //needed for display in combo box
    public String[] getOriginCityList(){
        String[] temp;
        temp = originCityList.toArray(new String[originCityList.size()]);
        return temp;
    }
    
    //accepts city name as string
    //removes all matching cities from theContracts
    public void updateContractList(String city){
        theContracts = new ArrayList<>(theContractsAll);
        if(!city.equals("All")){
            theContracts.removeIf(s -> !s.contains(city));
        }
        contractCounter = 0;
    }
    
    public void writeNewContract(String contractID, String originCity, String destCity, String orderItem){
        //all checks passed? append to contracts file
            try {
                //create filewriter; boolean indicates append preference
                System.out.println("Trying to write to file.");
                FileWriter writeContracts = new FileWriter(this.fileName, true);
                //write data to file
                writeContracts.write("\n" +
                                     contractID + "," +
                                     originCity + "," +
                                     destCity + "," +
                                     orderItem); 
                writeContracts.close();
                System.out.println("Save successful");

            } catch (IOException e) {
                System.out.println("Writing new contract to file failed.");
            }
    }
    
    public void writeNewBid(String name, String contractID, String bidAmount, String timestamp, JDialog jDialog){
        
        String outputString =   name + "," +
                                contractID + "," +
                                bidAmount + "," +
                                timestamp;

        //try to write to file, otherwise print error message
        try {
            //set up file writer
            File contractRecords = new File("./MyContractBids.txt");
            FileWriter filewriter = new FileWriter(contractRecords, true);
            BufferedWriter output = new BufferedWriter(filewriter);

            //write to file
            output.write(outputString);
            output.newLine();
            output.close();
            JOptionPane.showMessageDialog(jDialog, "Your name as " + name + " with bid amount " + bidAmount + " has been successfully saved.");
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
            JOptionPane.showMessageDialog(jDialog, "File could not be created. Check file permissions.");
        }
    }
}
