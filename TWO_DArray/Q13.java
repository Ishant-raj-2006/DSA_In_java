// WAP for Print Spirally Tranversing a Matrix

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Q13{
    public static void main(String[] args) {
        public ArrayList<Integer> SpirallyTree(int[][] arr){
            ArrayList<Integer> ans = new ArrayList<>();
            int m = arr.length,n = arr[0].length;
            int firstRow = 0, lastRow =m-1,firstCol =0,lastcol = n-1;
            while(firstRow <=lastRow && firstCol<=lastcol){
                // Right
                for(int j=firstCol; j<=lastcol; j++){
                    ans.add(arr[firstRow][j]);
                }
                firstRow++;
                if(firstRow<=lastRow || firstRow<=lastcol) break; 

                // Down
                for(int j=firstRow; j<=lastRow; j++){
                    ans.add(arr[j][lastcol]);
                }
                lastcol--;
                if(firstRow<=lastRow || firstRow<=lastcol) break; 
                // left
                for(int j=lastcol; j>=firstCol; j--){
                    ans.add(arr[lastRow][j]);
                }
                lastRow--;
                if(firstRow<=lastRow || firstRow<=lastcol) break; 
                // UP
                for(int j=lastRow; j>=firstRow; j--){
                    ans.add(arr[j][firstCol]);
                }
                firstCol++;
            }
            return ans;

        }
    }
}