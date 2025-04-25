package StringOperation;

public class SearchingInString {
    public static void main(String[] args) {
        String text = "hello ,welcome to the world java";

        int firstIndex = text.indexOf ("o");
        int lastIndex = text.indexOf ("o");
        boolean contains = text.contains ("java");

        System.out.println ("first index of ="+firstIndex);
        System.out.println ("last index of ="+lastIndex);
        System.out.println ("contains 'java' ="+contains);


        String word = "my name is kajal";
        firstIndex = word.indexOf ("m");
        lastIndex =  word.indexOf ("s");
        contains = word.contains ("name");

        System.out.println ("first index of ="+firstIndex);
        System.out.println ("last index of ="+lastIndex);
        System.out.println ("contain of'name' ="+contains);



    }
}
