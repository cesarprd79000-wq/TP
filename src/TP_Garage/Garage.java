package TP_Garage;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Garage {
    private String nom;
    private List<Vehicule> vehicules;

    public Garage(String nom) {
        this.nom = nom;
        this.vehicules = new ArrayList<>();
    }

    public void ajouterVehicule(Vehicule v) {
        if (vehicules.contains(v)) {
            throw new IllegalArgumentException("Le véhicule avec l'immatriculation " + v.getImmatriculation() + " existe déjà.");
        }
        vehicules.add(v);
    }

    public Vehicule rechercherParImmatriculation(String immat) {
        for (Vehicule v : vehicules) {
            if (v.getImmatriculation().equalsIgnoreCase(immat)) {
                return v;
            }
        }
        throw new NoSuchElementException("Aucun véhicule trouvé avec l'immatriculation : " + immat);
    }

    public void afficherTousLesVehicules() {
        System.out.println("=== Liste des véhicules du garage " + nom + " ===");
        for (Vehicule v : vehicules) {
            System.out.println(v);
        }
    }

    public void faireAvancerTousLesVehicules() {
        for (Vehicule v : vehicules) {
            v.avancer();
        }
    }

    public void rechargerVehiculesElectriques() {
        for (Vehicule v : vehicules) {
            if (v instanceof Rechargeable) {
                Rechargeable r = (Rechargeable) v; // Downcasting
                r.recharger();
            }
        }
    }

    public static double ageMoyen() {
        if (vehicules.isEmpty()) {
            return 0.0;
        }
        double totalAnnees = 0;
        LocalDate aujourdhui = LocalDate.now();
        for (Vehicule v : vehicules) {
            Period p = Period.between(v.getDateMiseEnCirculation(), aujourdhui);
            totalAnnees += p.getYears() + (p.getMonths() / 12.0) + (p.getDays() / 365.25);
        }
        return totalAnnees / vehicules.size();
    }
}