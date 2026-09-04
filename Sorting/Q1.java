// WAP for Bubble sort

public class Q1 {

    
public static void main(String[] args) {
    int arr[] = {1,3,657,42,6543,3256,4435,4356,214,76546,546};
    int n = arr.length;
    for(int i=0; i<n-1; i++){
        for(int j=0; j<n-1-i; j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    for(int i=0; i<n; i++){
        System.out.print(arr[i]+" ");
    }
}
}