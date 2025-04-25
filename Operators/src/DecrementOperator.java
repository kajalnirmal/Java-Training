public class DecrementOperator {
    public static void main(String[] args) {
        //pre decrement operator
        System.out.println ("predncrement operator");
        int a = 10;
        System.out.println ("a="+ a);
        int x= --a;
        System.out.println ("--a= "+(--a));

        //post decrement operator
        System.out.println ("post decrement operator");
        int b= 10;
        System.out.println ("b="+b);
        int y= b--;
        System.out.println (" b-- ="+ (b--));

    }
}
