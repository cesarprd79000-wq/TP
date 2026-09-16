package TP2.Test;

import TP2.Exercice3.Compteur;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CompteurTest {

    private Compteur compteur;

    @BeforeEach
    void setUp() {
        compteur = new Compteur();
        System.out.println("Début du test");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Fin du test");
    }

    @Test
    void testValeurInitialeEgaleAZero() {
        assertEquals(0, compteur.getValeur());
    }

    @Test
    void testIncrementerUneFois() {
        compteur.incrementer();
        assertEquals(1, compteur.getValeur());
    }

    @Test
    void testIncrementerTroisFoisPuisReinitialiser() {
        compteur.incrementer();
        compteur.incrementer();
        compteur.incrementer();
        compteur.reinitialiser();
        assertEquals(0, compteur.getValeur());
    }
}
