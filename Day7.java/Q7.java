// // WAP for 2 SUM - Find a pair with given sum

// import java.util.Arrays;
// import java.util.Scanner;

// public class Q7 {
//     public static void main(String[] args) {
//         int[] arr={2154,468,4,45,646,546,46,4,64,6,464,97,9,46,4,5,1,0,2,3,48,7};
//         Arrays.sort(arr);
//         boolean bol = true;
//         Scanner sb = new Scanner(System.in);
//         int target ;
//         System.out.print("Please Enter your Target = ");
//         target = sb.nextInt();
//         int i=0, j=arr.length-1;
//         while (i<j) {
//             if(arr[i]+arr[j]==target) return true;
//             else if(arr[i]+arr[j]>target) j--;
//             else if(arr[i]+arr[j]<target) i++;
//         }
//         return bol=false;
//     }
// }



import java.util.Arrays;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        int[] arr={2154,468,4,45,646,546,46,4,64,6,464,97,9,46,4,5,1,0,2,3,48,7};
        Arrays.sort(arr);

        Scanner sb = new Scanner(System.in);
        System.out.print("Please Enter your Target = ");
        int target = sb.nextInt();

        int i = 0, j = arr.length - 1;
        boolean found = false;

        while (i < j) {
            int sum = arr[i] + arr[j];

            if (sum == target) {
                System.out.println("Pair Found: " + arr[i] + " + " + arr[j] + " = " + target);
                found = true;
                break;
            }
            else if (sum > target) {
                j--;
            }
            else {
                i++;
            }
        }

        if (!found) {
            System.out.println("No Pair Found");
        }

        sb.close();
    }
}

// 02:00