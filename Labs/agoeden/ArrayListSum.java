package agoeden;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class ArrayListSum {

  public static void sumOfArrayList(ArrayList<Integer> input) {
    int sum = 0;
    for (int var : input) {
      sum += var;
    }
    System.out.println("Sum of ArrayList<Integer> is: " + sum);
    System.out.println("ArrayList<Integer> contains: " + input.toString());
  }

  public static void sumOfLinkedList(LinkedList<Integer> input) {
    int sum = 0;
    for (int var : input) {
      sum += var;
    }
    System.out.println("Sum of LinkedList<Integer> is: " + sum);
    System.out.println("LinkedList<Integer> contains: " + input.toString());
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean isReady = false;
    ArrayList<Integer> myArrayList = new ArrayList<Integer>();
    LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
    while (!isReady) {
      System.out.println("Please enter an integer:");
      try {
        int num = input.nextInt();
        myArrayList.add(num);
        myLinkedList.addFirst(num);
        System.out.println("Would you like to get the sum of  your list?");
        input.nextLine();
        if (input.nextLine().toLowerCase().contains("y") || (myArrayList.size() >= 10 && myLinkedList.size() >= 10)) {
          isReady = true;
        }
      } catch (InputMismatchException errException) {
        input.nextLine();
      }
    }
    sumOfArrayList(myArrayList);
    sumOfLinkedList(myLinkedList);
    input.close();
  }
}