
import java.util.*;
public class LeapYear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your year : ");
        int a = sc.nextInt();

        if(((a%4==0) && (a%100!=0)) || (a%400==0)){
            System.out.println("This is a leap Year.");
        }
        else{
            System.out.println("It's not a leap year.");
        }
    }
}
