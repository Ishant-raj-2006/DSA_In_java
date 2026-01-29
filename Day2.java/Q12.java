// Given a point (X,Y), write a program to find out if lies in the 1st Quadrant , 2nd Quadrant , 3rd Quadrant , 4th Quadrant , on the X-axis,Y-axis or at the origin.

import java.util.Scanner;

public class Q12 {
public static void main(String[] args) {
    Scanner sb = new Scanner(System.in);
    System.out.print("Enter the value of x-axis = ");
    int x = sb.nextInt();
    System.out.print("Enter the value of Y-axis = ");
    int y = sb.nextInt();
    if(x>0 && y>0){
        System.out.println("1st Qudrant ");
    }
    else if(x>0 && y<0){
        System.out.println("2nd Qudrant");
    }
    else if(x<0 && y<0){
        System.out.println("3rd Qudrant");
    }
    else if(x<0 && y>0){
        System.out.println("4th Qudrant");
    }
}
}