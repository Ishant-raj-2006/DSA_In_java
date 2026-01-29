// Program to print even and odd numbers from 1 to 100
// and count total even and odd numbers
public class Q4 {
    public static void main(String[] args) {

        int even = 0, odd = 0;

        System.out.println("Even Numbers:");
        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
                even++;
            }
        }

        System.out.println("\n\nOdd Numbers:");
        for(int i = 1; i <= 100; i++) {
            if(i % 2 != 0) {
                System.out.print(i + " ");
                odd++;
            }
        }

        System.out.println("\n\nTotal Even Numbers = " + even);
        System.out.println("Total Odd Numbers  = " + odd);
    }
}