
import java.util.*;
public class PrimeNumber {
    public static void main(String args[]){
        int count = 0;
        System.out.print("Enter your number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=2;i<n;i++){
            if(n%i==0){
                count++;
                break;
            }
        }

        if(count==0){
            System.out.print(n+ " is a prime number.");
        }
        else{
            System.out.print(n + " is a composite number.");
        }
    }
}
