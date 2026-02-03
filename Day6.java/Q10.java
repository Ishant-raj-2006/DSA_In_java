// WAP for change the value of array at the index number 2 by using pass by refrence.
public class Q10 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,100};
        System.out.println(arr[2]);
        change(arr);
        System.out.print(arr[2]);
    }
    public static void change(int[] y){
        y[2] =99;
    }
}
