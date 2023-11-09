package bootcamp.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarInspectionServiceTest {

    @Test
    void checkForTires_whenCarHas4Tires_thenReturnTrue(){
        // GIVEN
        Car car = new Car(4, 4, true, true);
        // WHEN
        boolean actual = CarInspectionService.checkForTires(car);
        // THEN
        assertTrue(actual);
    }

    @Test
    void checkForTires_whenCarHas3Tires_thenReturnFalse(){
        // GIVEN
        Car car = new Car(3, 4, true, true);
        // WHEN
        boolean actual = CarInspectionService.checkForTires(car);
        // THEN
        assertFalse(actual);
    }

    @Test
    void hasSeatBelt_whenCarHasASeatBelt_thenReturnTrue(){
        // GIVEN
        Car car = new Car(4, 4, true, true);
        // WHEN
        boolean actual = CarInspectionService.hasSeatBelt(car);
        // THEN
        assertTrue(actual);
    }

    @Test
    void hasSeatBelt_whenCarHasNoSeatBelt_thenReturnFalse(){
        // GIVEN
        Car car = new Car(4, 4, false, true);
        // WHEN
        boolean actual = CarInspectionService.hasSeatBelt(car);
        // THEN
        assertFalse(actual);
    }

    @Test
    void hasSeatBelt_whenCarHasNotASeatBelt_thenReturnFalse(){
        // GIVEN
        Car car = new Car();
        car.setSeatBelt(false);
        // WHEN
        boolean actual = CarInspectionService.hasSeatBelt(car);
        // THEN
        assertFalse(actual);
    }

    @Test
    void hasAirbag_whenCarHasAAirbag_thenReturnTrue(){
        // GIVEN
        Car car = new Car(4, 4, true, true);
        // WHEN
        boolean actual = CarInspectionService.hasAirbag(car);
        // THEN
        assertTrue(actual);
    }

    @Test
    void hasAirbag_whenCarHasNoAirbag_thenReturnFalse(){
        // GIVEN
        Car car = new Car(4, 4, false, false);
        // WHEN
        boolean actual = CarInspectionService.hasAirbag(car);
        // THEN
        assertFalse(actual);
    }

    @Test
    void hasThreeOrFiveDoors_whenCarHas3Doors_thenReturnTrue(){
        // GIVEN
        Car car = new Car(4, 3, true, true);
        // WHEN
        boolean actual = CarInspectionService.hasThreeOrFiveDoors(car);
        // THEN
        assertTrue(actual);
    }

    @Test
    void hasThreeOrFiveDoors_whenCarHas5Doors_thenReturnTrue(){
        // GIVEN
        Car car = new Car(4, 5, true, true);
        // WHEN
        boolean actual = CarInspectionService.hasThreeOrFiveDoors(car);
        // THEN
        assertTrue(actual);
    }

    @Test
    void hasThreeOrFiveDoors_whenCarHas4Doors_thenReturnFalse(){
        // GIVEN
        Car car = new Car(4, 4, false, false);
        // WHEN
        boolean actual = CarInspectionService.hasThreeOrFiveDoors(car);
        // THEN
        assertFalse(actual);
    }

}