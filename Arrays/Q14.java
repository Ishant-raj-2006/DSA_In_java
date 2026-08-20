
import java.util.Arrays;

public class Q14 {
    public static void main(String[] args) {
        int a = 4;// 4 bytes leta hai ye 
        int[] arr = {10,20,30,40}; // 16 Bytes leta h 
        int [] deep = Arrays.copyOf(arr, arr.length);
        deep[0] = 100;
        System.out.println(arr[0]);
    }
}
