package bootcamp.neuefische;

public class CarInspectionService extends Car{

    public static boolean checkForTires(Car car){
        return car.getNumberOfTires() == 4;
    }


    public static boolean hasSeatBelt(Car car) {
        return car.isSeatBelt();
    }
}
