package boxingBank;

/**
 * Created by nedav on 01/04/2017.
 */
public class Driver {

    public static void main(String [] args){

        Bank bank1 = new Bank("Halifax");
        bank1.addBranch("Manchester");
        bank1.addCustomerToBranch("Manchester", "Sue", 50.05);
        bank1.addCustomerToBranch("Manchester", "Ned", 100.00);
        bank1.addCustomerToBranch("Manchester", "Alan", 20.00);
        bank1.addBranch("Hull");
        bank1.addCustomerToBranch("Hull", "Paul", 60.00);

        bank1.addCustomerTransaction("Manchester", "Ned", 40.50);
        bank1.addCustomerTransaction("Manchester", "Ned", 150.50);
        bank1.addCustomerTransaction("Manchester", "Alan", 40.44);

        bank1.listCustomers("Manchester", false);


    }
}
