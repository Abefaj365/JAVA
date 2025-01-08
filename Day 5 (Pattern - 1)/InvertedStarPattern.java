
import java.util.*;
public class InvertedStarPattern {
    public static void main(String args[]){
        System.out.print("Enter your number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
