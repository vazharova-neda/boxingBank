package boxingBank;

import java.util.ArrayList;

/**
 * Created by nedav on 01/04/2017.
 */
public class Branch {
    private String branchName;
    private ArrayList<Customer>customers;



    public Branch(String branchName) {
        this.branchName = branchName;
        customers = new ArrayList<>();
    }

     boolean addCustomer(String newCustomerName, double initialAmount){
        if (findCustomer(newCustomerName)== null){
            this.customers.add(new Customer(newCustomerName, initialAmount));
            return true;
        }
        return false;
    }

    private Customer findCustomer (String customerName){
        for (int i = 0; i<this.customers.size();i++){
            Customer customer = customers.get(i);
        if (customer.getCustomerName().equals(customerName)) {
            System.out.println("customer already exists");
            return this.customers.get(i);
        }
    } return null;
    }

     String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    boolean addAdditionalTransaction(String customer, double amountToAdd){
            Customer ourCustomer = findCustomer(customer);
            if (ourCustomer!= null){
                ourCustomer.addTransaction(amountToAdd);
                return true;
            }
        return false;
        }

     String listCustomers(){
        for (int i=0; i<customers.size(); i++){
            System.out.println(i + customers.get(i).getCustomerName() + customers.get(i).getTransactions());
        }
        return null;
    }




}
