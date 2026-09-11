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
    }
}