package Generics.GenSuperClass;

public class GenExRun {
    public static void main(String[] args) {
        Genex<String> stringIntegerGenex = new Genex<String> ("The string value is: " );
        System.out.println(stringIntegerGenex.getVar());
    }
}
