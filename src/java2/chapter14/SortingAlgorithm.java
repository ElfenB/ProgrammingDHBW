package java2.chapter14;
import java.util.Arrays;

public abstract class SortingAlgorithm<T extends Comparable<T>> {
    private T[] values;                                     // Feld mit den zu sortierenden Werten
    private T[] tmpValues;                                  // Feld mit zusätzlich benötigtem Platz
    private long comparisonCount;                           // Anzahl der durchgeführten Vergleiche
    private long swapCount;                                 // Anzahl der durchgeführten Vertauschungen
    private boolean verbose;                                // Flag für Konsolenausgabe

    /**
     * Sortiert den angegebenen Abschnitt des vorgegebenen Feldes aufsteigend.
     * 
     * @param startIndex linker Rand (inkl.)
     * @param endIndex rechter Rand (exkl.)
     */
    protected abstract void sort(int startIndex, int endIndex);

    /**
     * Prüft, ob die erste Feldkomponente kleiner ist als die zweite.
     * 
     * @param first Index der ersten Feldkomponente
     * @param second Index der zweiten Feldkomponente
     * @return <code>true</code> gdw. die erste Komponente kleiner ist als die zweite
     */
    protected final boolean isLessThan(int first, int second) {
        comparisonCount++;
        return getValue(first).compareTo(getValue(second)) < 0;
    }

    /**
     * Prüft, ob die erste Feldkomponente größer ist als die zweite.
     * 
     * @param first Index der ersten Feldkomponente
     * @param second Index der zweiten Feldkomponente
     * @return <code>true</code> gdw. die erste Komponente größer ist als die zweite
     */
    protected final boolean isGreaterThan(int first, int second) {
        comparisonCount++;
        return getValue(first).compareTo(getValue(second)) > 0;
    }

    /**
     * Prüft, ob die erste Feldkomponente gleich der zweiten ist.
     * 
     * @param first Index der ersten Feldkomponente
     * @param second Index der zweiten Feldkomponente
     * @return <code>true</code> gdw. die erste Komponente gleich der zweiten ist
     */
    protected final boolean isEqualTo(int first, int second) {
        comparisonCount++;
        return getValue(first).compareTo(getValue(second)) == 0;
    }

    /**
     * Vertauscht die erste Feldkomponente mit der zweiten.
     * 
     * @param first Index der ersten Feldkomponente
     * @param second Index der zweiten Feldkomponente
     */
    protected final void swap(int first, int second) {
        swapCount++;
        T tmp = getValue(first);
        setValue(first, getValue(second));
        setValue(second, tmp);
        if (verbose) {
            printSwap(first, second);
        }
    }

    /**
     * Visualisiert die Vertauschung in der Konsole.
     * 
     * @param first Index der ersten Feldkomponente
     * @param second Index der zweiten Feldkomponente
     */
    private void printSwap(int first, int second) {
        for (int index = 0; index < values.length; index++) {
            boolean swapped = (index == first || index == second);
            System.out.print("" + (swapped ? '<' : ' ') + (values[index] == null ? '_' : values[index]) + (swapped ? '>' : ' ') + ' ');
        }
        if (tmpValues.length > 0) {
            System.out.print("| ");
            for (int index = 0; index < tmpValues.length; index++) {
                boolean swapped = values.length + index == first || values.length + index == second;
                System.out.print("" + (swapped ? '<' : ' ') + (tmpValues[index] == null ? '_' : tmpValues[index]) + (swapped ? '>' : ' ') + ' ');
            }
        }
        System.out.println();
    }

    /**
     * Liefert den Wert mit dem gegebenen Index.
     * Verlässt der Index den Bereich der ursprünglich gegebenen Werte,
     * so wird der Wert aus dem zusätzlich reservierten Speicherbereich genommen.
     * Bei Bedarf wird weiterer zusätzlicher Speicherplatz reserviert.
     * 
     * @param index Index des zu liefernden Wertes
     * @return der durch den Index bezeichnete Wert
     */
    private T getValue(int index) {
        if (index >= values.length + tmpValues.length) {    // bei Bedarf wird der zusätzliche Platz erweitert
            tmpValues = Arrays.copyOf(tmpValues, index + 1 - values.length);
        }
        return index < values.length ? values[index] : tmpValues[index - values.length];
    }

    /**
     * Setzt den Wert mit dem gegebenen Index neu.
     * Verlässt der Index den Bereich der ursprünglich gegebenen Werte,
     * so wird der Wert aus dem zusätzlich reservierten Speicherbereich genommen.
     * 
     * @param index Index des zu setzenden Wertes
     * @param value neuer Wert
     */
    private void setValue(int index, T value) {
        if (index < values.length) {
            values[index] = value;
        } else {
            tmpValues[index - values.length] = value;       // setzt Wert im zusätzlichen Speicherbereich
        }
    }

    /**
     * Sortiert das Feld und zählt die dabei durchgeführten Vergleiche und Vertauschungen.
     * 
     * @param values zu sortierendes Feld
     * @param verbose Konsolenausgabe aktivieren?
     */
    public final void sort(T[] values, boolean verbose) {
        this.values = values;
        this.verbose = verbose;
        tmpValues = Arrays.copyOf(values, 0);               // zunächst gibt es keinen zusätzlichen Platz
        comparisonCount = swapCount = 0;
        if (verbose) {
            System.out.println(getClass().getSimpleName());
            for (int index = 0; index < values.length; index++) {
                System.out.print(" " + values[index] + "  ");
            }
            System.out.println();
        }
        sort(0, values.length);
    }

    /**
     * Liefert die Anzahl der durchgeführten Vergleiche.
     * 
     * @return Anzahl der Vergleiche
     */
    public final long getComparisonCount() {
        return comparisonCount;
    }

    /**
     * Liefert die Anzahl der durchgeführten Vertauschungen.
     * 
     * @return Anzahl der Vertauschungen
     */
    public final long getSwapCount() {
        return swapCount;
    }

    /**
     * Liefert die Anzahl der ursprünglich benötigten Speicherplätze.
     * 
     * @return Anzahl der ursprünglich benötigten Speicherplätze
     */
    public final int getValuesSpace() {
        return values.length;
    }

    /**
     * Liefert die Anzahl der zusätzlich benötigten Speicherplätze.
     * 
     * @return Anzahl der zusätzlich benötigten Speicherplätze
     */
    public final int getExtraSpace() {
        return tmpValues.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(values) + Arrays.toString(tmpValues) + " #comparisons=" + comparisonCount + " #swaps=" + swapCount;
    }
}