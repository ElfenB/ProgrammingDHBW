package java1.chapter10.exercise2;
public class GeometrieTest {
    private static int errorCount = 0;

    private static void testeGleichheit(double erwartet, double wert) {
        if (Math.abs(erwartet - wert) > 1e-15) {        // Rundungsabweichungen tolerieren
            System.err.println("Fehler: " + wert + " statt " + erwartet + ".");
            errorCount++;
        }
    }

    private static void testeFigur(GeometrischeFigur figur, double flaeche, double umfang) {
      System.out.println(figur.toString());
        testeGleichheit(flaeche, figur.getFlaeche());
        testeGleichheit(umfang, figur.getUmfang());
    }

    public static void main(String[] args) {
        testeFigur(new Dreieck(3, 4, 5), 6, 12);
        testeFigur(new GleichseitigesDreieck(1), Math.sqrt(3) / 4, 3);
        testeFigur(new Rechteck(2, 3), 6, 10);
        testeFigur(new Quadrat(1), 1, 4);
        testeFigur(new Kreis(1), Math.PI, 2 * Math.PI);

        if (errorCount == 0) {
            System.out.println("Es wurden keine Fehler gefunden.");
        } else {
            System.err.println("Es wurden " + errorCount + " Fehler gefunden.");
        }
    }
}