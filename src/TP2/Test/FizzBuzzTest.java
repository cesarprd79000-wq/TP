package TP2.Test;

import TP2.Exercice8.FizzBuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void testConvertirNombreOrdinal() {
        assertEquals("1", fizzBuzz.convertir(1));
    }

    @Test
    void testConvertirMultipleDeTrois() {
        assertEquals("Fizz", fizzBuzz.convertir(3));
    }

    @Test
    void testConvertirMultipleDeCinq() {
        assertEquals("Buzz", fizzBuzz.convertir(5));
    }

    @Test
    void testConvertirMultipleDeTroisEtCinq() {
        assertEquals("FizzBuzz", fizzBuzz.convertir(15));
    }
}
