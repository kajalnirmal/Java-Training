package CodingQuestions;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String str = "programming";

        for (int i = 0; i < str.length (); i++) {
            boolean value = true;
            for (int j = 0; j < str.length (); j++) {

                char ch = str.charAt (i);
                char ch1 = str.charAt (j);
                if(i!=j && ch == ch1){
                    value =false;
                }
            }
            if(value){
                System.out.println ("the first unique char is  "+str.charAt (i));
                break;
            }
        }
    }
}