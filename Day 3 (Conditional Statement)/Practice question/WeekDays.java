
import java.util.*;
public class WeekDays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int a = sc.nextInt();
        if(a>=1 && a<=7){
            switch(a){
                case 1:
                System.out.println("Saturday");
                break;

                case 2:
                System.out.println("Sunday");
                break;

                case 3:
                System.out.println("Monday");
                break;

                case 4:
                System.out.println("Tuesday");
                break;

                case 5:
                System.out.println("Wednesday");
                break;

                case 6:
                System.out.println("Thursday");
                break;

                case 7:
                System.out.println("Friday");
                break;
            }
        }

        else{
            System.out.println("Wrong number");
        }
    }
}
