/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankingapplication;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;

/**
 *
 * @author nazwright
 */
public final class Menu extends JFrame {
    
    ArrayList <Account> accounts; 
DefaultListModel model;
JList accountsList; 
Scanner scan;
    
    public Menu() { 
        
        accounts = new ArrayList<>();
        model = new DefaultListModel();
        
        loadAccounts();
        
    }
    public void loadAccounts(){ 
        try{
        scan = new Scanner(new File("bankAccounts.txt"));
        BankUser thisUser = new BankUser(); 
        thisUser.setCustomerFirst(scan.nextLine());
        thisUser.setCustomerLast(scan.nextLine());
        thisUser.setCustomerId(scan.nextLine());
        
        int occurance = Integer.parseInt(scan.nextLine());
        while(scan.hasNext()){
            for(int i = 0; i < occurance; i++) {
                Account account = new Account();
                account.setAccountType(scan.nextLine());
                account.setAccountNumber(scan.nextLine());
                account.setBalance(Double.parseDouble(scan.nextLine()));
              
                accounts.add(account);
            }
            
        }
            //add the elements to a list model 
            for(int j = 0; j < accounts.size(); j++) { 
                model.addElement(accounts.get(j).toString());
            }
            //create and instantiate a list cell renderer
            
            //add model to JList
             accountsList = new JList(model); 
            
             //change the selection mode of the list to single selection 
             accountsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
             
             //set the dimensions of each cell in the JList
             accountsList.setFixedCellHeight(75);
             accountsList.setFixedCellWidth(75);
            
            
            
            //add Jlist to JFrame
            add(accountsList);
            
            
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Welcome, " + thisUser.getCustomerFirst() + " " + thisUser.getCustomerLast() + "------------------- " + thisUser.getCustomerId()  );       
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
            
            
        } catch (Exception ex) {
        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        }
    
        
    
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable()  {
            

            @Override
            public void run() {
                new Menu();  //To change body of generated methods, choose Tools | Templates.
            }
            
        });
    }
}
