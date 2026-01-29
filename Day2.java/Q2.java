// WAP for chek it is divisible by 5 or not

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
      Scanner sb = new Scanner(System.in);
      System.out.print("Enter Number = ");
      int num = sb.nextInt();
      if(num%5==0){
        System.out.println("YES it is divisible by 5 ");
      }  
      else{
        System.out.println("NO it is not divisible by 5");
      }
    }
}
