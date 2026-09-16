package TP_Garage;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Vehicule {
    private String immatriculation;
    private String marque;
    private LocalDate dateMiseEnCirculation;

    public Vehicule(String immatriculation, String marque, LocalDate dateMiseEnCirculation) throws ImmatriculationInvalideException {
        if (immatriculation == null || !immatriculation.matches("[A-Z]{2}-[0-9]{3}-[A-Z]{2}")) {
            throw new ImmatriculationInvalideException("Format d'immatriculation invalide : " + immatriculation);
        }
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.dateMiseEnCirculation = dateMiseEnCirculation;
    }

    // Constructeur surchargé utilisant la date du jour par défaut
    public Vehicule(String immatriculation, String marque) throws ImmatriculationInvalideException {
        this(immatriculation, marque, LocalDate.now());
    }

    public abstract void avancer();

    public String getImmatriculation() {
        return immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public LocalDate getDateMiseEnCirculation() {
        return dateMiseEnCirculation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicule vehicule = (Vehicule) o;
        return Objects.equals(immatriculation, vehicule.immatriculation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(immatriculation);
    }

    @Override
    public String toString() {
        return String.format("[%s] Marque: %s, Mise en circulation: %s",
                immatriculation, marque, dateMiseEnCirculation);
    }
}