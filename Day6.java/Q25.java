// WAP for Given an sorted array arr[] of integers. Sort the array into a wave-like array(In Place). In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5] ..... and so on. If there are multiple solutions, find the lexicographically smallest one.

// Note: The given array is sorted in ascending order, and modify the given array in-place without returning a new array.


public class Q25 {
   public static void main(String[] args) {
    int[] arr={2, 4, 7, 8, 9, 10};
    // Expected output
    // 4, 2, 8, 7, 10, 9
    int n = arr.length;
    int temp;
    for(int i=0; i<n; i+=2){
        if(i==n-1) break;
        temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp ;
    }
    for(int ele :arr){
        System.out.print(ele+" ");
    }
   } 
}

// 05:02