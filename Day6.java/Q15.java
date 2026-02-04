// WAP for search in array.

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        int[] arr={10,3,8,245,2,-10,497,6,487,9887,98,74,897,98,9,74,974,65};
        Scanner sb = new Scanner(System.in);
        int num,count =0;
        System.out.print("Enter Number for search = ");
        num = sb.nextInt();
        for(int i=0; i<arr.length; i++){
            if(arr[i]==num){
               count =1;
                break;
            }
            else{
                count =0;
            }
        }
        if(count==1){
            System.out.println("Yes present ");
        }
        else{
            System.out.println("Not present ");
        }
    }
}
