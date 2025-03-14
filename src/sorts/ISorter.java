package sorts;

public interface ISorter<T extends Comparable<T>>{
    T[] sort(T[] dados);
    int getComparisons();
    int getSwaps();
    int getTime();
}