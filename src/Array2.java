/* A simple program to demonstrate how to obtain the six of array using te .length() property  */

//Written By csamiselo@github.com 2019

class MakeArray {
    int first[] = new int[10];
    int second[] = {1, 2, 3, 4, 5, 6, 7, 8};
    int third[] = {0, 9, 8, 6, 4, 2};

    void ShowArray() {
        System.out.println("The length of the first array is:" + first.length);
        System.out.println("The length of the second array is:" + second.length);
        System.out.println("The length of the third array is:" + third.length);
    }

}

class Array2 {
    public static void main(String[] args) {
        MakeArray mk = new MakeArray();
        mk.ShowArray();

    }
}