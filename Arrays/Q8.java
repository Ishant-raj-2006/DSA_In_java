// WAP for print manimun element of array
public class Q8 {
    public static void main(String[] args) {

        int[] arr = {10, 23, 32, -32, -23, -325, 21, 325, -214, 12, -1234};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum = " + max);
    }
}

