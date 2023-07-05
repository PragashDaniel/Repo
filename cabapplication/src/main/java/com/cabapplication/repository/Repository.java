/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cabapplication.repository;

import com.cabapplication.dto.CabDTO;
import com.cabapplication.dto.CustomerDTO;
import com.cabapplication.dto.DriverDTO;
import com.cabapplication.dto.LocationDTO;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Repository 
{
    private static Repository instance;
    ArrayList<CustomerDTO> customers=new ArrayList();
    ArrayList<CabDTO> cab=new ArrayList();
    ArrayList<DriverDTO> driver=new ArrayList();
    ArrayList<LocationDTO> location=new ArrayList();
    
    private Repository()
    {    }
    
    public static Repository getInstance()
    {
        
        if(instance==null)
        {
            instance=new Repository();
            instance.initialize();
        }
        return instance;
    }

    private void initialize() {
        setDrivers();
        setCustomers();
        setCabs();
        setLocation();
    }

    private void setCustomers() {
        customers.add(new CustomerDTO(1,"aaa","111",25));
        customers.add(new CustomerDTO(2,"bbb","222",36));
        customers.add(new CustomerDTO(3,"ccc","333",31));
        customers.add(new CustomerDTO(4,"ddd","444",28));
    }

    private void setDrivers() {
        driver.add(new DriverDTO(1,"WW","55",25));
        driver.add(new DriverDTO(2,"XX","66",36));
        driver.add(new DriverDTO(3,"YY","77",31));
        driver.add(new DriverDTO(4,"ZZ","88",28));
    }

    private void setCabs() {
        cab.add(new CabDTO('D',1));
        cab.add(new CabDTO('G',2));
        cab.add(new CabDTO('H',3));
        cab.add(new CabDTO('A',4));
    }

    private void setLocation() {
        location.add(new LocationDTO(1,'A',0));
        location.add(new LocationDTO(3,'C',4));
        location.add(new LocationDTO(4,'D',7));
        location.add(new LocationDTO(6,'F',9));
        location.add(new LocationDTO(2,'B',15));
        location.add(new LocationDTO(7,'G',18));
        location.add(new LocationDTO(8,'H',20));
        location.add(new LocationDTO(5,'E',23));
    }
    
    public boolean checkDriver(int id,String password)
    {
        for(int i=0;i<driver.size();i++)
            if(id==driver.get(i).getId() && driver.get(i).getPassword().equals(password))
                return true;
        return false;
    }
    
    public boolean checkCustomer(int id,String password)
    {
        for(int i=0;i<customers.size();i++)
            if(id==customers.get(i).getId() && customers.get(i).getPassword().equals(password))
                return true;
        return false;
    }
    
    public boolean checkAdmin(int id,String password)
    {
        return false;
    }
}
