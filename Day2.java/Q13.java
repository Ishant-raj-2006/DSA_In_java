// WAP for take 3 positve integer input and  find the greatest of them
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter 1st number = ");
        int num1 = sb.nextInt();
        System.out.print("Enter 2nd number = ");
        int num2 = sb.nextInt();
        System.out.print("Enter 3rd number = ");
        int num3 = sb.nextInt();
    if(num1>num2 && num1 > num3){
       System.out.println("1st Number is greatest = "+num1);

    }
    else if(num2 >num1 && num2 > num3){
        System.out.println("2nd Number is greatest = "+num2);
    }
    else if(num3>num1 && num3>num2){
        System.out.println("3rd Number is greatest = "+num3);
    }
    }
}
