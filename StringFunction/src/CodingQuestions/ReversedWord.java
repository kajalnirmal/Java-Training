package CodingQuestions;



    public class ReversedWord {
        public static void reverseWords (String str){
            String[] words = str.split (" ");
            String result = "";
            System.out.println (words.length);

            for (int i = words.length-1; i >= 0; i--) {
                result = result + words[i];
                result = result + " ";
            }
            System.out.println (result);
        }

        public static void main(String[] args) {
        String str = "java is fun";
            reverseWords(str);

    }
}
