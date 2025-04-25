package CodingQuestions;

public class CountOccurenceOfEachChar {
    public static void main(String[] args) {
        String  str =" java programming";
        char ch='a';
        int count=0;

        for(int i= 0;i<=str.length ()-1;i++){
            if(str.charAt (i)==ch){
                count++;
            }
        }
        System.out.println ("count char"+ count);
    }
}
