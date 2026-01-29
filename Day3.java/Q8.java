// WAP for display this AP - 2,5,8,11,...upto 'n' terms

import java.util.Scanner;

public class Q8 {
   public static void main(String[] args) {
    int a=2,d=3,n;
    Scanner sb = new Scanner(System.in);
    System.out.print("Enter Number = ");
    n = sb.nextInt();
    for(int i=a; i<=a+(n-1)*d; i+=3){
      System.out.print(i+" ");
    }
   } 
}
