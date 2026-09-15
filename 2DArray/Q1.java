//  WAP for Print a null matrix whose rows are 3 and columns are 4. 



public class Q1 {
    public static void main(String[] args) {
       int[][] arr = new int[3][4];
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
