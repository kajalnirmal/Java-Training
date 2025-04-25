import java.util.Scanner;

public class StringByWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("enter sentence");
        String sentence = sc.nextLine ();

        int total = 0;
        int i = 0;
        while (i < sentence.length ()) {
            if (sentence.charAt (i)!=' ') {
                total++;
            }
            i++;

        }
        System.out.println ("total count =" + total);

    }
}
