import java.util.Scanner;

public class AdditionOfArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int[]num = {1,2,3,4,5,7,8,9,10};
        int element = sc.nextInt ();
        System.out.println ("enter element to add");
        int[]addElement=new int[num.length+1];
        int index=0;
     boolean isElementInserted= false;
        for(int i=0;i<num.length-1;i++) {
            if (num[i + 1] > element && isElementInserted == false) {
                addElement[index++] = num[i];
                addElement[index++] = element;

                System.out.println ("element is added");
                isElementInserted = true;

            } else {
                addElement[index++] = num[i];
            }
        }
            System.out.println ("after adding elements are =");
            for (int i = 0; i < addElement.length - 1; i++) {
                System.out.println (addElement[i]);


        }
    }
}
