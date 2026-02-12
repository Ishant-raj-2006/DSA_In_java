//Given an array of size n+1 consisting of integers from 1 to n. one of the element is duplicqate in the array. Find that duplicate element.

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int n;
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter the size of  array =");
        n = sb.nextInt();
        n = n+1;
        int[] arr = new int[n];
        for(int  i=0; i<n; i++){
            System.out.print("Enter the element of index number  "+(i+1)+" = ");
            arr[i] =sb.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.print("Found dublicate element = "+arr[i]);
                }
            }
        }
    }
}