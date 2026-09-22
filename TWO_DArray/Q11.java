
import java.util.ArrayList;



class Q11 {
public static void main(String[] args) {
    ArrayList<Integer> a = new ArrayList<>();
    a.add(10); a.add(12); a.add(87);
    ArrayList<Integer> b = new ArrayList<>();
    b.add(10); b.add(12); b.add(87);
    ArrayList<Integer> c = new ArrayList<>();
    c.add(10); c.add(12); c.add(87);
   ArrayList<ArrayList <Integer>> arr = new ArrayList<>();
   arr.add(a); arr.add(b); arr.add(c);
   System.out.print(arr);

   
// for(int i=0; i<arr.size(); i++){
//     for(int j=0; j<arr.get(i).size(); j++){
//     System.out.print(arr.get(i).get(j)+" ");
//     }
//     System.out.print();
// }

}
    
}