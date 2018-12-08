package com.evaluate;

public class MyBubbleSort {

	public static void bubble_srt(int array[]) {
        int n = array.length;
        int temp;
        for (int m = 0; m < n; m++) {
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;                }
            }
            printNumbers(array);
        }
    }
  
   
    private static void printNumbers(int[] input) {
          
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
  
    public static void main(String[] args) {
        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        bubble_srt(input);
  
    }
}