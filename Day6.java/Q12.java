// WAP for make a deep copy of array.

import java.util.Arrays;

public class Q12 {
    public static void main(String[] args) {
        int a = 4; // 4 bytes late hai ye
        int[] arr = {10,20,30,40};// 16 byte
        int[] y = Arrays.copyOf(arr, arr.length);
        y[0] = 100;
        System.out.println(y[0]);
        System.out.println(arr[0]);
    }    
}
 