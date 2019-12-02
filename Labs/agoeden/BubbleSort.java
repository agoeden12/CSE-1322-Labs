package agoeden;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class BubbleSort {

  static void swap(int startPoint, int comparePoint) {
    int temp = startPoint;
    startPoint = comparePoint;
    comparePoint = temp;
  }

  static void bubbleSort(int arr[], int n) {
    int i, j;
    for (i = 0; i < n - 1; i++)
      for (j = 0; j < n - i - 1; j++)
        if (arr[j] > arr[j + 1])
          swap(arr[j], arr[j + 1]);
  }

  public static void main(String[] args) {
    int a = 10000;
    int[] ReverseArray = new int[100000];
    for (int i = 0; i < 100000; i++) {
      ReverseArray[i] = a;
      a--;
    }
    int[] CloneArray = ReverseArray;

    long startTime = System.currentTimeMillis();
    sort(ReverseArray);
    long endTime = System.currentTimeMillis();
    System.out.println("\nParallel time with " + Runtime.getRuntime().availableProcessors() + " processors is "
        + (endTime - startTime) + " milliseconds");

    startTime = System.currentTimeMillis();
    bubbleSort(CloneArray, 100000);
    endTime = System.currentTimeMillis();
    System.out.println("\nSequential time is " + (endTime - startTime) + " milliseconds");
  }

  public static void sort(int[] array) {
    RecursiveAction mainTask = new SortTask(array);
    ForkJoinPool pool = new ForkJoinPool();
    pool.invoke(mainTask);
  }

  private static class SortTask extends RecursiveAction {
  
    /**
     * Default serial version ID
     */
    private static final long serialVersionUID = 1L;

    private final int THRESHOLD = 1000;
    private int[] list;

    SortTask(int[] list) {
      this.list = list;
    }

    @Override
    protected void compute() {
      if (list.length < THRESHOLD)
        java.util.Arrays.sort(list);
      else {
        for (int i = 0; i < THRESHOLD - 1; i++) {
          for (int j = 0; j < THRESHOLD - i - 1; j++) {
            if (list[j] > list[j + 1]) {
              int temp = list[j];
              list[j] = list[j + 1];
              list[j + 1] = temp;
            }
          }
        }
      }
    }
  }
}