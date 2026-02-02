// WAP for prin product of element of the array.
public class Q5 {
    public static void main(String[] args) {
        int pro =  1;
        int[] arr={10,2,20,30,4,5,1};
        int n= arr.length;
        for (int i=0; i<n; i++){
            pro *=arr[i];
        }
        System.out.print("The Product of all array is = "+pro);
    }
}