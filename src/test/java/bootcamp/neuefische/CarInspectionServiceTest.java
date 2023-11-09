package bootcamp.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarInspectionServiceTest {

    @Test
    void checkForTires_whenAIs4_thenReturnTrue(){
        // GIVEN
        int a = 4;
        // WHEN
        boolean actual = checkForTires(a);
        // THEN
        assertTrue(actual);
    }



}