package CodingQuestions;

public class RemoveDuplicates1{

    public static void  removeDuplicates(String str){
          String result="";
         for (int i=0;i<str.length ();i++){
             boolean duplicate= false;

             for (int j=0;j<result.length ();j++){

                 if(result.charAt (j)==str.charAt (i)){
                     duplicate=true;
                     break;
                 }
             }
             if(!duplicate){
                 result =result+str.charAt (i);
             }
         }
        System.out.println (result);
        }

    public static void main(String[] args) {
        removeDuplicates ("programming");
    }
    }

