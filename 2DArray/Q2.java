//  WAP for Print How many rows and how many columns? 



public class Q2 {
    public static void main(String[] args) {
       int[][] arr = {{1,2,3,4}, {5,6,7,8,9} , {1,2,3,4}};
       int row = arr.length;
       int colum = arr[0].length;
        for(int i=0; i<row; i++){
            for(int j=0; j<colum; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The number of rows are = "+row +" And number of columns are = "+colum);
    }
}
