// WAP for Take interger input and tell if its magnitude is smaller than 69 or not.

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enetr number =");
        int num = sb.nextInt();
        int n;
        if(num<0){
            n = num*(-1);
            if (n<69){
                System.out.println("Yes it is magnitude is 69 = "+num);
            }
            else{
                System.out.println("No it is not magnitude of 69 = "+num);
            }
        }
        else if(num<69){
            System.out.println("Yes it is magnitude is 69 = "+num);
        }
        else{
            System.out.println("It is not magnitude is 69 "+num);
        }
    }
}
