package CodingQuestions;

public class CharacterCount {

    public static void count(String str) {
        String s = "";
        char[] ch = str.toCharArray ();
        for (int i = 0; i < ch.length; i++) {

            while (i < ch.length && ch[i] != ' ') {
                s = s + ch[i];
                i++;
            }
            if (s.length () > 0) {
                System.out.println (s + "=" + s.length ());
            }


        }
    }

        public static void main (String[]args){
            String str = "hello world";
            count (str);
        }
    }
