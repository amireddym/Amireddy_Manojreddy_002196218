package model;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 *
 * @author manojreddy
 */
public class Car implements Serializable,Comparable<Car>{
    
    private UUID uuid;
    private double distanceFromUser;
    private boolean availability;
    private Manufacturer manufacturer;
    private String manufacturedYear;
    private int seatCapacity;
    private String serialNumber;
    private String modelNumber;
    private Date createdDate;
    private Date lastUpdated;
    private City operatingCity;
    private boolean maintainanceCertificateExpired;

    public Car(double distanceFromUser, boolean availability, Manufacturer manufacturer, String manufacturedYear, int seatCapacity, String serialNumber, String modelNumber, Date lastUpdated, City operatingCity, boolean maintainanceCertificateExpired) {
        
        this.uuid = UUID.randomUUID();
        this.distanceFromUser = distanceFromUser;
        this.availability = availability;
        this.manufacturer = manufacturer;
        this.manufacturedYear = manufacturedYear;
        this.seatCapacity = seatCapacity;
        this.serialNumber = serialNumber;
        this.modelNumber = modelNumber;
        this.createdDate = new Date();
        this.lastUpdated = lastUpdated;
        this.operatingCity = operatingCity;
        this.maintainanceCertificateExpired = maintainanceCertificateExpired;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public double getDistanceFromUser() {
        return distanceFromUser;
    }

    public void setDistanceFromUser(double distanceFromUser) {
        this.distanceFromUser = distanceFromUser;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturedYear() {
        return manufacturedYear;
    }

    public void setManufacturedYear(String manufacturedYear) {
        this.manufacturedYear = manufacturedYear;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public City getOperatingCity() {
        return operatingCity;
    }

    public void setOperatingCity(City operatingCity) {
        this.operatingCity = operatingCity;
    }

    public boolean isMaintainanceCertificateExpired() {
        return maintainanceCertificateExpired;
    }

    public void setMaintainanceCertificateExpired(boolean maintainanceCertificateExpired) {
        this.maintainanceCertificateExpired = maintainanceCertificateExpired;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return String.valueOf(distanceFromUser);
    }

    @Override
    public boolean equals(Object obj) {
        
        if(obj==null){
            return false;
        }
        Car car  = (Car) obj;
        if(this.uuid.equals(car.getUuid()) && this.availability==car.isAvailability() && 
                this.maintainanceCertificateExpired==car.isMaintainanceCertificateExpired()
                && this.distanceFromUser == car.getDistanceFromUser() && this.serialNumber.contentEquals(car.getSerialNumber())
                && this.modelNumber.contentEquals(car.getModelNumber()) && this.manufacturedYear.contentEquals(car.getManufacturedYear()) 
                && this.manufacturer.name().contentEquals(car.getManufacturer().name()) 
                && this.operatingCity.name().contentEquals(car.getOperatingCity().name()) ){
            return true;
        }
        return false;
    }
    
    public boolean objectEqualityCheck(double distanceFromUser, boolean availability, Manufacturer manufacturer, String manufacturedYear, int seatCapacity, String serialNumber, 
            String modelNumber, City operatingCity, boolean maintainanceCertificateExpired){
        
        if(this.availability==availability && this.seatCapacity == seatCapacity && 
                this.maintainanceCertificateExpired==maintainanceCertificateExpired
                && this.distanceFromUser == distanceFromUser && this.serialNumber.contentEquals(serialNumber)
                && this.modelNumber.contentEquals(modelNumber) && this.manufacturedYear.contentEquals(manufacturedYear) 
                && this.manufacturer.name().contentEquals(manufacturer.name()) 
                && this.operatingCity.name().contentEquals(operatingCity.name()) ){
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Car o) {
        
        return Double.compare(getDistanceFromUser(), o.getDistanceFromUser());
    }
    
}
