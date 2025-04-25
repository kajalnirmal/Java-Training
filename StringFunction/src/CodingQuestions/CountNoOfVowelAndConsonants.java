package CodingQuestions;

import java.util.Scanner;

public class CountNoOfVowelAndConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("enter string");
        String str = sc.nextLine ();
        int vowel = 0;
        int consonants =0;
        for (int i = 0; i < str.length (); i++) {
            char ch = str.charAt (i);

                switch (ch) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        vowel++;
                    default : ;
                        break;
                }
            }

            System.out.println (  "no of vowels"+ vowel);
        }
    }
