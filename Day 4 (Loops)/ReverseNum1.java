//Print reverse of a number

import java.util.*;

public class ReverseNum1 {
    public static void main(String args[]){
        System.out.print("Enter your number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n>0){
            int rem = n%10;
            System.out.print(rem);
            n = n/10;
        }
    }
}
