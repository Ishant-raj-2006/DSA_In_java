// WAP for Output & Input of Array using Loop 


import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int size = sb.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <size; i++) {
          System.out.print("Enter the element number of "+(i+1) +" ="); 
          int num = sb.nextInt(); 
          arr[i] = num;
        }
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
