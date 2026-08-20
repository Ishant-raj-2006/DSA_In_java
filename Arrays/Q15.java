
import java.util.Arrays;

// WAP for sort array. by using function
public class Q15 {
    public static void main(String[] args) {
        int[] arr={12,32,76,34523,21421,213,21345,46-546,3246,-436};
        print(arr); 
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
