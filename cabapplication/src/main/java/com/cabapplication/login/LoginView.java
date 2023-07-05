/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cabapplication.login;

import com.cabapplication.admin.AdminLoginView;
import com.cabapplication.customer.CustomerLoginView;
import com.cabapplication.driver.DriverLoginView;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class LoginView {
    
    private LoginViewModel loginViewModel;
    
    LoginView()
    {
        loginViewModel=new LoginViewModel(this);
    }
    public static void main(String[] args) {
        LoginView loginView=new LoginView();
        loginView.view();
    }

    private void view() {
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO ZULA");
        System.out.println("1)Driver Login");
        System.out.println("2)Customer Login");
        System.out.println("3)Administrator");
        System.out.println("4)Exit");
        System.out.println("Please choose a service : ");
        switch(sc.nextInt())
        {
            case 1:
                DriverLoginView driverLoginView=new DriverLoginView();
                driverLoginView.driverLoginView();
                break;
            case 2:
                CustomerLoginView customerLoginView=new CustomerLoginView();
                customerLoginView.customerLoginView();  
                break;
            case 3:
                AdminLoginView adminLoginView=new AdminLoginView();
                adminLoginView.adminLoginView();
            case 4:
                System.out.println("Exit...");
                break;
            default:
                System.out.println("Invalid Input...");
 
        }
    }
}
