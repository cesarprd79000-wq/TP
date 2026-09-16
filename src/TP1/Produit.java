package TP1;

public class Produit {
    private String nom;
    private double prix;

    public Produit(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public void afficher() {
        System.out.println("Produit : " + this.nom + " | Prix : " + this.prix + " €");
    }

    public void afficher(double remise) {
        double prixRemise = this.prix * (1 - remise / 100);
        System.out.println("Produit : " + this.nom + " | Prix remisé (" + remise + "%) : " + prixRemise + " €");
    }

    public void afficher(String devise) {
        System.out.println("Produit : " + this.nom + " | Prix : " + this.prix + " " + devise);
    }
}