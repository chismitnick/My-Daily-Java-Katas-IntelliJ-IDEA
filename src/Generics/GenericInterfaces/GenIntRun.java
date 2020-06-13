package Generics.GenericInterfaces;

public class GenIntRun {
    public static void main(String[] args) {
        Integer integer[] = {2, 4, 6, 8, 9};
        Character character[] = {'@', '$', '%', '*'};

        GenImplement<Integer> integerGenImplement = new GenImplement<Integer>(integer);
        GenImplement<Character> characterGenImplement = new GenImplement<Character>(character);

        System.out.println("The maximum value in rhe integer array is:" + integerGenImplement.maximum());
        System.out.println("The minimum value in the integer array is :" + integerGenImplement.minimum());


        System.out.println("The maximum value in the character array is :" + characterGenImplement.maximum());
        System.out.println("the minimum value in the character array is :" + characterGenImplement.minimum());
    }
}
