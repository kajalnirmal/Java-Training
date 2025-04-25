package StringOperation;

public class StringSplitMethod {
    public static void main(String[] args) {

        String str = "java,python,c++,c";
        String[] languages = str.split (" ");

        for(String language:languages){
            System.out.println (language);
        }
    }
}
