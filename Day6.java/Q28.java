// WAP for marge two short aaray .
import java.util.Arrays;
public class Q28 {
    public static void main(String[] args) {
        int[] arr1 = {10,20,30,40,50};
        int[] arr2 ={1,2,3,8,9,10,15,154,14654,1354,564,64};
        int[] arr3 = new int[arr1.length+arr2.length];
        for(int i=0; i<arr1.length; i++){
            arr3[i] = arr1[i];
        }
        for(int j=0; j<arr2.length; j++){
            arr3[j+arr1.length]  = arr2[j];
        }
        Arrays.sort(arr3);
        for(int ele :  arr3){
            System.out.print(ele+" ");
        }
    }
}
