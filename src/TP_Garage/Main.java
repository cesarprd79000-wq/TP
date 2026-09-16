package TP_Garage;
import java.time.LocalDate;
import java.util.NoSuchElementException;
public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage("CNAM Niort");

        try {
            Voiture voiture1 = new Voiture("AB-123-CD", "Peugeot", LocalDate.of(2018, 3, 12), 5);
            Voiture voiture2 = new Voiture("BG-007-CP", "Renault", 3); // constructeur surchargé (date = aujourd'hui)
            VoitureElectrique voitureElec = new VoitureElectrique("IJ-789-KL", "Tesla", LocalDate.of(2022, 6, 1), 4, 500);
            Moto moto = new Moto("MN-012-OP", "Yamaha", LocalDate.of(2015, 9, 20), 600);

            garage.ajouterVehicule(voiture1);
            garage.ajouterVehicule(voiture2);
            garage.ajouterVehicule(voitureElec);
            garage.ajouterVehicule(moto);

            System.out.println();
            garage.afficherTousLesVehicules();

            garage.faireAvancerTousLesVehicules();

            garage.rechargerVehiculesElectriques();

            voiture1.afficher();
            voiture1.afficher(">>>");

            System.out.printf("%n Âge moyen du parc: %.1f an(s)%n", garage.ageMoyen());

            // tentativ d'ajout d'un doublon
            try {
                garage.ajouterVehicule(new Voiture("AB-123-CD", "Peugeot", 5));
            } catch (IllegalArgumentException e) {
                System.out.println("Erreur capturée: " + e.getMessage());
            }

            // recherches d'un véhicule qui existe deja
            System.out.println("\nVéhicule existant ");
            try {
                garage.rechercherParImmatriculation("ZZ-999-ZZ");
            } catch (NoSuchElementException e) {
                System.out.println("Erreur capturée: " + e.getMessage());
            } finally {
                System.out.println("Recherche terminée.");
            }

            // exception personnalisée
            System.out.println("\nimmatriculation invalide");
            try {
                Voiture voitureInvalide = new Voiture("ddddddd", "Dacia", 5);
                garage.ajouterVehicule(voitureInvalide);
            } catch (ImmatriculationInvalideException e) {
                System.out.println("Erreur capturée: " + e.getMessage());
            }

        } catch (ImmatriculationInvalideException e) {

            System.err.println("Erreur fatale à l'initialisation: " + e.getMessage());
        }
    }
}