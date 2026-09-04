// WAp for print the reverse of Array.

public class Q24 {
    public static void main(String[] args) {
        int[] arr={32,45,74,353,23124,6576};
       int i=0, j=arr.length-1;
       int temp;
       while(i<j){
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
       } 
       for(int ele : arr){
        System.out.print(ele +" ");
       }
    }
}