// Segregate 0s and 1s. 1st methode
public class Q23 {
    public static void main(String[] args) {
       int[]  arr={0,0,1,1,0,1,0,1,1,0,1};
       int n = arr.length;
       int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                count ++;
            }
        }
        print0(count);
        print1(n-count);
        
    }
    public static void print0(int n) {
        for(int i=0; i<n; i++){
            System.out.print("0"+" ");
        }
    }
    public static void print1(int n) {
        for(int i=0; i<n; i++){
            System.out.print("1"+" ");
        }
    }

}
