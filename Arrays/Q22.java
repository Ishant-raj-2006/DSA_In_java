// WAP for find the Second Maxium number in array.

public class Q22 {
    public static void main(String[] args) {
       int[] arr = {10,20,78365,3535,86,32987,3456789};
       int max = arr[0];
       int smax=0;
       for(int i=0; i<arr.length; i++){
        if(max<arr[i]){
            max = arr[i];
        }
       } 
       for(int i=0; i<arr.length; i++){
        if(smax<arr[i] && arr[i]!= max){
            smax=arr[i];
        }
       }
       System.out.println(max);
       System.out.println(smax);
    }
}


// public class Q22 {

//     public static void main(String[] args) {

//         int[] arr = {10, 20, 78365, 3535, 86, 32987, 3456789};

//         int max = arr[0];
//         int smax = Integer.MIN_VALUE;

//         // Find Maximum
//         for (int i = 0; i < arr.length; i++) {
//             if (max < arr[i]) {
//                 max = arr[i];
//             }
//         }

//         // Find Second Maximum
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > smax && arr[i] != max) {
//                 smax = arr[i];
//             }
//         }

//         System.out.println("Maximum = " + max);
//         System.out.println("Second Maximum = " + smax);
//     }
// }