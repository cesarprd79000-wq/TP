public class Rectangle2 extends Forme {
    private double largeur;
    private double hauteur;

    public Rectangle2(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public double aire() {
        return largeur * hauteur;
    }
}