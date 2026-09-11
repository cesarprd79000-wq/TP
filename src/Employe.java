public class Employe {
    protected String nom;
    protected double salaireBase;

    public Employe(String nom, double salaireBase) {
        this.nom = nom;
        this.salaireBase = salaireBase;
    }

    public double calculerSalaire() {
        return this.salaireBase;
    }

    public String getNom() {
        return nom;
    }
}