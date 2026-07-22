// WAP for check composite numbers or not 


import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
   Scanner sb = new Scanner(System.in);
int num ,count=0;
System.out.print("Enter number = ");
num = sb.nextInt();
for(int i=2; i<=num-1; i++){
    if(num%i==0){
        count++;
    }
}
if(count>1){
    System.out.print("composite numbers");
}
else{
    System.out.print("Not composite numbers");
}
    }
}
