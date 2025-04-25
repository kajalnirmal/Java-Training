package StringOperation;

public class StringMatchesAndReplaceAll {
    public static void main(String[] args) {
        String s1 = "hello123";
        boolean ismatch = s1.matches ("[a-z]+\\d+");
        System.out.println (ismatch);


        String s2 = "abc123ghi";
        String S3 = s2.replaceAll ("\\d+","*");
        System.out.println (S3);
    }


}
