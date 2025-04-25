package StringOperation;

import java.util.Scanner;

public class CharcterExtractionCharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println ("Enter a string");
        String str = sc.nextLine ();

        System.out.println (" Enter index to extract char");
            int index = sc.nextInt ();

            if(index>= 0 && index<str.length ()){
                char ch = str.charAt (index);
                System.out.println ("char at index "+ index + "is "+ch);
            }
            else{
                System.out.println ("invalid index");
            }


    }
}
