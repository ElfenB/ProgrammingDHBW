package java2.chapter13;

public abstract class Numbers {
    protected int[] data = new int[10];     // Feld für abgespeicherte Zahlen
    protected int count = 0;                // Anzahl der abgespeicherten Zahlen

    public abstract void add(int key);      // fügt eine Zahl hinzu

    public abstract int search(int key);    // sucht den Index einer Zahl (-1: fehlt)

    public void print() {                   // Ausgabe der abgespeicherten Zahlen
        System.out.print("Feld:");
        for (int index = 0; index < count; index++) {
            System.out.print(" " + data[index]);
        }
        System.out.println();
    }

    public void demo() {                    // Vorführungsmethode
        print();
        add(6);
        print();
        add(9);
        print();
        add(2);
        print();
        add(3);
        print();
        for (int key = 0; key < 10; key++) {
            System.out.println(key + "? " + search(key));
            print();						// erneute Ausgabe des ggf. umgebauten Feldes
        }
    }
}
