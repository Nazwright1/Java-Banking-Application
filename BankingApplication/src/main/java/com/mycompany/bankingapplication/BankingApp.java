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
    /*
    *
    */
    BankAccount(String cName, String cId){ 
        customerName = cName; 
        customerId = cId; 
    }
    
    /*
    *
    */
    void deposit(int amount) { 
        
        if (amount != 0) { 
            balance = amount + balance ; 
        }
    }
    /* 
    *
    */
    void withdraw (int amount) { 
        if(amount !=0) {
            balance = balance - amount; 
            // negative indicates withdraw 
            previousTransaction = -amount; 
        }
        //we need to get information about the previous transaction
        
       
    }
    /*
    *
    */
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
    /*
    * 
    */
   
    void showMenu() { 
        
        //represents the menu option selected by the user.
        char option = '\0';
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome " +customerName); 
        System.out.println("Your ID is " + customerId);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit App");
        
        do { 
        System.out.println("==================================================================");
        System.out.println("Enter An Option");
        System.out.println("==================================================================");
        option = scan.next().charAt(0);
        System.out.println("/n"); 
        
        switch(option)
        { 
            case 'A': 
                System.out.println("========================");
               System.out.println("Balance = " +balance); 
                System.out.println("========================");
                System.out.println("/n");
        
           case 'B': 
                System.out.println("========================");
               System.out.println("Enter the amount you would like to deposit."); 
               int amount = scan.nextInt();
               deposit(amount); 
               System.out.println(amount+ " has been deposited.");
                System.out.println("========================");
                System.out.println("/n");
                
           case 'C': 
                System.out.println("========================");
               System.out.println("Enter the amount you would like to withdraw.");
               amount = scan.nextInt(); 
               withdraw(amount); 
               System.out.println(amount+" has been withdrawn.");
                System.out.println("========================");
                System.out.println("/n");
               
           case 'D': 
                System.out.println("========================");
               getPreviousTransaction();
                System.out.println("========================");
                 System.out.println("/n");
           default:
               System.out.print("Invalid Option! Please enter again");
        
        }
        
        } 
        while(option != 'E'); 
      
        System.out.println("Thank you for using our services.");
        
    
        }
}



