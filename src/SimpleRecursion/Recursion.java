package SimpleRecursion;

public class Recursion {
    public  static int factorial(int a){

        if (a ==1) return 1;
        return a * factorial(a -1);

    }

    public static void main(String[] args) {
        int getNumber = Integer.parseInt(args[0]);
        int factorial = factorial(getNumber);
        System.out.println(factorial);
    }

}
