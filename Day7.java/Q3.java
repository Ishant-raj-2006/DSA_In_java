//WAP for sort an array in desending order by using Bubble sort.
public class Q3 {
    public static void main(String[] args) {
        int[] arr={10,20,-520,5,456,656,26,56,56,56,0,1,2,3,4,487};
        int n= arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}

