import java.util.Scanner;

public class SumOfNnumbers {
    public static void main(String args[]){
        int sum = 0;
        System.out.print("Enter your number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        while(i<=n){
            sum = sum + i;
            i++;
        }

        System.out.print("Sum is : " + sum);
    }
}
