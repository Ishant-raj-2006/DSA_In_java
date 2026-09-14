// WAP for Slection sort
// WAP for Selection Sort

public class Q3 {

    public static void main(String[] args) {

        int[] arr = {5, 3, 2, 123, 435, 768, 45, 3244, 36, 34523, 17, 8976};

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            // Find minimum element
            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        // Print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}