
// A simple program to demonstrate the second usage of the 'super' Keyword

class Square {

    double side1;

    // public method to calculate the area of the square
    double calculateArea() {
        return side1 * side1;
    }
}

class TestSquare extends Square {
    double side1, side2;
    public TestSquare(double s1, double s2) {
        // refers to the value of side 1 in the super class
        super.side1 = s1;

        //side2 in the subclass
        side2 = s2;
    }

    void showS2(){
        System.out.println("The value of side2 from the super class is:" + "  " + super.side1);
        System.out.println("The value of side2 from the sub   class is:" + "  " + side2 );
    }

    public static void main(String[] args) {
        TestSquare T = new TestSquare( 10.67,23.46);
        T.showS2();

    }


}