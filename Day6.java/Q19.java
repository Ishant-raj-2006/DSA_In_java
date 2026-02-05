// WAP for print the Second Maximum element in the array .

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
          int[] arr={40,5,7,87,897,97,46,44,5,7,42,54};
          int max = Integer.MIN_VALUE;
          int smax = Integer.MIN_VALUE;
          // Caclulate max  .
          for(int i=0; i<arr.length; i++){
            if(arr[i]>max) max = arr[i];
          }

          // Calculate second  max
          for(int i=0; i<arr.length; i++){
            if(arr[i]>smax && arr[i]!=max) smax = arr[i];
          }
          System.out.println("First MAx number is = "+max);
          System.out.println("Secod max Number is = "+smax);
    }
}

//// 3:03