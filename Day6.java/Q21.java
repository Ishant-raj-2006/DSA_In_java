// WAP for print revesh array.
public class Q21 {
    public static void main(String[] args) {
        int[] arr={12,2,45,45,5478,415,47,89,79,79,87};
        int n = arr.length,i=0,j=arr.length-1,temp=0;
        while (i<j) {
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
