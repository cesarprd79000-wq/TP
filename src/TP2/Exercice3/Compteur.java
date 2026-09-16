package TP2.Exercice3;

public class Compteur {
    private int valeur = 0;

    public void incrementer() {
        this.valeur++;
    }

    public void reinitialiser() {
        this.valeur = 0;
    }

    public int getValeur() {
        return valeur;
    }
}
