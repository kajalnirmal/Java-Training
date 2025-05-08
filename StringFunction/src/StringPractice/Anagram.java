package StringPractice;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        if(s.length ()!=t.length ()){
            System.out.println ("length are diffrent so not an anagram");
        }
       else{
           char[]ch1=s.toCharArray ();
           char[]ch2=t.toCharArray ();

           Arrays.sort(ch1);
            Arrays.sort(ch2);

            if(Arrays.equals (ch1,ch2)){
                System.out.println (" two strings are anagram");
            }
            else{
                System.out.println ("two strings are not anagram");
            }

        }

    }
}
