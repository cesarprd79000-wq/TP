package TP2.Test;

import TP2.Exercice6.Rectangle;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.testng.Assert.assertEquals;

public class RectangleTest {

    @Test
    void testAireEtPerimetre() {
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        assertAll("Propriétés du rectangle",
                () -> assertEquals(15.0, rectangle.aire(), "Calcul de l'aire"),
                () -> assertEquals(16.0, rectangle.perimetre(), "Calcul du périmètre")
        );
    }
}
