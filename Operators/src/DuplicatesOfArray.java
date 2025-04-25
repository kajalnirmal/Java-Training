public class DuplicatesOfArray {
    public static void main(String[] args) {
        int[] array= {1,2,3,4,5,6,6,7,8,9,10};
        for(int i=0;i<=10;i++) {
            for (int j = i + 1; j <= 10; j++) {
                if (array [i]==array[j]){
                    System.out.println (array[i]);

                }
            }


        }




        }


    }

