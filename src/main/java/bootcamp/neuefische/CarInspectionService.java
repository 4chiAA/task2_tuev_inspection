package bootcamp.neuefische;

public class CarInspectionService extends Car{

    public static boolean checkForTires(Car car){
        return car.getNumberOfTires() == 4;
    }


    public static boolean hasSeatBelt(Car car) {
        return car.isSeatBelt();
    }

    public static boolean hasAirbag(Car car) {
        return car.isAirbag();
    }

    public static boolean hasThreeOrFiveDoors(Car car) {
        return car.getNumberOfDoors() == 3 || car.getNumberOfDoors() == 5;
    }

    public static boolean checkCar(Car car) {
        return checkForTires(car) && hasSeatBelt(car) &&
                hasAirbag(car) && hasThreeOrFiveDoors(car);
    }
}
