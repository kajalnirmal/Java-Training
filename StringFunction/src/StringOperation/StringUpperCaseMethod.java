package StringOperation;

public class StringUpperCaseMethod {
    public static void main(String[] args) {
        String original = "hello world";
        String upper = original.toUpperCase ();

        System.out.println ("original :"+ original);
        System.out.println ("uppercase : "+ upper);

        String S1 =" KAJAL NIRMAL";
        String lower = S1.toLowerCase ();
        System.out.println (" lower case :"+lower);
    }

    public static class StringToArray {
        public static void main(String[] args) {
            String str ="openAI";

           // CONVERT STRING TO ARRAY
            char[]  charArray = str.toCharArray ();

            System.out.println ("charcters in string =");
            for(char c :charArray){
                System.out.println (c);

            }
        }
    }
}
