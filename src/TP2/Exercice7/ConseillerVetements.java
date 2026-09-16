package TP2.Exercice7;

public class ConseillerVetements {
    private MeteoService meteoService;

    public ConseillerVetements(MeteoService meteoService) {
        this.meteoService = meteoService;
    }

    public String conseiller(String ville) {
        int temp = meteoService.getTemperature(ville);
        if (temp < 10) {
            return "Porter un manteau";
        } else {
            return "Tenue légère";
        }
    }
}
