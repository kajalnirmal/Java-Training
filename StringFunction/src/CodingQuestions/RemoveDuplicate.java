package CodingQuestions;

public class RemoveDuplicate {
    public static void main(String[] args) {

        String str= "programming";
        String result = "";

        for (int i=0;i<str.length ();i++){
            boolean check = false;

            for (int j=0;j<result.length ();j++){
                if(result.charAt (j)==str.charAt (i)){
                 check=true;
                 break;
                }
            }
          if(!check){
              result=result+str.charAt (i);
          }

            }
        System.out.println (result);
    }
}
