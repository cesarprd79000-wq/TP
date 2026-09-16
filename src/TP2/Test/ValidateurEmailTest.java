package TP2.Test;

import TP2.Exercice2.ValidateurEmail;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class ValidateurEmailTest {

    @Test
    void testEmailValide() {
        ValidateurEmail validateur = new ValidateurEmail();
        boolean resultat = validateur.estValide("test@example.com");
        assertTrue(resultat);
    }

    @Test
    void testEmailSansArobase() {
        ValidateurEmail validateur = new ValidateurEmail();
        boolean resultat = validateur.estValide("testexample.com");
        assertFalse(resultat);
    }

    @Test
    void testEmailNull() {
        ValidateurEmail validateur = new ValidateurEmail();
        boolean resultat = validateur.estValide(null);
        assertFalse(resultat);
    }

    @Test
    void testChaineVide() {
        ValidateurEmail validateur = new ValidateurEmail();
        boolean resultat = validateur.estValide("");
        assertFalse(resultat);
    }
}
