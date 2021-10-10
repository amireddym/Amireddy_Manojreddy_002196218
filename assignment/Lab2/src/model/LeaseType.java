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
public enum LeaseType {
    
    Passenger,Business;
    
    public static String[] getAllLeaseTypes() {
        
        return Arrays.stream(LeaseType.values()).map(LeaseType::name).toArray(String[]::new);
    }
}
