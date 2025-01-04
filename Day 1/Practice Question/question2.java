// In a program, input the side of a square. You have to output the area of the
//  square.
//  (Hint : area of a square is (side x side))
import java.util.*;
public class question2 {
    public static void main(String args[]){
        System.out.println("Enter the side of the square : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int area = a*a;
        System.out.println(area);
    }
}
