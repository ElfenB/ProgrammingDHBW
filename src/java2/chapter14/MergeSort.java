package java2.chapter14;
public class MergeSort<T extends Comparable<T>> extends SortingAlgorithm<T> {

    @Override
    protected void sort(int startIndex, int endIndex) {
        if (startIndex + 1 < endIndex) {
            int centerIndex = (startIndex + endIndex) / 2;
            sort(startIndex, centerIndex);                                              // sortiert den linken Feldbereich
            sort(centerIndex, endIndex);                                                // sortiert den rechten Feldbereich
            merge(startIndex, centerIndex, endIndex);                                   // mischt die beiden sortierten Feldbereiche zusammen
        }
    }

    private void merge(int startIndex, int centerIndex, int endIndex) {
        int tmpIndex = getValuesSpace();
        for (int position = 0; startIndex + position < centerIndex; position++) {       // verschiebt den linken Feldbereich hinter das Feldende
            swap(startIndex + position, tmpIndex + position);
        }
        int leftIndex = tmpIndex, rightIndex = centerIndex, insertIndex = startIndex;
        while (insertIndex < rightIndex) {                                              // mischt den rechten Feldbereich mit dem ausrangierten Teil ...
            swap(insertIndex++, rightIndex < endIndex && isLessThan(rightIndex, leftIndex) ? rightIndex++ : leftIndex++);
        }                                                                               // ... und füllt dabei den gesamten Feldbereich von links nach rechts
    }

    public static void main(String[] args) {
        new SortingAlgorithmEvaluator<Integer>().evaluate(
            new MergeSort<>(), new Integer[] { 5, 4, 8, 6, 3, 10, 2, 7, 9, 1 }, true
        );
    }
}