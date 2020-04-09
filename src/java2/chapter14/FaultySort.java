package java2.chapter14;
public class FaultySort<T extends Comparable<T>> extends SortingAlgorithm/*Simple*/<T> {

    @Override
    protected void sort(int startIndex, int endIndex) {
        if (startIndex + 1 < endIndex) {
            if (isGreaterThan(startIndex, startIndex + 1)) { 
                swap(startIndex, startIndex + 1);           // vertauscht ggf. die ersten beiden Elemente
            }
        }                                                   // ignoriert alle weiteren Elemente
    }

    public static void main(String[] args) {
        new SortingAlgorithmEvaluator<Integer>().evaluate(  // klappt, da nichts zu tun ist
            new FaultySort<>(), new Integer[] { 1, 2, 3 }, true
        );

        new SortingAlgorithmEvaluator<Double>().evaluate(   // klappt, da nur die ersten beiden verkehrt sind
            new FaultySort<>(), new Double[] { 2.2, 1.1, 3.3 }, true
        );

        new SortingAlgorithmEvaluator<Character>().evaluate(// scheitert, da das dritte Element ignoriert wird
            new FaultySort<>(), new Character[] { '1', '3', '2' }, true
        );

        new SortingAlgorithmEvaluator<String>().evaluate(   // scheitert, da das dritte Element ignoriert wird
            new FaultySort<>(), new String[] { "3", "1", "2" }, true
        );
    }
}