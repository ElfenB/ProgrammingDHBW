package testingInLessons;
public class Schueler extends Person {          // Schueler ist Subklasse von Person
    private String schuelernummer;              // eigene Instanzvariablen
    private String klasse;

    public Schueler(String vorname, String nachname, int geburtsjahr, String schuelernummer, String klasse) {
//      this.vorname = vorname;                 // -> The field Person.vorname is not visible
        setVorname(vorname);                    // Aufruf der Superklassen-Setter
        setNachname(nachname);
        setGeburtsjahr(geburtsjahr);
        this.schuelernummer = schuelernummer;   // Initialisierung der eigenen Instanzvariablen
        this.klasse = klasse;
    }

    public String getSchuelernummer() {         // Getter für eigene Instanzvariable
        return schuelernummer;
    }

    public String getKlasse() {                 // Getter für eigene Instanzvariable
        return klasse;
    }
    public void setKlasse(String klasse) {      // Setter für eigene Instanzvariable
        this.klasse = klasse;
    }
}