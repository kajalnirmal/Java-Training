package StringPractice;

public class PalidromeNo {
    public static void main(String[] args) {

        String str = "peep";
        String rev = "";

        for (int i = str.length () - 1; i >= 0; i--) {
            rev = rev + str.charAt (i);
        }
        if (rev.equals (str)) {
            System.out.println (str + "  string is palidrome");

        } else {
            System.out.println (str + "string is not palidrome");
        }
    }
    }
