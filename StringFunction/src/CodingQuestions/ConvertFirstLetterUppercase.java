package CodingQuestions;

import java.util.Scanner;

public class ConvertFirstLetterUppercase {
    public static void main(String[] args) {
        String  s1 = " my name is kajal";
        String[] arr = s1.split ("");
        String reqStr = "";

        for(int i= 0;i<s1.length ();i++){
            char ch = arr[i].charAt (0);

            String ch1 = String.valueOf (ch).toUpperCase ();
            String sub = arr[i].substring (1);
            reqStr = reqStr + ch1 + sub+ " ";




        }
        System.out.println (reqStr.trim ());
    }
}
