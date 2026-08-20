// WAP for find the minimum element in array.

public class Q18 {
    public static void main(String[] args) {
      int[] arr ={10,32,-32323,234,324,1231,324,-333433,233};
      int min = arr[0];
      for (int i = 0; i < arr.length; i++) {
          for(int j=i+1; j<arr.length; j++){
            if(min > arr[j]){
            min = arr[j];
            }
          }
      }
      System.out.println(min);
    }
}
