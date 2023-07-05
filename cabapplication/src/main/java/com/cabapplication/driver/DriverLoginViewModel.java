/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cabapplication.driver;

import com.cabapplication.repository.Repository;

/**
 *
 * @author Administrator
 */
class DriverLoginViewModel {
    DriverLoginView driverLoginView;
    
    DriverLoginViewModel(DriverLoginView driverLoginView)
    {
        this.driverLoginView=driverLoginView;
    }

    boolean checkCredentials(int id, String password) {
       return Repository.getInstance().checkDriver(id, password);
    }
    
    
}
