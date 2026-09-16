package TP1;

public class Rectangle {
    private double largeur;
    private double hauteur;

    public Rectangle(double largeur,double hauteur){
        this.hauteur=hauteur;
        this.largeur=largeur;

    }
    public Rectangle(double cote){
        this(cote, cote);

    }
    public Rectangle(){
        this(1);
    }

    public double aire(){
        return this.largeur*this.hauteur;
    }

    public double perimetre(){
        return 2 * (this.largeur + this.hauteur) ;
    }

}
