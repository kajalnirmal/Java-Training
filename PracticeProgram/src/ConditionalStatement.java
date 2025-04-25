public class ConditionalStatement {
    public static void main(String[] args) {
        int math = 75;
        int bio =60;
        int phy = 45;
        int marathi = 80;
        int english = 65;
        double per =((75+60+45+80+65)/500);

        if ((math <=35)|| (bio <=35) || phy <=35||marathi <=35||(english <=35) ){

            System.out.println ("fail");
        }
            else if (per >= 80){

                System.out.println ("destinction");
            }
            else if (per >= 60 || per <= 69)
            {
                System.out.println ("First class");

            }
            else if (per >= 50 || per <= 60)
            {
                System.out.println ("Second class");

            }
            else{
            System.out.println ("pass");
        }



            }
        }





