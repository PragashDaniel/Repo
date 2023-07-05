/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cabapplication.customer;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class CustomerLoginView {

    
    Scanner sc=new Scanner(System.in);
    CustomerLoginViewModel customerLoginViewModel;
    public CustomerLoginView()
    {
        customerLoginViewModel=new CustomerLoginViewModel(this); 
    }
    
    public void customerLoginView() {
        System.out.println("*** WELCOM FOR LOGIN ***");
        System.out.println("Please, Enter the id : ");
        int id=sc.nextInt();
        System.out.println("Please Enter the password : ");
        String password=sc.next();
        if(this.customerLoginViewModel.checkCredentials(id,password))
        {
            System.out.println("Login Success...");
            customerHome();
        }else
            System.out.println("Invalid Credentials..");
    }

    private void customerHome() {
        System.out.println("Enter the source : ");
        char source=sc.next().charAt(0);
        System.out.println("Enter the destination : ");
        char destination=sc.next().charAt(0);
        
    }
    
}
