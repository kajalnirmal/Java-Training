import java.util.Scanner;

public class RemovedElementofArray {
    public static  void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int[] number = {1,2,3,4,5,6,7,8,9,10};
        System.out.println ("Enter elements");
         int element = sc.nextInt ();
        int[] removeElement = new int[9];
        int index = 0;

        for (int i = 0; i < number.length; i++) {
            if (element == number[i]) {
                System.out.println ("elements is found in list");
            } else {
                removeElement[index] = number[i];
                index++;
            }
            }
            for (int i = 0; i <= removeElement.length; i++) {
                System.out.println (removeElement[i]);

            }

        }
    }

