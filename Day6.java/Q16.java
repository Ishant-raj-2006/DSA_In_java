// WAP for print product of array 
public class Q16 {
    public static void main(String[] args) {
        int[] arr={1,52,3,6,63,6,36,1,45,574};
        int product = 1; 
        for(int i=1; i<arr.length; i++){
            product *=arr[i];
        }
        System.out.println("The product of all element of array = "+product);
    }
}
