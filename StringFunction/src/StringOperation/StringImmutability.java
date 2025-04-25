package StringOperation;

public class StringImmutability {
    public static void main(String[] args) {
         String s1 = "java";
         String  s2 = "java";

        // s1= s1+"program";
         if(s1==s2){
             System.out.println ("both are pointing same objects");
         }
         else{
             System.out.println ("both are pointing diffrent objects");
         }
         // String str = new String ("JAVA");
       // System.out.println (str);
       // str.concat ("program");
        //System.out.println (str);
    }
}
