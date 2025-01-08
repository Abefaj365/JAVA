
import java.util.*;
public class MultiplicationTable {
    public static void main(String args[]){
        System.out.print("Enter your number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("The multiplication of "+num+" is:");

        for(int i=1;i<=10;i++){
            System.out.println(num+ " * "+i+ " = "+ 3*i );
        }
    }
}
