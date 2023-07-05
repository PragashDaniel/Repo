/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cabapplication.customer;

import com.cabapplication.repository.Repository;

/**
 *
 * @author Administrator
 */
public class CustomerLoginViewModel 
{

    CustomerLoginViewModel(CustomerLoginView aThis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    boolean checkCredentials(int id, String password) {
        return Repository.getInstance().checkCustomer(id, password);
    }
    
}
