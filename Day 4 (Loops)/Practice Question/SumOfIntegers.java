//Write a program that reads a set of integers, and then prints the sum of the even and odd integers

import java.util.*;
public class SumOfIntegers {
    public static void main(String args[]){
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        while(num>0){
            int rem = num%10;
            if(rem%2==0){
                evenSum+=rem;
            }
            else if(rem%2!=0){
                oddSum+=rem;
            }

            num = num/10;
        }

        System.out.println("The sum of even numbers : "+ evenSum);
        System.out.print("The sum of odd numbers : "+ oddSum);
    }
}
