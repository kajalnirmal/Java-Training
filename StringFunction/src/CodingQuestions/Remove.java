package CodingQuestions;

public class Remove {
    public static void main(String[] args) {

        String s1 = "hello123java" ;
        String s2 = s1.replaceAll ( "\\d", "");
        System.out.println (s2);
    }
}
