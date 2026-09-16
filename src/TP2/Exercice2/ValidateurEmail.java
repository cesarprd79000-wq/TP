package TP2.Exercice2;

public class ValidateurEmail {
    public boolean estValide(String email) {
        if (email == null) {
            return false;
        }
        return email.contains("@") && email.contains(".");
    }
}
