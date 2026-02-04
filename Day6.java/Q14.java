// WAP for Muntiply odd indexed elements by 2 and add 10 to even indexed elements
public class Q14 {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,80,0};
        print(arr);
        for(int i=0; i<arr.length; i++){
            if(i%2!=0){
                arr[i] *=2;
            }
            else{
                arr[i] +=10;
            }
        }
        print(arr);

    }
    public static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}