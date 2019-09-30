
/*A simple java program to demonstrate the concept of inheritance
between a parent and sub class.
* */

//Written By csamiselo@github.com 2019
class Parent {
    int x;
    int y;

    void showvalues() {
        System.out.println("The values of x and y are :" + x + " " + y);
    }
}


class Child extends Parent {
    int z;

    void showz() {
        System.out.println("The value of z is :" + z);
    }
}

class Inhertitance {

    public static void main(String args[]) {
        Parent p = new Parent();
        Child c = new Child();

        p.x = 10;
        p.y = 12;

        p.showvalues();

        c.z = 19;
        c.showz();
    }
}