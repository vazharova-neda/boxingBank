package boxingBank;

import java.util.ArrayList;

/**
 * Created by nedav on 01/04/2017.
 */
public class Customer {
    private String customerName;
    private ArrayList<Double>transactions;

    public Customer(String customerName,double initialAmount){
        this.customerName = customerName;
        addTransaction(initialAmount);
        transactions = new ArrayList<Double>();
    }

    String getCustomerName() {
        return customerName;
    }

    public void addTransaction(double transactionAmount){
        transactions.add(transactionAmount);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
