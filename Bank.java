package boxingBank;

import java.util.ArrayList;

/**
 * Created by nedav on 01/04/2017.
 */
public class Bank {
    private String bankName;
    private ArrayList<Branch> branches;

    public Bank(String bankName){
        this.bankName=bankName;
        this.branches = new ArrayList<Branch>();
    }

     boolean addBranch(String branchName){
            if (findBranch(branchName)== null){
               branches.add(new Branch(branchName));
                return true;
            }
            return false;
        }

    boolean addCustomerToBranch(String branchName, String customerName, double initialAmount){
        Branch branch = findBranch(branchName);
        if (branch != null){
            return branch.addCustomer(customerName, initialAmount);
        }
        return false;
    }

    boolean addCustomerTransaction(String branchName, String customerName, double amountToAdd){
        Branch branch = findBranch(branchName);
        if (branch != null){
            return branch.addAdditionalTransaction(customerName, amountToAdd);
        }
        return false;
    }

    private Branch findBranch(String branchName){
        for (int i=0; i<branches.size(); i++){
            Branch branch = branches.get(i);
            if (branch.getBranchName().equals(branchName)){
                return branch;
            }
        }
        return null;
    }


    public boolean listCustomers(String branchName, boolean showTransactions){
            Branch theBranch = findBranch(branchName);
            if (theBranch != null){
                System.out.println("Customers' details for branch " + branchName);
                ArrayList<Customer> branchCustomers = theBranch.getCustomers();
                for (int i=0; i<branchCustomers.size(); i++){
                    Customer branchCustomer = branchCustomers.get(i);
                    System.out.println("Customers " + branchCustomer.getCustomerName()+ "( " + (i+1) + " )");
                    if (showTransactions){
                        ArrayList<Double>customerTransactions = branchCustomer.getTransactions();
                        System.out.println("Transactions " );
                        for (int j=0; j<customerTransactions.size(); j++){
                            System.out.println("( " + (j+1) + " ) Amount " + customerTransactions.get(j));
                        }
                    }
                }
                return true;
            }
            return false;
        }

    }


