package StringOperation;

import org.w3c.dom.ls.LSOutput;

public class NullVersesEmptyString {
    public static void main(String[] args) {
        String str = " ";
        String str1 = "";

        System.out.println (str.isEmpty ());
        System.out.println (str.isBlank ());


        System.out.println (str1.isEmpty ());
        System.out.println (str1.isBlank ());

    }

}
