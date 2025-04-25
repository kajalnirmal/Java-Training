import java.util.Scanner;

public class StringByScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("enter name");
           String name =sc.nextLine ();
          String[]words = name.split (" ") ;
      //  System.out.println (words.length);//
      int  total=0;
       for(int i= 0;i<words.length;i++){
           System.out.println (words[i].length ());
           total= total+i;
           i++;

       }

        System.out.println ("sum of total char is "+total);


      }

    }

