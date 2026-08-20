// WAP for find the max element in array.

public class Q19 {
    public static void main(String[] args) {
      int[] arr ={10,32,-32323,234,324,1231,324,-333433,23238943};
      int max = arr[0];
      for (int i = 0; i < arr.length; i++) {
          for(int j=i+1; j<arr.length; j++){
            if(max < arr[j]){
            max = arr[j];
            }
          }
      }
      System.out.println(max);
    }
}
