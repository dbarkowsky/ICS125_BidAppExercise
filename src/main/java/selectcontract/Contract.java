/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package selectcontract;

/**
 *
 * @author Dylan
 */
public class Contract {
    private String contractID;
    private String originCity;
    private String destCity;
    private String orderItem;
    
    Contract(String id, String origin, String destination, String item){
        this.contractID = id;
        this.destCity = destination;
        this.originCity = origin;
        this.orderItem = item;
    }
    
    String getContractID(){
        return contractID;
    }
    
    String getOriginCity(){
        return originCity;
    }
    
    String getDestCity(){
        return destCity;
    }
    
    String getOrderItem(){
        return orderItem;
    }
}
