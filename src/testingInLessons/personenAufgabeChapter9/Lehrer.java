package testingInLessons.personenAufgabeChapter9;
public class Lehrer extends Person {            // Lehrer ist Subklasse von Person
    private String personalnummer;              // eigene Instanzvariablen
    private double gehalt;

    public Lehrer(String vorname, String nachname, int geburtsjahr, String personalnummer, double gehalt) {
        setVorname(vorname);                    // Aufruf der Superklassen-Setter
        setNachname(nachname);
        setGeburtsjahr(geburtsjahr);
        this.personalnummer = personalnummer;   // Initialisierung der eigenen Instanzvariablen
        this.gehalt = gehalt;
    }

    public String getPersonalnummer() {         // Getter für eigene Instanzvariable
        return personalnummer;
    }

    public double getGehalt() {                 // Getter für eigene Instanzvariable
        return gehalt;
    }
    public void setGehalt(double gehalt) {      // Setter für eigene Instanzvariable
        this.gehalt = gehalt;
    }
    
    public String toString() {
    	return getName() + " *" + getGeburtsjahr() + " Beruf: Lehrer";
    }
}