package Pythagoras;

public class Pythagoras {
    int a, b, c;

    public Pythagoras(int a, int b) {
        this.a = a;
        this.b = b;

    }

    public void getLengthOfSide() {

        c = (int) Math.sqrt(a * a + b * b);

        System.out.println("The length of the side is :" + c);

    }

    static class Execute {

        public static void main(String[] args) {
            Pythagoras pythagoras = new Pythagoras(4,3);
            pythagoras.getLengthOfSide();
        }


    }

}
