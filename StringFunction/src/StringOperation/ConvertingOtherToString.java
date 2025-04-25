package StringOperation;

public class ConvertingOtherToString {
    public static void main(String[] args) {
        int num = 123;
        double decimal = 67.45;
        boolean flag = true;
        char grade = 'A';

       // CONVERING STRING

        String s1num = String.valueOf (num);
        String s2decimal = String.valueOf (decimal);
        String s3flag = String.valueOf (true);
        String s4grade = String.valueOf ('A');


        System.out.println ("string from int = "+  s1num);
        System.out.println ("string from double =" + s2decimal);
        System.out.println ("STRING FROM BOOLEAN ="+ s3flag);
        System.out.println ("STRING FROM CHAR = " + s4grade);

    }
}
