
import java.util.Scanner;

// Write a programme for Binary search 
public class Q2 {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,4,5,5,5,6,7,8,11};
        int tar;
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Your target = ");
        tar= sb.nextInt();
        int lo=0,hi= arr.length , idx =-1;
        int mid =(lo+hi)/2;
            if(arr[mid]>tar) hi = mid - 1;
            if(arr[mid]<tar) lo = mid +1;
            else{
                idx = mid;
                hi = mid -1;
            }
            
    }
}


/*
Algo --> if(mid <tar) go right
        if(mid >tar) go left
        if(mid==tar) mark & go left
*/