public class Main {
    public static void main(String[] args) {
        // 5. Création de 2 livres
        Livre livre1 = new Livre("Le Comte de Monte-Cristo", "Alexandre Dumas", 1200);
        Livre livre2 = new Livre("1984", "George Orwell", 328);

        livre1.emprunter();
        livre2.emprunter();

        // Tentative d'emprunter à nouveau livre1
        livre1.emprunter();

        livre1.rendre();
        livre1.emprunter();
    }
}