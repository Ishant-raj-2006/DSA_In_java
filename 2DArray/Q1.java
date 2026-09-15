//  WAP for Print a null matrix whose rows are 3 and columns are 4. 



public class Q1 {
    public static void main(String[] args) {
       int[][] arr = new int[3][4]; // {{1,2,3,4}, {5,6,7,8,9} , {1,2,3,4}, {5,6,7,8,9}}
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
