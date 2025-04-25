package StringOperation;

public class StringFormating {
    public static void main(String[] args) {
         String name ="kajal";
         int age = 26;
         double score = 87.72;

         String format = String.format ("NAME: %s,Age : %d,Score : %.2f",name,age,score);
        System.out.println (format);

    }
}
