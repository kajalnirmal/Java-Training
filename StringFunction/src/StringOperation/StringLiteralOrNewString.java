package StringOperation;

public class StringLiteralOrNewString {
    public static void main(String[] args) {
        String s1 = "kajal";    //(stored in string constsnt pool)
        String s2= new String ("kajal");    //(stored in heap memory)
        System.out.println (s1==s2);    // ( compare addressed reference)
        System.out.println (s1.equals (s2));    //(compare the value stored)
    }
}
