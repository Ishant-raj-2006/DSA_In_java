// WAP for change the value of array at the index number 0 by using pass by shallow copy
public class Q11 {
    public static void main(String[] args) {
        int[] arr ={10,20,30,40,50};
        int[]  x =arr; // This is shallow copy 
        x[0] = 12045; // Change valuse 
        System.out.println(x[0]);
    }
}
