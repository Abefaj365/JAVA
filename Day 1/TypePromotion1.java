/*Type promotion in expression :
 * 1. Java automatically promotes each byte, short or char operand to int when evaluating an expression.
 * 2. If one operand is long, float or double the whole expression is promoted to long , float or double respectively.
 * For Example : Expression a(int)+b(float)*c(char)/e(long)
 */



import java.util.*;
public class TypePromotion1 {
    public static void main(String args[]){
     char ch = 'a';
     byte b = 1;
     System.out.println(ch + b); // Condition 1 full-filed where char and byte converted into int in an expression.

     double d = 3.00;
     System.out.println(ch+b+d); // Condition 2 full-filed where every data type converted into double.
    }
}
