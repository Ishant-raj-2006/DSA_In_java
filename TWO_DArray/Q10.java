// WAP for Rotate matrix by 90 degree.

public class Q10 {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3},{4,5,6},{7,8,9}};
        int row = arr.length , col = arr[0].length;
        print(arr);
        System.out.println("____________________________________________________");

        // transpose of matrix 
        for(int i=0; i<row; i++){
            for(int j=i; j<col; j++){
                int temp=arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i] = temp;
            }
        }
        print(arr);

        // Reversh Each Row
        for(int i=0; i<arr[0].length; i++){
        int stCol =0 , endCol=arr[0].length-1;
            while(stCol<endCol){
                int temp = arr[i][stCol];
                arr[i][stCol] = arr[i][endCol];
                arr[i][endCol] = temp;
                stCol++;
                endCol--; 
            }
        }
        System.out.println("-------------------------------");
        print(arr);

    }
    private  static void print(int[][] arr){
        for(int[] a : arr){
            for(int ele : a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}


