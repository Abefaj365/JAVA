

public class largest3number {
    public static void main(String args[]){
        int a = 10;
        int b = 7;
        int c = 17;

        if( a>b && a>c){
            System.out.println("A is the greatest");
        }
        else if(b>a && b>c){
            System.out.println("B is the greatest");
        }
        else{
            System.out.println("C is the greatest");
        }
    }
}
