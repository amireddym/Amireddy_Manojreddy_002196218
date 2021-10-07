/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author manojreddy
 */
public enum Manufacturer {
    Toyota,Honda,Nissan,Jeep;
    
    public static List<String> getManufactureList(){
       
        return Stream.of(Manufacturer.values()).map(Manufacturer::name).collect(Collectors.toList());
    }
    
    public static String[] getManufactureArray() {
        
        return Arrays.stream(Manufacturer.values()).map(Manufacturer::name).toArray(String[]::new);
    }
    
}
