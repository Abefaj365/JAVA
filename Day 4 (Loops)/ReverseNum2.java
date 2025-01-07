//Reverse the given number 

public class ReverseNum2 {
    public static void main(String args[]){
        int n = 20559;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum = (sum*10) + rem;
            n = n/10;
        }

        System.out.print("The reverse number is : " + sum);
    }
}
