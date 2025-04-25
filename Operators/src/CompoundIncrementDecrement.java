public class CompoundIncrementDecrement {
    public static void main(String[] args) {
        int a=5;
        int b= 10;
        int p;
       int r;
        p= ((a++)+(++a) + (b--) +(--b));
        System.out.println ("p ="+p);

         r=((++a)+(--b));
        System.out.println ("r ="+r);

    }
}
