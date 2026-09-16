package TP2.Test;

import TP2.Exercice1.Calculatrice;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CalculatriceTest {
    @Test
    void testAddition() {
        Calculatrice calc = new Calculatrice();
        int resultat = calc.addition(5, 3);
        assertEquals(8, resultat);
    }

    @Test
    void testSoustraction() {
        Calculatrice calc = new Calculatrice();
        int resultat = calc.soustraction(13, 5);
        assertEquals(8, resultat);
    }

    @Test
    void testMultiplication() {
        Calculatrice calc = new Calculatrice();
        int resultat = calc.multiplication(5, 5);
        assertEquals(25, resultat);
    }

    @Test
    void testDivision() {
        Calculatrice calc = new Calculatrice();
        int resultat = calc.division(10, 2);
        assertEquals(5, resultat);
    }


}
