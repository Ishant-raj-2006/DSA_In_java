// WAP for print this series - 99,95,91,87,...upto all terms which are positive 
public class Q9 {
    public static void main(String[] args) {
        int a= 99,d=3;
        for(int i= a; i>=0; i-=d){
            System.out.print(i+" ");
        }
    }
}
