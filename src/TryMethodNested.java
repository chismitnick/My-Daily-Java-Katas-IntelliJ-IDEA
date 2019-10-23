/** A simple program to demonstrate how try statements can be nested within a method call
 * */

public class TryMethodNested {
    static void nestedmeth(int a){
        try {
            if(a==1)
                a= a/(a-a);
            if(a==2){
                int s[]={1};
                s[42]=99;
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(("The exception raised is :" +e));
        }
        }

        //Main Method
        public static void main(String[] args) {
        try {
            int a  = args.length;
            /**Generates a divide by zero exception
             because no command line arguments are present */
            int z = 42/a;
            System.out.println(("a = " + a));

            //Method call
            nestedmeth(a);
        }
        catch(ArithmeticException e){
            System.out.println("The error generated is:" +e);
        }

        }

    }


