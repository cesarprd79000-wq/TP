package TP2.Test;

import TP_Garage.Garage;
import TP_Garage.ImmatriculationInvalideException;
import TP_Garage.Voiture;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class VoitureTest2 {
    @Test
    void TestImmatriculationValide(){
        assertDoesNotThrow(()->{
            Voiture voiture = new Voiture("AA-141-AA", "MErco", 5);
            assertEquals("AA-141-AA", voiture);
                }
                );
    }

    @Test
    void TestImmatriculationNonValide(){
        assertThrows(ImmatriculationInvalideException.class,()-> {
            new Voiture("AA-123-AA","Merco",4);
        } );
    }

    @Test
    void TestCalculerAgeEnAnnee() throws ImmatriculationInvalideException{
        LocalDate DateDeCirculation = LocalDate.now().minusYears(5);
        Voiture voiture =new Voiture("AA-123-AA","Merco",4);
        double age = Garage.ageMoyen();
        assertEquals(5,age);
    }

    @Test
    void
}
