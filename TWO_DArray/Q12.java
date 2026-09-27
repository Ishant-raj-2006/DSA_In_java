// WAP for Pascal's Triangle
    import java.util.ArrayList;
import java.util.Scanner;

public class Q12{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(triangle.get(i - 1).get(j - 1)
                            + triangle.get(i - 1).get(j));
                }
            }

            triangle.add(row);
        }

        // Print Pascal's Triangle
        for (ArrayList<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}
    