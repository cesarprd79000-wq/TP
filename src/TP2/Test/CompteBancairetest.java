package TP2.Test;

import TP2.Exercice4.CompteBancaire;
import TP2.Exercice4.SoldeInsuffisantException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CompteBancaireTest {

    @Test
    void testRetraitNominal() throws SoldeInsuffisantException {
        CompteBancaire compte = new CompteBancaire(100.0);
        compte.retirer(40.0);
        assertEquals(60.0, compte.getSolde());
    }

    @Test
    void testRetraitLeveSoldeInsuffisantException() {
        CompteBancaire compte = new CompteBancaire(50.0);
        assertThrows(SoldeInsuffisantException.class, () -> compte.retirer(100.0));
    }
}
