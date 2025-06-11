package BasicJavaConcepts.JavaBasics;

import java.io.*;

    public class ThrowsException {
        public static void readFile(String filename) throws IOException {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        }

        public static void main(String[] args) {
            try {
                readFile("example.txt");
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        }
    }


