package java2.chapter14;
public class HeapSort<T extends Comparable<T>> extends SortingAlgorithm<T> {

    @Override
    protected void sort(int startIndex, int endIndex) {
        if (startIndex != 0) {
            throw new IllegalArgumentException("Für Heapsort muss der startIndex 0 sein!");
        }
        for (int index = endIndex / 2 - 1; index >= 0; index--) {
            downheap(index, endIndex);                      // Heap von unten aufbauen: Downheap für alle inneren Knoten
        }
        for (int index = endIndex - 1; index > 0; index--) {
            swap(0, index);                                 // Maximum der verbleibenden Knoten rutscht ans momentane Ende
            downheap(0, index);                             // Downheap für die neue Wurzel im verbleibenden Baum
        }
    }

    private void downheap(int vertex, int endIndex) {
        int maxChild;                                       // größtes Kind des Knoten lokalisieren
        while ((maxChild = 2 * vertex + 1) < endIndex) {    // solange es Kinder gibt, ist das erste das größere oder ...
            if (maxChild + 1 < endIndex && isGreaterThan(maxChild + 1, maxChild)) {
                maxChild++;                                 // ... es gibt zwei Kinder und das zweite ist das größere
            }
            if (!isLessThan(vertex, maxChild)) {            // falls das größte Kind nicht größer ist als der Knoten, ...
                return;                                     // ... ist die Heapeigenschaft hergestellt
            }
            swap(vertex, maxChild);                         // sonst: vertausche Knoten mit größtem Kind und ...
            vertex = maxChild;                              // ... fahre mit der Position des größten Kindes fort
        }
    }

    public static void main(String[] args) {
        new SortingAlgorithmEvaluator<Integer>().evaluate(new HeapSort<>(),
            new Integer[] { 5, 4, 8, 6, 3, 10, 2, 7, 9, 1 }, true
        );
    }
}