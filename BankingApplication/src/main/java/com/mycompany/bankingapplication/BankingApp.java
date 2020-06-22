package com.mycompany.bankingapplication;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nazwright
 */
public class BankingApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      
    }
    
}
//all operations performed in this application will be on a bank account

class BankAccount { 
    
    int balance;
    
    int previousTransaction; 
    
    String customerName; 
    
    String customerId; 
    
    
    void deposit(int amount) { 
        
        if (amount != 0) { 
            balance = amount + balance ; 
        }
    }
    void withdraw (int amount) { 
        if(amount !=0) {
            balance = balance - amount; 
            // negative indicates withdraw 
            previousTransaction = -amount; 
        }
        //we need to get information about the previous transaction
        
       
    }
    void getPreviousTransaction(){ 
        if(previousTransaction > 0) { 
            System.out.println("Deposited: " +previousTransaction); 
        }
        else if(previousTransaction < 0) { 
            System.out.println("Withdrawn: "+ Math.abs(previousTransaction));
        }
        else { 
            System.out.println("No transactions found.");
        }
    }
}
