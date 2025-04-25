package CodingQuestions;

public class RemoveNumericDigit {
    public static void main(String[] args) {
        String str = "HELLO123JAVA";
        String res = "";

        for(int i= 0;i<str.length ();i++){
            if(!Character.isDigit (str.charAt (i))){
                res = res+ str.charAt (i);

            }
        }
           System.out.println (res);
    }
}
