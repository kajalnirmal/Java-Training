package CodingQuestions;

public class FirstWordCapital {

    public static String capitalizedWords(String str) {
        char[] ch = str.toCharArray ();
        Boolean capitalized = true;

        for (int i = 0; i < ch.length; i++) {
            if (capitalized && ch[i] >= 'a' && ch[i] <= 'z') {
                ch[i] = (char) (ch[i] - 32);
                capitalized = false;

            } else if (ch[i] == ' ') {
                capitalized = true;

            } else {
                capitalized = false;
            }
        }
        return new String (ch);

    }
        public static void main (String[]args){
            String str = "java is awesome";
            String result = capitalizedWords (str);

            System.out.println (result);
        }
    }
