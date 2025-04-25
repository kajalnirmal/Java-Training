import java.util.Scanner;

public class RemoveWordString {
        public static  void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            System.out.println ("Enter sentence");
            String sentence = sc.nextLine ();
            System.out.println ("enter the word remove");
            String removeWord = sc.nextLine ();
           // String[] str = new
            int index = 0;

            for (int i = 0; i < sentence.length (); i++) {

                    if (removeWord!=sentence) {



                } else {
                    removeWord = sentence;
                    index++;
                }
                System.out.println (removeWord);

            }

            }


        }




