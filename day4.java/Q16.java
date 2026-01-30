// WAP for print Alphabetical ulta trangle 
// a b c d e 
// a b c d 
// a b c 
// a b 
// a 



import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int num;
        System.out.print("Enter Number = ");
        num = sb.nextInt();
        for(int i=97; i<num+97; i++){
            for(int j=0; j<num-i+97; j++){
                System.out.print((char)(j+97)+" ");
            }
            System.out.println();
        }
    }
}
