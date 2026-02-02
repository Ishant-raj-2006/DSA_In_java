//WAP for given an array , print negative elements only .
public class Q3 {
    public static void main(String[] args) {
        int[] arr={10,22,50,80,-1,20,-32};
        int n = arr.length;
        for(int i=0; i<=n; i++){
            if(arr[i]<0){
                System.out.println(arr[i]);
            }
        }
    }
}
