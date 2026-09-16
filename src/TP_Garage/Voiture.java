package TP_Garage;

import java.time.LocalDate;

public class Voiture extends Vehicule {
    private int nombrePortes;

    public Voiture(String immatriculation, String marque, LocalDate dateMiseEnCirculation, int nombrePortes) throws ImmatriculationInvalideException {
        super(immatriculation, marque, dateMiseEnCirculation);
        this.nombrePortes = nombrePortes;
    }

    public Voiture(String immatriculation, String marque, int nombrePortes) throws ImmatriculationInvalideException {
        super(immatriculation, marque);
        this.nombrePortes = nombrePortes;
    }

    public int getNombrePortes() {
        return nombrePortes;
    }

    @Override
    public void avancer() {
        System.out.println("La voiture " + getImmatriculation() + " roule sur la route.");
    }

    public void afficher() {
        System.out.println(toString());
    }

    // Méthode surchargée (overload)
    public void afficher(String prefixe) {
        System.out.println(prefixe + " " + toString());
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Portes: %d", nombrePortes);
    }
}