package StringOperation;

public class StringComparison {
    public static void main(String[] args) {
        String s1 = "abc";
        char[]arr = {'a','b','c'};
        String s2 = new String (arr);
        System.out.println (s1.equals (s2));
        System.out.println (s1==s2);

    }
}
