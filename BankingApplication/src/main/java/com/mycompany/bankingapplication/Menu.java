/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankingapplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;

/**
 *
 * @author nazwright
 */
public final class Menu extends JFrame {
    
    ArrayList <Account> accounts;
    BankUser user; 
DefaultListModel model;
JList accountsList; 
 Scanner scan;
//outtermost container for content 
JPanel container; 
 //the container which will hold the accounts
JPanel accountsPanel; 
 //the container which will hold 
 
 //the container which will hold the bottom panel of buttons.
 BottomPane bottomPanel; 
    public Menu()  { 
        try {
            //create a container
            scan = new Scanner(new File("bankAccounts.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        container = new JPanel();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        
        //accounts for this user
        accounts = new ArrayList<>();
        model = new DefaultListModel();
        
        //we load the accounts 
        loadAccounts(scan);
        //we can use getUser if we do this after we load the accounts.
       
           user = new BankUser();
        //edit the list 
        editList(); 
         //add Jlist to account panel 
        accountsPanel = new JPanel();
        accountsPanel.add(accountsList);
        
        //add the bottom panel
        bottomPanel = new BottomPane(); 
        
        add(accountsPanel);
        add(bottomPanel);
        //add buttons to the bottom panel
        
        //size the panels and add them to the frame 
        
        
        
    }
    public void editList(){ 
        //change the selection mode of the list to single selection 
             accountsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
             
             //set the dimensions of each cell in the JList
             accountsList.setFixedCellHeight(75);
             accountsList.setFixedCellWidth(75);
    }
    
    public void loadAccounts(Scanner scan){ 
        
        
        //skip the lines already read in for the user.
        //try to make scanner global for all classes starting with the login page to remove this loop.
        for(int i = 0; i < 5; i++) { 
            scan.nextLine();
        }
        
        int occurance = Integer.parseInt(scan.nextLine());
        while(scan.hasNext()){
            for(int i = 0; i < occurance; i++) {
                Account account = new Account();
                account.loadAccounts(scan);
              
                accounts.add(account);
            }
            
        }
            //add the elements to a list model 
            for(int j = 0; j < accounts.size(); j++) { 
                model.addElement(accounts.get(j).toString());
            }
            
            
            //add model to JList
             accountsList = new JList(model); 
            
            
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
            
            
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
