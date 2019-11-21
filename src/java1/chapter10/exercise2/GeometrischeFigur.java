package java1.chapter10.exercise2;
public abstract class GeometrischeFigur {

    /**
     * Gibt die Fläche der geometrischen Figur zurück.
     * 
     * @return Fläche der geometrischen Figur
     */
    public abstract double getFlaeche();

    /**
     * Gibt den Umfang der geometrischen Figur zurück.
     * 
     * @return Umfang der geometrischen Figur
     */
    public abstract double getUmfang();

    /**
     * Liefert eine Beschreibung der geometrischen Figur.
     * <p>
     * Die Beschreibung enthält den Figurtyp und die charakterisierenden Größen.
     * 
     * @return Beschreibung der geometrischen Figur
     */
    public abstract String getBeschreibung();

    @Override
    public final String toString() {
        return getBeschreibung() + " mit Fläche " + getFlaeche() + " und Umfang " + getUmfang();
    }
}