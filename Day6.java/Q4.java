// WAP for find sum of all element in the array.
public class Q4 {
    public static void main(String[] args) {
        int[] arr={10,5,7,10,20,30};
        int sum = 0,n=arr.length;
        for(int i=0; i<n; i++){
            sum +=arr[i]; 
        }
        System.out.print("The sum  of all element of array = "+sum);
    }
}
