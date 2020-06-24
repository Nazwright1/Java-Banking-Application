/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankingapplication;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author nazwright
 */
public class MenuButton extends JButton {
    
    public MenuButton (String menuOption) { 
       this.setText(menuOption);
       
       if(menuOption.equals("Account")) { 
           Icon accountIcon = new ImageIcon("accountIcon.jpeg");
           
       }
       
       else if(menuOption.equals("Transactions")) { 
           Icon transIcon = new ImageIcon("pastTransactions.png");
       }
       else { 
           
           Icon exitIcon = new ImageIcon("exitIcon.jpeg");
           
           
       }
       
       
      
    
    }
    
    
}
