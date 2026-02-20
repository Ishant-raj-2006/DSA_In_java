public class Q6 {
    public static void main(String[] args) {
        int[] arr ={5,-2,10,8,0,-1,-454,24,46,54,63,1222,6454,21};
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            int maxIndex = i;

            for(int j = i + 1; j < n; j++){
                if(arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }
            }

            // Swap
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}