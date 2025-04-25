package CodingQuestions;


public class Que3 {
    public static void main(String[] args) {
        String str="aabcccccaaa";
        String result="";
        int count = 1;
        for(int i=0;i<=str.length ()-1;i++){
           // char ch1=str.charAt (i);
           // char ch2=str.charAt (i-1);


            if(i==0){
                result=result+str.charAt (i-1);
                count=1;
                break;

            } else if (str.charAt (i)==str.charAt (i-1) ){
                count++;
                break;

            } else if (str.charAt (i)!=str.charAt (i-1)) {
                result= result+count+str.charAt (i);
                count=1;
                break;

            }
            if (i==str.length ()-1){
                result=result+count;
            }
        }
        System.out.println (result);
    }
}
