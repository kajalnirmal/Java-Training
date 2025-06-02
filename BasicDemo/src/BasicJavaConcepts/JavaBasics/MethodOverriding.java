package BasicJavaConcepts.JavaBasics;


   class Animals {
       public void sound () {
           System.out.println ("animal makes a sound");
       }
   }
       class Donkey extends Animal {
           @Override
           public void sound () {
               System.out.println ("dog barks");

           }
       }


public class MethodOverriding {
    public static void main(String[] args) {
        Animals a = new Animals ();
        Animals b = new Animals ();

        a.sound ();
        b.sound ();
    }
}
