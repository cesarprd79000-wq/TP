package TP2.Exercice6;

public class Rectangle {
    private double largeur;
    private double hauteur;

    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public double aire() {
        return largeur * hauteur;
    }

    public double perimetre() {
        return 2 * (largeur + hauteur);
    }
}
