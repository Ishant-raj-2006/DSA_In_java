// WAP for short array in ascending order . by using Arrays.sort();

import java.util.Arrays;

public class Q13 {
    public static void main(String[] args) {
        int[] arr = {10,20,90,-10};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
