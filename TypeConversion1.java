/*Type Conversion :
 * a. type compatible
 * b. destination type > source type
 * 
 * double>long>float>int>short>byte
 */



public class TypeConversion1 {
    public static void main(String args[]){
       int a = 10;
       long b = a;  // long > int ... so the condition satisfied
       System.out.println(b);
    }
}


// public class TypeConversion1 {
//     public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
        //int a = sc.nextFloat();  // wrong assign, because int > float. But here float value assigned on int variable.
//        System.out.println(b);
//     }
// }
