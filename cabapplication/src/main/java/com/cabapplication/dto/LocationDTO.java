/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cabapplication.dto;

/**
 *
 * @author Administrator
 */
public class LocationDTO {
    private int id;
    private char name;
    private int distance;

    public LocationDTO(int id, char name, int distance) {
        this.id=id;
        this.name=name;
        this.distance=distance;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public char getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(char name) {
        this.name = name;
    }

    /**
     * @return the distance
     */
    public int getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(int distance) {
        this.distance = distance;
    }
    
}
