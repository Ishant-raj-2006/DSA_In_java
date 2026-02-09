// WAP for print the value of index number 2 , in ArrayList.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Q26 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(20);
        arr.add(21);
        arr.add(22);
        arr.add(23);
        arr.add(24);
        System.out.println(arr.get(2)); // aar[2]
        arr.set(2,55 ); // arr[3] =55
        System.out.println(arr.get(2)); 
        int n = arr.size(); // arr.length;
        for(int i =0; i<n; i++){
            System.out.print(arr.get(i)+" ");
        }
       System.out.println();
        // Now i insert 100 after 20 and before 21
        System.out.println("Now i insert 100 after 20 and before 21");
        arr.add(1,100);
        for(int i =0; i<n; i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();           
        // now I Insert 88 in array without any given index number .
        arr.add(88);
        System.out.println("Add any number without given index value");
        for(int i =0; i<arr.size(); i++){ // 'n' ka value update nhi huaa h iss liye arr ka current size diya h maine . 
            System.out.print(arr.get(i)+" ");
        }
        // array reversh by Swaping
        System.out.print("array reversh by Swaping "); 
        int i=0 , j=arr.size()-1;
        while (i<j) {
            int temp = arr.get(i);
            arr.set(i, arr.get(i));
            arr.set(j,temp);
        }
        System.out.print(arr+" ");
        // Array ko reversh 
        System.out.println();
        System.out.println("This is reversh of aaray");
        Collections.reverse(arr);
        System.out.print(arr+" ");
    }
}
// 05:58:30