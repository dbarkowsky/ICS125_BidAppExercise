
package selectcontract;

/**
 *
 * @author Dylan Barkowsky
 */
public class SelectContract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContractView theView = new ContractView();
        ContractModel theModel = new ContractModel("./contracts.xml", "./bids.txt");
        ContractController theController = new ContractController(theView, theModel);
        theView.setVisible(true);
    }
    
}
