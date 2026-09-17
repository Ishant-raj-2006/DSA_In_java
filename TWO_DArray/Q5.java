// WAP for find the row with maximum sum

public class Q5{
    public static void main(String[] args) {
        int[][] arr = {{2,8,3, 4, 7 }, {7, 2, 1, 6, 3 },{5, 5, 4, 1, 4 },{3, 100, 2, 6 ,8}};
        int max = Integer.MIN_VALUE; 
        int n = arr.length;
        int row =-1;
        for(int i=0; i<n; i++){
            
            int sum = 0; 
            for(int j=0; j<arr[0].length; j++){
                sum += arr[i][j];
           
            }
            if(sum > max){
                max= sum;
                row =i;
            }
        
        }
        System.out.println(row+" "+max);
    }
}