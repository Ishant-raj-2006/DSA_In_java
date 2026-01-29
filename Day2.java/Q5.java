// WAP for if cost price and selling price of an item is input through the keybord , WAP to determine whether the seller has made profit or incurred loss or no profit no loss. Also determine how much profit he made or loss the incurred.

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);

        System.out.print("Enter your cost price = ");
        double cp = sb.nextDouble();

        System.out.print("Enter your Selling price = ");
        double sp = sb.nextDouble();

        if(sp>cp){
            System.out.print("Profit = "+(sp-cp));
        }
        else if (sp == cp) {
            System.out.println("NO profit or No loss");
        }
        else {
            System.out.println("Loss "+(cp-sp));
        }
    }
}
