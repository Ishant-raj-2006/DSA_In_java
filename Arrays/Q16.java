// WAP for Muntiply odd indexed elemdent by 2 and add 10 to even indexed element,

public class Q16 {
    public static void main(String[] args) {
        int[] arr={12,32,76,34523,21421,213,21345,46-546,3246,-436};
        for(int i=0; i<arr.length; i++){
            if(i%2==0){
                System.out.print(arr[i]+10 +" ");
            }
            else{
                System.out.print(arr[i]*2+" ");
            }
        }
    }
}
