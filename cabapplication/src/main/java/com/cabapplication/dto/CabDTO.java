/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cabapplication.dto;

/**
 *
 * @author Administrator
 */
public class CabDTO {

    /**
     * @return the location
     */
    public char getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(char location) {
        this.location = location;
    }

    /**
     * @return the cabId
     */
    public int getCabId() {
        return cabId;
    }

    /**
     * @param cabId the cabId to set
     */
    public void setCabId(int cabId) {
        this.cabId = cabId;
    }
    private char location;
    private int cabId;

    public CabDTO(char location, int cabId) {
        this.location=location;
        this.cabId=cabId;
    }
}
