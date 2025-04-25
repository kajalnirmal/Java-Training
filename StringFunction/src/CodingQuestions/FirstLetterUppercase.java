package CodingQuestions;

public class FirstLetterUppercase {

    public static String firstLetterUppercase(String str) {


        if (str == null || str.isEmpty ()) {
            return str;
        }
        return str.substring (0, 1).toUpperCase () + str.substring(1);
    }
        public static void main (String[]args){
            String text = "java is awesome";
            String result = firstLetterUppercase(text);
            System.out.println (result);

        }

    }
