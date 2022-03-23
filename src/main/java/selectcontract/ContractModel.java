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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
//XML imports
import org.w3c.dom.*;
import javax.xml.parsers.*;
import org.xml.sax.SAXException;
//JSON imports
//import org.json.simple.*;

/**
 *
 * @author Dylan
 */
class ContractModel {
    private ArrayList<Contract> theContracts;
    protected ArrayList<Contract> theContractsAll;
    private int contractCounter; //for currently displayed contract, not total
    private SortedSet<String> originCityList;
    protected String contractsFile;
    protected String bidsFile;
    
    
    private static final int NUMBER_OF_CONTRACT_ATTRIBUTES = 4;
    private static final int INDEX_OF_CONTRACT_ID = 0;
    private static final int INDEX_OF_ORIGIN_CITY = 1;
    private static final int INDEX_OF_DEST_CITY = 2;
    private static final int INDEX_OF_ORDER_ID = 3;
    
    ContractModel(String contractsFile, String bidsFile){
        

        this.contractsFile = contractsFile;
        this.bidsFile = bidsFile;
        
        readContractsFileXML();
    }
    
    protected void readContractsFile(){
        //Clear existing ArrayList; used when adding contract and reloading file
        theContracts = new ArrayList<Contract>();
        contractCounter = 0;
        originCityList = new TreeSet<>();
        
        try {
            //wrap filereader in buffered reader
            FileReader fileReader = new FileReader(contractsFile);
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
    
    protected void readContractsFileXML(){
        //Clear existing ArrayList; used when adding contract and reloading file
        theContracts = new ArrayList<Contract>();
        contractCounter = 0;
        originCityList = new TreeSet<>();
             
        try {
            //create filewriter; boolean indicates append preference
            System.out.println("Trying to write to XML file.");
            File fileToWrite = new File(this.contractsFile);
            
            //Create objects for XML building
            DocumentBuilderFactory xmlFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder xmlBuilder = xmlFactory.newDocumentBuilder();
            Document xmlFile = xmlBuilder.parse(fileToWrite);
            xmlFile.getDocumentElement().normalize();
            
            //Create list of xml nodes
            NodeList nodes = xmlFile.getElementsByTagName("contract");
            
            for (int i = 0; i < nodes.getLength(); i++){
                Node newNode = nodes.item(i);
                System.out.println("Current element: " + newNode.getNodeName());
                
                if (newNode.getNodeType() == Node.ELEMENT_NODE){
                    Element eElement = (Element) newNode;
                    
                    String contractID = eElement.getElementsByTagName("contractID").item(0).getTextContent();
                    String originCity = eElement.getElementsByTagName("originCity").item(0).getTextContent();
                    String destCity = eElement.getElementsByTagName("destCity").item(0).getTextContent();
                    String orderItem = eElement.getElementsByTagName("orderItem").item(0).getTextContent();
                
                    Contract dataContract = new Contract(contractID, originCity, destCity, orderItem);

                    //add new contract to array list
                    theContracts.add(dataContract);
                    //add originCity to originCityList combo box
                    originCityList.add(originCity);
                    
                    
                    System.out.println("Currently reading: " + contractID + "," + 
                                                               originCity + "," +
                                                               destCity + "," +
                                                               orderItem);
                }
            } 
            
            //add "All" to the combo box
            originCityList.add("All");
            //copy theContracts to theContractsAll
            theContractsAll = new ArrayList<>(theContracts);
            //reset the cities dropdown list
            updateContractList("All");
            
        } catch (IOException e) {
            
        } catch (SAXException ex) {
            Logger.getLogger(ContractModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(ContractModel.class.getName()).log(Level.SEVERE, null, ex);
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
    
    public void writeNewContract(String contractID, String originCity, String destCity, String orderItem, JDialog jDialog){

        try {
            //create filewriter; boolean indicates append preference
            System.out.println("Trying to write to file.");
            FileWriter writeContracts = new FileWriter(this.contractsFile, true);
            //write data to file
            writeContracts.write("\n" +
                                 contractID + "," +
                                 originCity + "," +
                                 destCity + "," +
                                 orderItem); 
            writeContracts.close();
            System.out.println("Save successful");
            JOptionPane.showMessageDialog(jDialog, "File saved successfully.");
        } catch (IOException e) {
            System.out.println("Writing new contract to file failed.");
            JOptionPane.showMessageDialog(jDialog, "File could not be written to. Check file permissions.");
        }
    }
    
    public void writeNewContractXML(String contractID, String originCity, String destCity, String orderItem, JDialog jDialog){

        //create filewriter; boolean indicates append preference
        System.out.println("Trying to write to XML file.");
        File fileToWrite = new File(this.contractsFile);
        System.out.println("Save successful");
        JOptionPane.showMessageDialog(jDialog, "File saved successfully.");
    }
    
    public void writeNewBid(String name, String contractID, String bidAmount, String timestamp, JDialog jDialog){
        
        String outputString =   name + "," +
                                contractID + "," +
                                bidAmount + "," +
                                timestamp;

        //try to write to file, otherwise print error message
        try {
            //set up file writer
            File contractRecords = new File(this.bidsFile);
            FileWriter filewriter = new FileWriter(contractRecords, true);
            BufferedWriter output = new BufferedWriter(filewriter);

            //write to file
            output.write(outputString);
            output.newLine();
            output.close();
            JOptionPane.showMessageDialog(jDialog, "Your name as " + name + " with bid amount " + bidAmount + " has been successfully saved.");
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
            JOptionPane.showMessageDialog(jDialog, "File could not be written to. Check file permissions.");
        }
    }
}
