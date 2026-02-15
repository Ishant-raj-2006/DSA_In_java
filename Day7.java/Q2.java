// WAP Bubble sort.
public class Q2 {
    public static void main(String[] args) {
        int[] arr={8,2,0,1,4,-2,584,54,-454,0};
        int n= arr.length;
        for(int i=0; i<n-1;i++ ){
            for(int j=0; j<n-1-i; j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] =temp;
            }
            }
        }
    for(int ele : arr){
        System.out.print(ele+" ");
    }
        
    }
}
