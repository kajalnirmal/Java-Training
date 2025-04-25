package CodingQuestions;

import javax.management.MBeanAttributeInfo;

public class QUE1 {
    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";
        
        boolean isanagrams = true;

        for (int i = 0; i < s.length (); i++) {
            char ch = s.charAt (i);
            isanagrams = false;

            for (int j = 0; j < t.length (); j++) {
                if (ch == t.charAt (j)) {
                    isanagrams = true;
                    break;
                }
            }

            if (isanagrams == false) {
                System.out.println (" string is  not anagram");
                break;


            }


            }if(isanagrams==true){
            System.out.println ("given string are anagram");
        }

        }

    }





