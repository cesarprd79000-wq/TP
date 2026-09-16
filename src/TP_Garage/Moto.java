package TP_Garage;

import java.time.LocalDate;

public class Moto extends Vehicule {
    private int cylindreeCm3;

    public Moto(String immatriculation, String marque, LocalDate dateMiseEnCirculation, int cylindreeCm3) throws ImmatriculationInvalideException {
        super(immatriculation, marque, dateMiseEnCirculation);
        this.cylindreeCm3 = cylindreeCm3;
    }

    public Moto(String immatriculation, String marque, int cylindreeCm3) throws ImmatriculationInvalideException {
        super(immatriculation, marque);
        this.cylindreeCm3 = cylindreeCm3;
    }

    public int getCylindreeCm3() {
        return cylindreeCm3;
    }

    @Override
    public void avancer() {
        System.out.println("La moto " + getImmatriculation() + " vrombit et dépasse le trafic.");
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Cylindrée: %d cm³", cylindreeCm3);
    }
}