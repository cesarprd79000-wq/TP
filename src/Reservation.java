import java.time.LocalDate;
import java.time.Month;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class Reservation {
    private String nomClient;
    private LocalDate dateArrivee;
    private LocalDate dateDepart;

    public Reservation(String nomClient,LocalDate dateArrivee, LocalDate dateDepart){
        if (dateDepart == null || dateArrivee == null || !dateDepart.isAfter(dateArrivee)) {
            throw new IllegalArgumentException("La date de départ doit être strictement supérieure à la date d'arrivée.");
        }
        this.nomClient=nomClient;
        this.dateArrivee=dateArrivee;
        this.dateDepart=dateDepart;
    }

    public long dureeSejour() {
        return java.time.temporal.ChronoUnit.DAYS.between(dateDepart , dateArrivee);
    }

    public static boolean estEnHauteSaison(LocalDate date){
        Month mois = date.getMonth();
        if (mois == Month.JULY || mois == Month.AUGUST) return TRUE;
        else return FALSE;
    }

    public String getNomClient() {
        return this.nomClient;
    }

    public LocalDate getDateArrivee() {
        return this.dateArrivee;
    }

    public LocalDate getDateDepart() {
        return this.dateDepart;
    }
}


