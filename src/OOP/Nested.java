package OOP;
//Simple program to demonstrate the concept of nesting classes 
//with an inner and outer class.

//Written By csamiselo@github.com 2019

//The Outer Class 
class OuterClass {

    int someValue = 300;

    void printVlaue() {
        Innerclass inner = new Innerclass();
        inner.showValue();
    }

    //The inner class
    class Innerclass {
        void showValue() {
            System.out.println("Displaying value declared in the outer class " + someValue);
        }

    }
}

//class executing the main method
class Nested {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.printVlaue();
    }
}