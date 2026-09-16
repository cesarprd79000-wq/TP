package TP1;

import java.util.Objects;

public class Etudiant {
    private String numeroEtudiant;
    private String nom;
    private double moyenne;

    public Etudiant(String numeroEtudiant, String nom, double moyenne) {
        this.numeroEtudiant = numeroEtudiant;
        this.nom = nom;
        this.moyenne = moyenne;
    }

    @Override
    public String toString() {
        return "Etudiant n°"+numeroEtudiant+"\n Nom :"+nom+"\n Moyenne : "+moyenne;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etudiant etudiant = (Etudiant) o;
        return Objects.equals(numeroEtudiant, etudiant.numeroEtudiant);
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(numeroEtudiant);
    }

    public String getNumeroEtudiant() {
        return numeroEtudiant;
    }
}

