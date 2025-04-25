package CodingQuestions;

public class VowelAndConsonants {
    public static void main(String[] args) {
        String str = "hello world";
        int count = 0;
        int vcount = 0;
        int ccount = 0;

        for (int i = 0; i < str.length (); i++) {
           // char ch = str.charAt (i);
            if (str.charAt (i) != ' ') {
                count++;
            }
            if (str.charAt (i) == 'a' || str.charAt (i) == 'e' || str.charAt (i) == 'i' || str.charAt (i) == 'o' || str.charAt (i) == 'u' ) {
                vcount++;
            } else if (str.charAt (i) > 'a' && str.charAt (i) < 'z') {
                ccount++;
            }
        }

        System.out.println (" total no counts  = "+count);
        System.out.println (" total no vowels = "+vcount);
        System.out.println (" total no consonants = "+ccount);

    }

    }

