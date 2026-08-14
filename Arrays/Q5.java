// WAP for print all negative number of arrays.

public class Q5 {
   public static void main(String[] args) {
    int[] arr={10,23,32,-32,-23,-325,21,325,-214,12,-1234};
    for(int i=0; i<arr.length; i++){
        if(arr[i]<0){
            System.out.print(arr[i] +" ");
        }
    }
   } 
}
