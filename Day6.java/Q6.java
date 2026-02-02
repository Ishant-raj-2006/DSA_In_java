// WAP for print the maximum element in the array.
public class Q6 {
    public static void main(String[] args) {
        int max=0;
        int[] arr={10,20,30,40,25,88};
        int n =arr.length;
        for(int i=0; i<n; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("The bigest number in the  array is = "+max);
    }
}
