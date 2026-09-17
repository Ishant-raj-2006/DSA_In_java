// Print elements of a 2D array column-wise. 


public class Q6 {
    public static void main(String[] args) {
        int[][] arr = {{2, 8, 3, 4, 7 }, {7, 2, 1, 6, 3 }, {5, 5, 4, 1, 4 },{3, 1, 8, 2, 6 }};
        for(int i=0; i<arr[0].length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}

// out put
/*
2 7 5 3 
8 2 5 1 
3 1 4 8 
4 6 1 2 
7 3 4 6 
 */
