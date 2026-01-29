// WAP for print all odd numbers divisible by 3 from 1 to 100
public class Q6 {
    public static void main(String[] args) {
        int odd=0;
        for (int i=1; i<=100; i++){
            if(i%2!=0 && i%3==0){
                System.out.print(i+" ");
                odd++;
            }
        }
        System.out.println("\nThe total number is divisible by 2 and 3 is =  "+odd);
    }
}
