package BasicJavaConcepts.JavaBasics;


    import java.util.Scanner;
import java.util.InputMismatchException;

    public class MultipleCatchBlock {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] numbers = new int[5];

            try {
                System.out.println("Enter 5 numbers:");
                for (int i = 0; i < 5; i++) {
                    numbers[i] = input.nextInt();
                }

                System.out.print("Enter index to view (0–4): ");
                int index = input.nextInt();

                System.out.println("Number at index " + index + " is " + numbers[index]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid index!");
            } catch (InputMismatchException e) {
                System.out.println("Please enter numbers only!");
            }
        }
    }


