
// A simple program to demonstrate method overriding


class Super {

    int i,j;

     Super(int a, int b) {
         i = a;
        j = b;
    }

    //method that is being overridden
    void show(){

        System.out.println( "the values of i and j are :" + i + " " + j);
    }
}


class Sub extends Super {

    int k;
    Sub(int a, int b, int c ) {
        super(a,b);
        k =c ;
    }

        //Method overridden form the super class
    void show() {
        //refers to the show() method in the super class which only has i and j values defined
        super.show();
        System.out.println( "the value of k is :" + k);
    }

}

public class Override {

    public static void main(String[] args) {
        Sub sb = new Sub(12,13,14);

        // Refers to the show method in subclass which shows the value of k
        sb.show();
    }
}
