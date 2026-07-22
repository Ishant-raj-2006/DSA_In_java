
import java.util.Scanner;

// WAP for check prime number or not.

public class Q5{
    public static void main(String args[]){
    Scanner sb = new Scanner(System.in);
        int num ;
        System.out.print("Enter Number = ");
        int count = 0;
        num = sb.nextInt();
        for (int i=2; i<=num-1; i++){
            if(num%i==0){
                  count++;
                break;   
            }
          
        }
        if(num > 1 && count == 0){
            System.out.print("Prime numbar ");
        }
        else{
            System.out.println("Not Prime Number ");
        }
    }
}