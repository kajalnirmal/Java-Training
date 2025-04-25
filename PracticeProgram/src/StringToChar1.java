public class StringToChar1 {
    public static void main(String[] args) {
        String string = "my name is kajal";
        int count=0;
        for(int i =0;i<string.length ();i++){

            if(string.charAt(i)!= ' '){
                count++;
            }
        }
        System.out.println (count);
    }
}
