/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author manojreddy
 */
public class CarsInformation {
    
    private List<Car> cars ;
    
    private Date lastUpdatedOn;

    public CarsInformation() {
        this.cars = new ArrayList<>();
    }

    public CarsInformation(List<Car> cars) {
        this.cars = cars;
        this.lastUpdatedOn = new Date();
    }
    
    public CarsInformation(List<Car> cars, Date lastUpdatedOn) {
        this.cars = cars;
        this.lastUpdatedOn = lastUpdatedOn;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
        this.lastUpdatedOn = new Date();
    }

    public Date getLastUpdatedOn() {
        return lastUpdatedOn;
    }

    public void setLastUpdatedOn(Date lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    } 
    
    public void add(Car car){
        this.cars.add(car);
        this.lastUpdatedOn = new Date();
    }
    
    public void remove(Car car){
        this.cars.remove(car);
        this.lastUpdatedOn = new Date();
    }
    
}
