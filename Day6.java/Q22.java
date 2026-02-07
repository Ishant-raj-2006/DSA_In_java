// WAP for Rotate arry.
public class Q22 {
    public static void main(String[] args) {
        int[] arr={54,964,649,89,778,7,87,8,75,4,5,74,57};
        int n = arr.length,d=5;
        rev(arr,0,d-1);
        rev(arr,d,n-1);
        rev(arr,0,n-1);
    }
    public static void rev(int[] arr,int i,int j) {
        while (i<j) {
            int temp;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--; 
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
