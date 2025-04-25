package StringOperation;

public class ReplacementMethod {
    public static void main(String[] args) {
        String original = "my name is kajal";
        System.out.println ("original ="+ original);

        String charReplaced = original.replace ("n","f");
        System.out.println ("AFTER replacement ="+    charReplaced);

        String replcedAll = original.replaceAll ("my name is kajal","my name is sejal");
        System.out.println (" after all replacement ="+replcedAll);
    }
}
