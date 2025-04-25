package StringOperation;

public class SubstringMethod {
    public static void main(String[] args) {
        String sentence = "java is  language";

        String part1= sentence.substring(5);
        System.out.println (" substring index 9 ="+part1);

        String part2= sentence.substring (0,5);
        System.out.println ("substring from 0 to 5 ="+part2);

        String javaWord = sentence.substring (0,5);
        System.out.println ("extract 'java' ="+javaWord);

    }
}
