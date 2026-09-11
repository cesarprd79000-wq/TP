public class Livre {
    // 1. Attributs
    private String titre;
    private String auteur;
    private int nombrePages;
    private boolean disponible;

    // 2. Constructeur
    public Livre(String titre, String auteur, int nombrePages) {
        // Utilisation de 'this' pour lever l'ambiguïté entre attributs et paramètres[cite: 1]
        this.titre = titre;
        this.auteur = auteur;
        this.nombrePages = nombrePages;
        // Par défaut, le livre est disponible lors de sa création[cite: 1]
        this.disponible = true;
    }

    // 3. Méthode pour emprunter un livre
    public void emprunter() {
        if (this.disponible) {
            this.disponible = false;
            System.out.println("Le livre \"" + this.titre + "\" a été emprunté avec succès.");
        } else {
            System.out.println("Erreur : Le livre \"" + this.titre + "\" n'est pas disponible actuellement.");
        }
    }

    // 4. Méthode pour rendre un livre
    public void rendre() {
        if (!this.disponible) {
            this.disponible = true;
            System.out.println("Le livre \"" + this.titre + "\" a été rendu.");
        } else {
            System.out.println("Le livre \"" + this.titre + "\" est déjà dans la bibliothèque.");
        }
    }


}