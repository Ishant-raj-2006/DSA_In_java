// public package Arrays;
// WAP for change the array element on index number 0 by using shallow copy of array.


class Q13 {

    public static void main(String[] args) {
      int[] arr = {10,20,30,40};
        int[] x =arr;
        x[0] =100;
        System.out.println(arr[0]);
    }
}