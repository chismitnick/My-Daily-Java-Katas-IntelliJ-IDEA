 /* 
 A simple program to demonstrate Access control specifiers
 private and public. And how the can be used by other classes
 */
 class Base {
    int a; // default access modifier for Java is public
    public int b;
    private int  c;// can only be accessed through getter and setter methods 
    
    void setc(int i){
        c = i;
     }
    int getc() {
         return c;
     }
 }

class AcessControl {
public static void main(String[] args) {
    Base ob  = new Base();

    //Access a nd b directly 
    //because they are declared as public
    ob.a = 14;
    ob.b = 16;

    // c can only be accessed using a setter method because its declared as private
    ob.setc(100);
    
    // Print the values of a,b and c 
    System.out.println("The values of a,b and c are :" + ob.a +" "+ ob.b + " " + ob.getc());
}

 }