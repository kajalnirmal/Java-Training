package CodingQuestions;

public class CapitalFirstLetter {

    public static void firstLetterCapital(String str){
        String [] words = str.split (" ");
        System.out.println (words.length);
        String result = "";
        for (int i=0;i< words.length;i++) {
            char ch = Character.toUpperCase (words[i].charAt (0));
            result = result + ch + words[i].substring (1) + " ";

        }

        System.out.println (result);

    }

    public static void main(String[] args) {
        String  str = "java is awesome";
        firstLetterCapital (str);
    }
}
