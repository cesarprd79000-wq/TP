public class Lampe implements Allumable {
    private boolean allume = false;

    @Override
    public void allumer() {
        this.allume = true;
        System.out.println("Lampe allumée.");
    }

    @Override
    public void eteindre() {
        this.allume = false;
        System.out.println("Lampe éteinte.");
    }
}