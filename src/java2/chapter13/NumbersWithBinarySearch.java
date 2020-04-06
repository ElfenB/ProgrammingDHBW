package java2.chapter13;
public class NumbersWithBinarySearch extends Numbers {

    @Override
    public void add(int key) {                              // fügt neue Zahl aufsteigend sortiert ein
        if (count == data.length) {
            throw new IllegalStateException("Alle Plätze sind belegt.");
        }
        int index = ++count;
        while (--index > 0) {                               // durchlaufe Feld von rechts nach links
            if (data[index-1] > key) {                      // Feldkomponente größer als neuer Wert?
                data[index] = data[index-1];                // schiebt Feldkomponente nach rechts
            } else {
                break;                                      // Einfügeposition gefunden
            }
        }
        data[index] = key;                                  // neuen Wert einfügen
    }

    @Override
    public int search(int key) {                            // überprüft nur "mittlere" Elemente
        return count == 0 ? -1 : search(key, 0, count);     // ganzes Feld durchsuchen
    }

    private int search(int key, int fromIndex, int toIndex) {
        if (toIndex - fromIndex == 1) {                     // nur noch eine Feldkomponente?
            return data[fromIndex] == key ? fromIndex : -1; // Schlüsselvergleich
        }
        int centerIndex = (fromIndex + toIndex) / 2;
        if (data[centerIndex] > key) {                      // Schlüsselvergleich
            return search(key, fromIndex, centerIndex);     // linke Hälfte durchsuchen
        } else {
            return search(key, centerIndex, toIndex);       // rechte Hälfte durchsuchen
        }
    }

    public static void main(String[] args) {
        new NumbersWithBinarySearch().demo();
    }
}