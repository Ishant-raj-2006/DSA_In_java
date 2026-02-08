// Segregate 0s and 1s. 1st methode
public class Q24 {
    public static void main(String[] args) {
       int[]  arr={0,0,1,1,0,1,0,1,1,0,1};
       int n= arr.length;
       int i=0, j=n-1;
        while (i<j) {
            if(arr[i]==0) {
                i++;
            }
            else if(arr[j]==1){
                j--;
            } 
            else{
                arr[i] = 0 ;
                arr[j] = 1;
                i++;
                j--; 
            }
        }
        for(int k =0; k<n; k++){
            System.out.print(arr[k]+" ");
        }
    }
}
