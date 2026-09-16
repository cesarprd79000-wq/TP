package TP2.Test;

import TP_Garage.Garage;
import TP_Garage.ImmatriculationInvalideException;
import TP_Garage.Voiture;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class VoitureTest {
    @Test
    void TestImmatriculationValide(){
        assertDoesNotThrow(()-> {
            Voiture voiture = new Voiture("CP-212-BG","Mercedes",5);
            assertEquals("CP-212-BG", voiture.getImmatriculation());
        });
    }
    @Test
    void TestImmatriculationNonValide(){
        assertThrows(ImmatriculationInvalideException.class, ()-> {
            new Voiture("César", "Mercedes", 5);
        } );
    }

    @Test
    void TestCalculAgeEnAnnee() throws ImmatriculationInvalideException{
        LocalDate dateDeCirculation = LocalDate.now().minusYears(5);
        Voiture voiture = new Voiture ("CP-212-BG","merco",5);
        double age = Garage.ageMoyen();
        assertEquals(5,age);
    }

    @Test
    void TestMemeImmatriculation() throws ImmatriculationInvalideException{
        Voiture voiture1 = new Voiture("AB-001-CD","Merco",5);
        Voiture voiture2 = new Voiture("AB-001-CD","Merco",5);
        assertEquals(voiture1,voiture2);
    }

}
