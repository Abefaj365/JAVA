//Continue statements means to skip an iteration
//Example : Display all numbers entered by user except multiples of 10

import java.util.*;
public class ContinueExample {
    public static void main(String args[]){
        while(true){
            System.out.print("Enter your number : ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if(num%10==0){
                continue;
            }
            System.out.println("Your entered number is : "+ num);
        }
    }
}
