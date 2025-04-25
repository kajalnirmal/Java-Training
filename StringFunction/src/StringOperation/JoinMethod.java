package StringOperation;

public class JoinMethod {
    public static void main(String[] args) {
        String S1= "JAVA,PYTHON,C++";
        System.out.println ("original ="+S1);

        String result = String.join (S1,"c,database,software testing");
        System.out.println ("AFTER  ADDITION = "+S1+ result);
    }
}
