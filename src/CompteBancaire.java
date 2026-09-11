public class CompteBancaire {
    private double solde;
    private String titulaire;

    public CompteBancaire(String titulaire, double soldeInitial) {
        if (soldeInitial < 0) {
            throw new IllegalArgumentException("Le solde initial ne peut pas être négatif.");
        }
        this.titulaire = titulaire;
        this.solde = soldeInitial;
    }

    public double getSolde() {
        return solde;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public void deposer(double montant) {
        if (montant <= 0) {
            throw new IllegalArgumentException("Le montant du dépôt doit être strictement positif.");
        }
        this.solde += montant;
    }

    public void retirer(double montant) {
        if (montant <= 0) {
            throw new IllegalArgumentException("Le montant du retrait doit être strictement positif.");
        }
        if (montant > this.solde) {
            throw new IllegalArgumentException("Solde insuffisant pour effectuer ce retrait.");
        }
        this.solde -= montant;
    }
}