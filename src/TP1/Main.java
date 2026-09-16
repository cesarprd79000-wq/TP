package TP1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        // EXERCICE 1
        // 5. Création de 2 livres
        Livre livre1 = new Livre("Le Comte de Monte-Cristo", "Alexandre Dumas", 1200);
        Livre livre2 = new Livre("1984", "George Orwell", 328);

        livre1.emprunter();
        livre2.emprunter();

        // Tentative d'emprunter à nouveau livre1
        livre1.emprunter();

        livre1.rendre();
        livre1.emprunter();

        //EXERCICE 2
        CompteBancaire compte = new CompteBancaire("César", 100.0);
        System.out.println("Solde initial : " + compte.getSolde() + " €");

        compte.deposer(50.0);
        System.out.println("Après dépôt de 50€ : " + compte.getSolde() + " €");

        compte.retirer(30.0);
        System.out.println("Après retrait de 30€ : " + compte.getSolde() + " €");

        // Test dépôt invalide
        try {
            compte.deposer(-10.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur dépôt : " + e.getMessage());
        }

        // Test retrait supérieur au solde
        try {
            compte.retirer(200.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur retrait : " + e.getMessage());
        }

        System.out.println("Solde final : " + compte.getSolde() + " €");

        //EXERCICE 3
        Rectangle r1 = new Rectangle(5, 3);
        Rectangle r2 = new Rectangle(4);
        Rectangle r3 = new Rectangle();

        System.out.println("R1 Aire: " + r1.aire() + " | Périmètre: " + r1.perimetre());
        System.out.println("R2  Aire: " + r2.aire() + " | Périmètre: " + r2.perimetre());
        System.out.println("R3 Aire: " + r3.aire() + " | Périmètre: " + r3.perimetre());

        //EXERCICE 4
        Employe[] employes = new Employe[] {
                new Employe("César", 2000.0),
                new Manager("Vincent", 3000.0, 800.0),
                new Employe("Elias", 2200.0),
                new Manager("Maxime", 3500.0, 1200.0)
        };

        for (Employe e : employes) {
            System.out.println(e.getNom() + " - Salaire : " + e.calculerSalaire() + " €");
        }

        //EXERCICE 5
        Produit p = new Produit("Clavier Mécanique", 100.0);

        p.afficher();
        p.afficher(20.0);
        p.afficher("Euro");

        //EXERCICE 6
        Forme[] formes = new Forme[] {
                new Cercle(3.0),
                new Rectangle2(4.0, 5.0),
                new Triangle(6.0, 2.0)
        };

        for (Forme f : formes) {
            f.afficherAire();
        }

        Forme max = Forme.plusGrande(formes);
        System.out.print("Plus grande forme : ");
        max.afficherAire();

        //Exercice 7
        Allumable[] appareils = new Allumable[] {
                new TelephonePortable(),
                new Lampe()
        };

        System.out.println("Allumage des appareils");
        for (Allumable a : appareils) {a.allumer();}

        System.out.println("\nConnexion Wi-Fi sélective");
        for (Allumable a : appareils) {

            if (a instanceof Connectewifi) {
                Connectewifi appareilWifi = (Connectewifi) a;
                appareilWifi.connecter("Maison_5G");
            } else {
                System.out.println("Cet appareil ne supporte pas le Wi-Fi.");
            }
        }

        //EXERCICE 8
        Reservation res1 = new Reservation("Vincent", LocalDate.of(2026, 7, 10), LocalDate.of(2026, 7, 20));
        Reservation res2 = new Reservation("César", LocalDate.of(2026, 11, 1), LocalDate.of(2026, 11, 5));

        afficherInfosReservation(res1);
        afficherInfosReservation(res2);

        try {
            new Reservation("César", LocalDate.of(2026, 8, 15), LocalDate.of(2026, 8, 10));
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur de réservation évitée : " + e.getMessage());
        }

        //EXERCICE 9
        Etudiant e1 = new Etudiant("A1547882", "César", 15.5);
        Etudiant e2 = new Etudiant("A1547882", "César Pierrard", 18.0);
        Etudiant e3 = new Etudiant("A1478669", "Vincent", 12.0);

        System.out.println(e1);

        List<Etudiant> liste = new ArrayList<>();
        liste.add(e1);

        System.out.println("\ne1.equals(e2) ? " + e1.equals(e2));

        System.out.println("La liste contient-elle e2 ? " + liste.contains(e2));
        System.out.println("La liste contient-elle e3 ? " + liste.contains(e3));


    }

    private static void afficherInfosReservation(Reservation r) {
        System.out.println("Réservation de " + r.getNomClient() + " :");
        System.out.println("Durée : " + r.dureeSejour() + " nuits");
        System.out.println("Haute saison : " + (Reservation.estEnHauteSaison(r.getDateArrivee()) ? "Oui" : "Non"));
    }






}