package StringOperation;

    import java.util.StringTokenizer;

    public class SimpleTokenizer {
        public static void main(String[] args) {
            // Sample string to tokenize
            String sentence = "This is a simple sentence for tokenization.";

            // Create a StringTokenizer instance
            StringTokenizer tokenizer = new StringTokenizer(sentence);

            // Print each token
            System.out.println("Tokens in the sentence:");
            while (tokenizer.hasMoreTokens()) {
                System.out.println(tokenizer.nextToken());
            }
        }
    }


