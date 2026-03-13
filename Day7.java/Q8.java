
// import java.lang.reflect.Array;
// import java.util.ArrayList;

// // Give two integer arr A and B return the list of element common of common to both the list and return the list in sorted order
// public class Q8 {
//     public static void main(String[] args) {

//         int[] arr1 ={1,2,4,4,3,2243,43224,2142,34457867,8768687,5876,867,8};
//         int[] arr2 ={909,0,80,80,8,8,9,80,8,88,9,80,80,7,86,7,8,4,3};

//         for(int i=0; i<arr1.length; i++){

//             for(int j=0; j<arr2.length; j++){

//                 if(arr1[i] == arr2[j]){

//                     // Check duplicate print na ho
//                     boolean alreadyPrinted = false;

//                     for(int k=0; k<i; k++){
//                         if(arr1[k] == arr1[i]){
//                             alreadyPrinted = true;
//                             break;
//                         }
//                     }

//                     if(!alreadyPrinted){
//                         System.out.print(arr1[i] + " ");
//                     }

//                     break;  // ek baar mil gaya toh next i
//                 }
//             }
//         }
//     }
// }

import java.util.ArrayList;
import java.util.Arrays;

public class Q8 {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] arr1 = {1, 2, 4, 4, 3, 2243, 43224, 2142, 34457867, 8768687, 5876, 867, 8};
        int[] arr2 = {909, 0, 80, 80, 8, 8, 9, 80, 8, 88, 9, 80, 80, 7, 86, 7, 8, 4, 3};
        int i = 0, j = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                ans.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        System.out.println(ans);
    }
}