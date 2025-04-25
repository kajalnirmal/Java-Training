package StringOperation;

public class StringConstantPool {
    public static void main(String[] args) {
        String  str = new String ("test");    //(stored in heap memory)
        String str2 = new String ("test");
        String str1 = "test1";//(stored in constant pool)
        String str3 = "test1";

        System.out.println (str==str2);
        System.out.println (str1==str3);
    }
}
