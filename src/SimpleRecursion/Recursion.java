package SimpleRecursion;

class Recursion {
    public static int fact ( int n ) {
        if ( n == 1 ) return 1;
        return n * fact ( n-1 );
    }
    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]);
        long fact = fact ( input );
        System.out.println(fact);
    }
}