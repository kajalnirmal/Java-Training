package StringOperation;

public class StringBuilderOrStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer ("kajalp");
        System.out.println (sb.length ());
        sb.append ("NIRMAL");
        System.out.println (sb);
        sb.deleteCharAt (5);
        System.out.println (sb);
        sb.insert (0,"JAVA");
        System.out.println (sb);
    }
}
