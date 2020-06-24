/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankingapplication;

import java.awt.Component;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author nazwright
 */
public final class BottomPane extends JPanel {
    JPanel menuPanel; 
    Icon accountIcon; 
    Icon transIcon; 
    Icon exitIcon; 
    JButton button; 
    
    public BottomPane() { 
        
    }
    public BottomPane(String menuOption) { 
        //set the layout with this class being the container.
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        
        //add buttons to the panel 
        addButtons(menuOption);
        //add the panel to this container panel
         
        
        }
    /**
    *@param menuOption 
    * 
    */
    public void addButtons(String menuOption) { 
        //if the menu option is: 
            switch (menuOption) {
                case "Account" -> { 
                    accountIcon = new ImageIcon("accountIcon.jpeg"); 
                    button = new JButton(menuOption, accountIcon);
                    add(button);
                }
                case "Transactions" -> {
                    transIcon = new ImageIcon("pastTransactions.png"); 
                    button = new JButton(menuOption, transIcon); 
                    add(button);
                }
                //if the string param is equal to "Exit"
                default -> {
                    exitIcon = new ImageIcon("exitIcon.jpeg"); 
                    button = new JButton(menuOption, exitIcon); 
                    add(button);
                }
            
    }
    
       
}
}
    
    

