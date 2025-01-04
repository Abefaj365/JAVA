// Enter cost of 3 items from the user (using float data type)- a pencil, a pen and
// an eraser. You have to output the total cost of the items back to the user as their bill.
// (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem

import java.util.*;
public class question3 {
    public static void main(String args[]){

      System.out.println("Enter the price for a pencil, a pen and a eraser :");
      Scanner sc = new Scanner(System.in);

      float pe = sc.nextFloat();
      float p = sc.nextFloat();
      float e = sc.nextFloat();
     
      float total = (pe+p+e);

      float taxTotal = total + total * 0.18f;

      System.out.print("Total value is : ");
      System.out.println(total);

      System.out.print("Total value after adding TAX : ");
      System.out.print(taxTotal);

    }
}
