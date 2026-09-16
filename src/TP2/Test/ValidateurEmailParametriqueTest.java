package TP2.Test;

import TP2.Exercice2.ValidateurEmail;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.testng.AssertJUnit.assertEquals;

class ValidateurEmailParametriqueTest {

    @ParameterizedTest
    @CsvSource({
            "vincent.lpn@outlook.com, true",
            "cesar.lpf@gmail.fr, true",
            "abcde.com, false",
            "elias@gmal, false",
            "mailquimarchepas, false",
            "samiche.elias@gmail.com, true"
    })
    void testEstValideMultiplesCas(String email, boolean attendu) {
        ValidateurEmail validateur = new ValidateurEmail();
        boolean resultat = validateur.estValide(email);
        assertEquals(attendu, resultat);
    }
}
