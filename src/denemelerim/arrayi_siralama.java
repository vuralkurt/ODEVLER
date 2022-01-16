package denemelerim;

import java.util.Arrays;

public class arrayi_siralama {

    public static void main(String[] args) {

        // ARRAYI SIRALAMA

        //      int[] array = {23, 4, 567, 8, 9, 0};
        //      System.out.println("Before Bubble Sort -> " + Arrays.toString(array));

        //      bubbleSort(array);

        //      System.out.println("After Bubble Sort -> " + Arrays.toString(array));

        //  }

        //  static void bubbleSort(int[] arr) {

        //      int sayi = arr.length;
        //      int temp = 0;

        //      for (int i = 0; i < sayi; i++) {

        //          for (int j = 1; j < sayi - i; j++) {
        //              //swap numbers
        //              if (arr[j - 1] > arr[j]) {

        //                  temp = arr[j];

        //                  arr[j] = arr[j - 1];

        //                  arr[j - 1] = temp;

        //              }
        //          }
        //      }
        //  }

        //===============================================================================


        int[] arr = {3, 67, 9, 46, 55, 48};

        int diff = Integer.MAX_VALUE;
        int firstHorseInd = 0;
        int secondHorseInd = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) < diff && Math.abs(arr[i] - arr[j]) != 0) {
                    diff = Math.abs(arr[i] - arr[j]);
                    firstHorseInd = i;
                    secondHorseInd = j;
                }
            }
        }
        System.out.println(arr[firstHorseInd] + ", " + arr[secondHorseInd]);

    }
}
