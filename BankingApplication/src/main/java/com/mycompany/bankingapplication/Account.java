/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankingapplication;

import javax.swing.ListModel;

/**
 *
 * @author nazwright
 */
public class Account  {
    //balance for this account 
    private double balance; 
    
    //tyoe of account
    private String accountType; 
    
    //account number 10 digits
    private String accountNumber; 
    
    //last transaction date 
   
    
    //date of last transaction get data from database.
    
    
    //get all these values from the databaase when the account is instantiated.

    /**
     *
     */
    public Account() { 
        this.balance = 35;
        this.accountType= "Checking"; 
        this.accountNumber = "00000001";
                }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return the accountType
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * @param accountType the accountType to set
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    /**
     * @return the accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    @Override
    public String toString() { 
        return getAccountType() + "         " + getAccountNumber() + "\n" + "$ " + getBalance(); 
    }
    
}
