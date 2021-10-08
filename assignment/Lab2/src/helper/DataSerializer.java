package helper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Car;
import model.City;
import model.Manufacturer;

/**
 *
 * @author manojreddy
 */
public class DataSerializer {
    
    private static List<Car> cars;

    public DataSerializer() {
        this.cars = new ArrayList<>();
    }
    
    public static void main(String[] args){
        
        serializeData();
    }
    
    public static List<Car> serializeData(){
     
        cars = new ArrayList<>();
        
        //Creating objects Distance,Availablility,Manufacturer,Year,Seats,SerialNo,ModelNo,UpdatedDate,City,Maintainance
        
        //BOSTON
        //Honda
        Car bostonHondaOne = new Car(12,true,Manufacturer.Honda,"1995",4,"BsHon19954a", "HONGEN1", new Date(), City.Boston, false);
        Car bostonHondaTwo = new Car(15,false,Manufacturer.Honda,"1997",4,"BsHon19974a", "HONGEN1", new Date(), City.Boston, false);
        Car bostonHondaThree = new Car(15,true,Manufacturer.Honda,"1994",8,"BsHon19948a", "HONGEN2", new Date(), City.Boston, true);

        //Toyota
        Car bostonToyotaOne = new Car(10,true,Manufacturer.Toyota,"1992",6,"BsToy19926a", "TOYGEN1", new Date(), City.Boston, false);
        Car bostonToyotaTwo = new Car(15,true,Manufacturer.Toyota,"1995",4,"BsToy19954a", "TOYGEN2", new Date(), City.Boston, true);

        //Nissan
        Car bostonNissanOne = new Car(11,true,Manufacturer.Nissan,"2001",6,"BsNis20016a", "NISGEN1", new Date(), City.Boston, true);
        Car bostonNissanTwo = new Car(16,true,Manufacturer.Nissan,"2003",4,"BsNis20034a", "NISGEN2", new Date(), City.Boston, true);

        //Jeep
        Car bostonJeepOne = new Car(16,true,Manufacturer.Jeep,"2001",6,"NyJep20016a", "JEPGEN1", new Date(), City.Boston, false);
        Car bostonJeepTwo = new Car(16,false,Manufacturer.Jeep,"2003",2,"NyJep20032a", "JEPGEN2", new Date(), City.Boston, true);
        
        //NEWYORK
        //Honda
        Car newYorkHondaOne = new Car(14,true,Manufacturer.Honda,"1995",4,"NyHon19954a", "HONGEN1", new Date(), City.NewYork, false);
        Car newYorkHondaTwo = new Car(25,false,Manufacturer.Honda,"2020",6,"NyHon20206a", "HONGEN7", new Date(), City.NewYork, false);
        //Toyota
        Car newYorkToyotaOne = new Car(25,true,Manufacturer.Toyota,"2011",6,"NyToy20116a", "TOYGEN7", new Date(), City.NewYork, false);
        Car newYorkToyotaTwo = new Car(25,false,Manufacturer.Toyota,"2011",7,"NyToy20117a", "TOYGEN7", new Date(), City.NewYork, false);
        //Nissan
        Car newYorkNissanOne = new Car(28,true,Manufacturer.Nissan,"2021",6,"NyNis20216a", "NISGEN7", new Date(), City.NewYork, true);
        Car newYorkNissanTwo = new Car(28,false,Manufacturer.Nissan,"2020",7,"NyNis20207a", "NISGEN7", new Date(), City.NewYork, false);        
        //Jeep
        Car newYorkJeepOne = new Car(28,false,Manufacturer.Jeep,"2021",6,"NyJep20216a", "JEPGEN7", new Date(), City.NewYork, true);
        Car newYorkJeepTwo = new Car(28,false,Manufacturer.Jeep,"2020",7,"NyJep20207a", "JEPGEN7", new Date(), City.NewYork, true);        
        
        //FLORIDA
        //Honda
        Car floridaHondaOne = new Car(20,true,Manufacturer.Honda,"2015",7,"FlHon20157a", "HONGEN4", new Date(), City.Florida, true);
        Car floridaHondaTwo = new Car(25,true,Manufacturer.Honda,"2017",9,"FlHon20179a", "HONGEN5", new Date(), City.Florida, true);
        //Toyota
        Car floridaToyotaOne = new Car(15,false,Manufacturer.Toyota,"1996",7,"FlToy19967a", "TOYGEN3", new Date(), City.Florida, false);
        Car floridaToyotaTwo = new Car(20,true,Manufacturer.Toyota,"2005",9,"FlToy20059a", "TOYGEN5", new Date(), City.Florida, false);        
        //Nissan
        Car floridaNissanOne = new Car(16,false,Manufacturer.Nissan,"2015",7,"FlNis20157a", "NISGEN3", new Date(), City.Florida, false);
        Car floridaNissanTwo = new Car(24,true,Manufacturer.Nissan,"2018",9,"FlNis20189a", "NISGEN5", new Date(), City.Florida, false);
        //Jeep
        Car floridaJeepOne = new Car(30,false,Manufacturer.Jeep,"2015",7,"FlJep20157a", "JEPGEN3", new Date(), City.Florida, true);
        Car floridaJeepTwo = new Car(24,true,Manufacturer.Jeep,"2018",9,"FJep20189a", "JEPGEN5", new Date(), City.Florida, false);        
        
        //Adding to the List
        //Boston-Honda
        cars.add(bostonHondaOne);
        cars.add(bostonHondaTwo);
        cars.add(bostonHondaThree);
        
        //Boston-Toyota
        cars.add(bostonToyotaOne);
        cars.add(bostonToyotaTwo);

        //Boston-Nissan
        cars.add(bostonNissanOne);
        cars.add(bostonNissanTwo);

        //Boston-Jeep
        cars.add(bostonJeepOne);
        cars.add(bostonJeepTwo);
        
        //NewYork-Honda
        cars.add(newYorkHondaOne);
        cars.add(newYorkHondaTwo);
        
        //NewYork-Toyota
        cars.add(newYorkToyotaOne);
        cars.add(newYorkToyotaTwo);
        
        //NewYork-Nissan
        cars.add(newYorkNissanOne);
        cars.add(newYorkNissanTwo);
        
        //NewYork-Jeep
        cars.add(newYorkJeepOne);
        cars.add(newYorkJeepTwo);
        
        //Florida-Honda
        cars.add(floridaHondaOne);
        cars.add(floridaHondaTwo);
        
        //Florida-Toyota
        cars.add(floridaToyotaOne);        
        cars.add(floridaToyotaTwo);
        
        //Florida-Nissan
        cars.add(floridaNissanOne);
        cars.add(floridaNissanTwo);
       
        //Florida-Jeep
        cars.add(floridaJeepOne);
        cars.add(floridaJeepTwo);
        
        return cars;
    }
}
