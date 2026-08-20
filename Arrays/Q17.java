// WAP for print product of all element of array 

public class Q17 {
    public static void main(String[] args) {
        int[] arr = {10,20,0,29,3726,834};
        int mul=1;
        for(int i=0; i<arr.length; i++){
            mul *=arr[i];

        }
        System.out.println(mul);
    }
}
