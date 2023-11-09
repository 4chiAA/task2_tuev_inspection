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



}