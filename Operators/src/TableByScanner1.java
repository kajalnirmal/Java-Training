import java.util.Scanner;

public class TableByScanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int x= sc.nextInt ();
      int sum=1;
      for(int i=1;i<=5;i++){
          sum = sum*x;
      }
        System.out.println (sum);
    }
}
