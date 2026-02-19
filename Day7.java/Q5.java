public class Q5 {
    public static void main(String[] args) {
        int[] arr ={5,-2,10,8,0,-1,-454,24,46,54,63,1222,6454,21};
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            int min = Integer.MAX_VALUE;
            int mindx = -1;

            for(int j=i; j<n; j++){  
                if(arr[j] < min){
                    min = arr[j];
                    mindx = j;
                }
            }

            // Swap
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }

        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
