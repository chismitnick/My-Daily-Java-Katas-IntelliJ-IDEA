 /* 
 A simple program to demonstrate Acess control specifiers 
 private and public
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
    //becuase they are 
    ob.a = 14;
    ob.b = 16;
    
    ob.setc(100);
    
    // Print the values of a,b and c 
    System.out.println("The values of a,b and c are :" + ob.a +" "+ ob.b + " " + ob.getc());
}

 }