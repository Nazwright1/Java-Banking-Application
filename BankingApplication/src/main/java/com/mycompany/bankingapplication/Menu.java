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
import javax.swing.SwingUtilities;

/**
 *
 * @author nazwright
 */
public class Menu extends JFrame {
    
    ArrayList <Account> accounts; 
DefaultListModel model;
JList newJList; 
Scanner scan;
    
    public Menu() { 
        
        accounts = new ArrayList<>();
        model = new DefaultListModel();
        loadFrame();
        loadAccounts();
        
    }
    public void loadAccounts(){ 
        try{
        scan = new Scanner(new File("bankAccounts.txt"));
        
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
            
            JList accountsList = new JList(model); 
            
            //add the arraylist items to the jlist
            
            add(accountsList);
            
            
            
            
            
        } catch (Exception ex) {
        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        }
    public void loadFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JList Example");       
        this.setSize(200,200);
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
