import java.util.*;
public class TypeCasting1 {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     float a = 9.99f;
     int b = (int)a;

     System.out.println(b);

     char ch = 'a';
     int number = ch; // char < int .. So we don't need to type cast here
     System.out.println(number);
    }
}
