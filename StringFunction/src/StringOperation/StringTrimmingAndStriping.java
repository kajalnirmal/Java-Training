package StringOperation;

public class StringTrimmingAndStriping {
    public static void main(String[] args) {

        String original = "hello java programming";
        System.out.println (original);

        String trim = original.trim ();
        System.out.println ("after trim :["+ trim+"]");

        String stripleading = original.stripLeading ();
        System.out.println ("after stripleading(): ["+stripleading+"]");

        String Striptrailing = original.stripTrailing ();
        System.out.println ("after strip trailing() :["+Striptrailing+"]");
    }
}
