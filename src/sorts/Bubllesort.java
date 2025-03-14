package sorts;

import java.util.Arrays;
import jdk.jshell.execution.Util;
import sorts.Utilits;

public class Bubllesort<T extends Comparable> implements ISorter<T>{
    private int comparisons = 0;
    private int swaps = 0;
    private int time = 0; //Milisegundos
    private Utilits<T> utilits = new Utilits<T>();

    @Override
    public T[] sort(T[] dados) {
        T{} arrayCopy = Arrays.copyOf(dados, dados.length);
        int N = arrayCopy.length;
        start();
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < N-i; j++){
                comparisons++;
                if (arrayCopy[j].compareTo(arrayCopy[j+1]) > 0){
                    Utilits.swap(arrayCopy, j, j+1);
                    swaps++;
                }
                }


            }
        }
        finish();

        return arrayCopy
    }

    @Override
    public int getComparisons() {
       return comparisons;
    }

    @Override
    public int getSwaps() {
        return swaps;
    }

    @Override
    public int getTime() {
        return time;
    }

    private void startTime{
        //inicializa temporizador
    }

    private void 

    private void endTime{
        //finaliza temporizador
    }
    
}