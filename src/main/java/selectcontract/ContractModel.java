/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package selectcontract;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Dylan
 */
class ContractModel {
    private ArrayList<Contract> theContracts;
    private ArrayList<Contract> theContractsAll;
    private int contractCounter; //for currently displayed contract, not total
    private SortedSet<String> originCityList;
    protected String fileName;
    
    
    private static final int NUMBER_OF_CONTRACT_ATTRIBUTES = 4;
    private static final int INDEX_OF_CONTRACT_ID = 0;
    private static final int INDEX_OF_ORIGIN_CITY = 1;
    private static final int INDEX_OF_DEST_CITY = 2;
    private static final int INDEX_OF_ORDER_ID = 3;
    
    ContractModel(String fileName){
        theContracts = new ArrayList<Contract>();
        contractCounter = 0;
        originCityList = new TreeSet<>();
        this.fileName = fileName;
        
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
}
