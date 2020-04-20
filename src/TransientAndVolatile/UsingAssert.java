package TransientAndVolatile;
// The assert keyword is used in java development to create an assertion
// An assertion is a condition which must always be true during a programs execution
// At runtime if the condition is true then no action takes place
// If not an Assertion Error is thrown

public class UsingAssert {
    static int val = 3;

    static int getNumber() {
    return  val--;
    }


    public static void main(String[] args) {
        int x;
        for(int i=0;i < 10;i++){
            x = getNumber();
            //No action will take place as long as this condition is true
            //but will fail when x is 0
            assert  x>0:"x is negative";
            System.out.println("x is" +x);

        }
    }

}