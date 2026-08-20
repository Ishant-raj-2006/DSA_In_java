// WAP for find any target in array 

import java.util.Scanner;
public class Q20 {
   public static void main(String[] args) {
    int[] arr ={10,22,948,-8497,947,-9484,98469};
    Scanner sb = new Scanner(System.in);
    System.out.print("Enter Your Target = ");
    int tar = sb.nextInt();
    boolean flag = false;
    for(int i=0; i<arr.length; i++){
        if(arr[i] == tar){
            System.out.println("Target found and its index number is "+i);
            flag = true;
            break;
        }
        
    }
    if(flag==false){
        System.out.println("Target Not Found");
    }
   } 
}
