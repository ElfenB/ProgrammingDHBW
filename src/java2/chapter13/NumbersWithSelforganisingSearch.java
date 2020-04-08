package java2.chapter13;
public class NumbersWithSelforganisingSearch extends Numbers {

    @Override
    public void add(int key) {              // fügt neue Zahl hinten ein
        if (count == data.length) {
            throw new IllegalStateException("Alle Plätze sind belegt.");
        }
        data[count++] = key;
    }

    @Override
    public int search(int key) {            // überprüft ggf. jedes Element
        for (int index = 0; index < count; index++) {
            if (data[index] == key) {       // Schlüsselvergleich
            	if (index != 0) {
            		for (int i = index; i > 0; i--) {
						data[i] = data[i - 1];
					}
            		data[0] = key;
            	}
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        new NumbersWithSelforganisingSearch().demo();
    }
}
