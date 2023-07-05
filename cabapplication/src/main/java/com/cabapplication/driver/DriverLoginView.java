/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cabapplication.driver;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class DriverLoginView 
{
    DriverLoginViewModel driverLoginViewModel; 
    public DriverLoginView()
    {
        driverLoginViewModel=new  DriverLoginViewModel(this);
    }
    
    public void driverLoginView()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("*** WELCOM FOR LOGIN ***");
        System.out.println("Please, Enter the id : ");
        int id=sc.nextInt();
        System.out.println("Please Enter the password : ");
        String password=sc.next();
        if(this.driverLoginViewModel.checkCredentials(id,password))
            System.out.println("Login Successfull...");
        else
            System.out.println("Invalid Credentials...");
    }
    
    

}
