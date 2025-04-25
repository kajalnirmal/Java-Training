package StringOperation;


    import java.nio.charset.StandardCharsets;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

    public class Utf8EncodingDecoding {
        public static void main(String[] args) {
            // Sample string
            String originalString = "Hello, UTF-8 World!";

            // Encoding: Convert the string into a byte array using UTF-8 encoding
            byte[] encodedBytes = originalString.getBytes(StandardCharsets.UTF_8);

            // Print encoded bytes
            System.out.println("Encoded Bytes: ");
            for (byte b : encodedBytes) {
                System.out.print(b + " ");
            }
            System.out.println();

            // Decoding: Convert the byte array back into a string using UTF-8 decoding
            String decodedString = new String(encodedBytes, StandardCharsets.UTF_8);

            // Print the decoded string
            System.out.println("Decoded String: " + decodedString);
        }
    }


