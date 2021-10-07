/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Arrays;

/**
 *
 * @author manojreddy
 */
public enum City {
    
    Boston,NewYork,Florida;
    
    public static String[] getOperatingCitiesArray(){
        
        return Arrays.stream(City.values()).map(City::name).toArray(String[]::new);
    }
}
