import java.util.ArrayList;
import java.util.*;

import vehicle.Bicyle;
import vehicle.Car;
import vehicle.MotorCycle;
import vehicle.vehicle;

public class Main {
    public static void main(String args[]) {
        System.out.println("Hello World!");
        List<vehicle> Vachilelist=new ArrayList<>();
        Vachilelist.add(new MotorCycle());
        Vachilelist.add(new Car());
        Vachilelist.add(new Bicyle());
        for(vehicle details:Vachilelist){
            System.out.println(details.getNumberofWheels().toString());
        }
    }
}
