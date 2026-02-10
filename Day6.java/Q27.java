// Merge 2 sorted arrays into a single big array

public class Q27 {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6,13};
        int[] arr2 = {7,8,9,10,11,12,13};

        int[] arr3 = new int[arr1.length + arr2.length];

        merge(arr1, arr2, arr3);

        for (int ele : arr3) {
            System.out.print(ele + " ");
        }
    }

    public static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;

        // Compare both arrays
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        // Remaining elements of a
        while (i < a.length) {
            c[k++] = a[i++];
        }

        // Remaining elements of b
        while (j < b.length) {
            c[k++] = b[j++];
        }
    }
}
