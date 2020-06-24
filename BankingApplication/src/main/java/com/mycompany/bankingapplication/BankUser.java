/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankingapplication;

/**
 *
 * @author nazwright
 */
  public class BankUser {
    
    private String customerFirst; 
    private String customerLast; 
    private String customerId; 
    
    public BankUser() { 
        customerFirst="";
        customerLast="";
        customerId="";
    }
    
    public BankUser(String first, String last, String custId) {
        customerFirst = first; 
        customerLast = last; 
        customerId = custId; 
    }

    /**
     * @return the customerFirst
     */
    public String getCustomerFirst() {
        return customerFirst;
    }

    /**
     * @param customerFirst the customerFirst to set
     */
    public void setCustomerFirst(String customerFirst) {
        this.customerFirst = customerFirst;
    }

    /**
     * @return the customerLast
     */
    public String getCustomerLast() {
        return customerLast;
    }

    /**
     * @param customerLast the customerLast to set
     */
    public void setCustomerLast(String customerLast) {
        this.customerLast = customerLast;
    }

    /**
     * @return the customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    
}
