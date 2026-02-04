// WAP for find the minimum element of a given array 
public class Q17 {
    public static void main(String[] args) {
        int[] arr={10,20,50,80,-10,-3,0,65,56,65,78,235,-2};
        int min = 0;
        for(int i=0; i<arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
