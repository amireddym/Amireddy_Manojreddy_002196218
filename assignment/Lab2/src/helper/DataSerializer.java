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
        Car bostonHondaOne = new Car(12,true,Manufacturer.Honda,"1995",4,"Hon19954a", "HONGEN1", new Date(), City.Boston, false);
        Car bostonHondaTwo = new Car(15,false,Manufacturer.Honda,"1997",4,"Hon19974a", "HONGEN1", new Date(), City.Boston, false);
        Car bostonHondaThree = new Car(15,true,Manufacturer.Honda,"1994",8,"Hon19948a", "HONGEN2", new Date(), City.Boston, true);
        Car bostonHondaFour = new Car(20,true,Manufacturer.Honda,"2015",7,"Hon20157a", "HONGEN4", new Date(), City.Boston, true);
        Car bostonHondaFive = new Car(25,true,Manufacturer.Honda,"2017",9,"Hon20179a", "HONGEN5", new Date(), City.Boston, true);
        Car bostonHondaSix = new Car(25,false,Manufacturer.Honda,"2020",6,"Hon20206a", "HONGEN7", new Date(), City.Boston, false);
        //Toyota
        Car bostonToyotaOne = new Car(10,true,Manufacturer.Toyota,"1992",6,"Toy19926a", "TOYGEN1", new Date(), City.Boston, false);
        Car bostonToyotaTwo = new Car(15,true,Manufacturer.Toyota,"1995",4,"Toy19954a", "TOYGEN2", new Date(), City.Boston, true);
        Car bostonToyotaThree = new Car(15,false,Manufacturer.Toyota,"1996",7,"Toy19967a", "TOYGEN3", new Date(), City.Boston, false);
        Car bostonToyotaFour = new Car(20,true,Manufacturer.Toyota,"2005",9,"Toy20059a", "TOYGEN5", new Date(), City.Boston, false);
        Car bostonToyotaFive = new Car(25,true,Manufacturer.Toyota,"2011",6,"Toy20116a", "TOYGEN7", new Date(), City.Boston, false);
        Car bostonToyotaSix = new Car(25,false,Manufacturer.Toyota,"2011",7,"Toy20117a", "TOYGEN7", new Date(), City.Boston, false);        
        //Nissan
        Car bostonNissanOne = new Car(11,true,Manufacturer.Nissan,"2001",6,"Nis20016a", "NISGEN1", new Date(), City.Boston, true);
        Car bostonNissanTwo = new Car(16,true,Manufacturer.Nissan,"2003",4,"Nis20034a", "NISGEN2", new Date(), City.Boston, true);
        Car bostonNissanThree = new Car(16,false,Manufacturer.Nissan,"2015",7,"Nis20157a", "NISGEN3", new Date(), City.Boston, false);
        Car bostonNissanFour = new Car(24,true,Manufacturer.Nissan,"2018",9,"Nis20189a", "NISGEN5", new Date(), City.Boston, false);
        Car bostonNissanFive = new Car(28,true,Manufacturer.Nissan,"2021",6,"Nis20216a", "NISGEN7", new Date(), City.Boston, true);
        Car bostonNissanSix = new Car(28,false,Manufacturer.Nissan,"2020",7,"Nis20207a", "NISGEN7", new Date(), City.Boston, false);
        //Jeep
        Car bostonJeepOne = new Car(16,true,Manufacturer.Jeep,"2001",6,"Jep20016a", "JEPGEN1", new Date(), City.Boston, false);
        Car bostonJeepTwo = new Car(16,false,Manufacturer.Jeep,"2003",2,"Jep20032a", "JEPGEN2", new Date(), City.Boston, true);
        Car bostonJeepThree = new Car(30,false,Manufacturer.Jeep,"2015",7,"Jep20157a", "JEPGEN3", new Date(), City.Boston, true);
        Car bostonJeepFour = new Car(24,true,Manufacturer.Jeep,"2018",9,"Jep20189a", "JEPGEN5", new Date(), City.Boston, false);
        Car bostonJeepFive = new Car(28,false,Manufacturer.Jeep,"2021",6,"Jep20216a", "JEPGEN7", new Date(), City.Boston, true);
        Car bostonJeepSix = new Car(28,false,Manufacturer.Jeep,"2020",7,"Jep20207a", "JEPGEN7", new Date(), City.Boston, true);
        
        //NEWYORK
        //Honda
        
        
        
        
        cars.add(bostonHondaOne);
        cars.add(bostonHondaTwo);
        cars.add(bostonHondaThree);
        cars.add(bostonHondaFour);
        cars.add(bostonHondaFive);
        cars.add(bostonHondaSix);
        
        return cars;
    }
}
