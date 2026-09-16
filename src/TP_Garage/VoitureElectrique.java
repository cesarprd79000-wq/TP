package TP_Garage;

import java.time.LocalDate;

public class VoitureElectrique extends Voiture implements Rechargeable {
    private int autonomieKm;

    public VoitureElectrique(String immatriculation, String marque, LocalDate dateMiseEnCirculation, int nombrePortes, int autonomieKm) throws ImmatriculationInvalideException {
        super(immatriculation, marque, dateMiseEnCirculation, nombrePortes);
        this.autonomieKm = autonomieKm;
    }

    public VoitureElectrique(String immatriculation, String marque, int nombrePortes, int autonomieKm) throws ImmatriculationInvalideException {
        super(immatriculation, marque, nombrePortes);
        this.autonomieKm = autonomieKm;
    }

    @Override
    public int getAutonomieKm() {
        return autonomieKm;
    }

    @Override
    public void recharger() {
        System.out.println("Recharge de la voiture électrique " + getImmatriculation() + " en cours... (Autonomie: " + autonomieKm + " km)");
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Autonomie: %d km", autonomieKm);
    }
}