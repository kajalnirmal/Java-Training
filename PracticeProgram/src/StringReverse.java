public class StringReverse {
    public static void main(String[] args) {
      String str="my name is kajal";
      String result= "";

        for(int i= str.length ()-1;i>=0;i--){
            result=result + str.charAt (i);

        }
        System.out.println (result);
        System.out.println (str.length ());
    }
}
