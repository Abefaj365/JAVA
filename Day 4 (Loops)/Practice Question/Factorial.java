
import java.util.*;
public class Factorial {
    public static void main(String args[]){
        System.out.println("Enter your number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int fact = 1;

        for (int i=1;i<=num;i++){
            fact=fact*i;
        }

        System.out.print("The factorial of "+num+ " is : "+fact);
    }
}
