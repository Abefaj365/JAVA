//Break statements means to exit the loop;

//Example : Keep entering numbers till user enters a multiple of 10
import java.util.*;
public class BreakExample {
    public static void main(String args[]){
        while(true){
            System.out.print("Enter your number : ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if(num%10==0){
                break;
            }
            System.out.println("Your entered number is : "+num);
        }
        System.out.println("You are out of loop now");
    }
}
