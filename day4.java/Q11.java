// WAP for print capital Alphabet trangle 
// A 
// A B 
// A B C 
// A B C D 
// A B C D E 
// A B C D E F 
// A B C D E F G 
// A B C D E F G H 
// A B C D E F G H I 
// A B C D E F G H I J 
// A B C D E F G H I J K 
// A B C D E F G H I J K L 
// A B C D E F G H I J K L M 
// A B C D E F G H I J K L M N 
// A B C D E F G H I J K L M N O 
// A B C D E F G H I J K L M N O P 
// A B C D E F G H I J K L M N O P Q 
// A B C D E F G H I J K L M N O P Q R 
// A B C D E F G H I J K L M N O P Q R S 
// A B C D E F G H I J K L M N O P Q R S T 
// A B C D E F G H I J K L M N O P Q R S T U 
// A B C D E F G H I J K L M N O P Q R S T U V 
// A B C D E F G H I J K L M N O P Q R S T U V W 
// A B C D E F G H I J K L M N O P Q R S T U V W X 
// A B C D E F G H I J K L M N O P Q R S T U V W X Y 
// A B C D E F G H I J K L M N O P Q R S T U V W X Y Z


import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int num;
        System.out.print("Enter Number = ");
        num = sb.nextInt();
        for(int i=65; i<65+(num); i++){
            for(int j= 65; j<=i; j++){
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
    }    
}