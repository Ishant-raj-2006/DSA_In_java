// WAP for Two sum , 

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        int arr[] ={10,2,25,1,5,4,564,56,4,56,44,634,23,1,24,};
        Scanner sb = new Scanner(System.in);
        int tar;
        boolean found = false;
        System.out.print("Enter Your Target = ");
        tar = sb.nextInt();
        for(int i=0; i<arr.length; i++){
            for(int j= i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==tar){
                    System.out.println("Yes Target found");
                    found = true;
                    break;
                }
            }
        }
        if(found==false){
             System.out.println("No target not found");
             
        }
        
    }
}