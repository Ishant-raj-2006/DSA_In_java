// WAP for Two Sum.

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        int[] arr = {10,23,-32,20,2};
        Scanner sb = new Scanner(System.in);
        int tar;
        System.out.print("Enter Your target = ");
        tar = sb.nextInt();
        boolean flag = false;
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length; j++){
            if(arr[i]+arr[j] == tar){
                System.out.print("target found  targets are "+arr[i]+" " + arr[j] + " at index numbers are "+i+" "+j);
                flag = true;
                break;
            }  
            }
        }
        if(flag == false){
            System.out.println("Target not found ");
        }
    }
}
