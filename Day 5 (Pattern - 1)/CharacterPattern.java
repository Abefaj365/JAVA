import java.util.Scanner;

public class CharacterPattern {
    public static void main(String args[]){
        char ch = 'A';

        System.out.print("Enter your number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
