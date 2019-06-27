/* A simple program to demovstrate how to obtain the sixe of array using te .length() property  */


class MakeArray{
    int first[] = new int[10];
    int second[]={1,2,3,4,5,6,7,8};
    int third[] = {0,9,8,6,4,2};

    void ShowArray(){
        System.out.println("The lenth of the first array is:" + first.length);
        System.out.println("The lenth of the second array is:" + second.length);
        System.out.println("The lenth of the third array is:" + third.length);
    }

}
class  Array2 {
    public static void main(String[] args) {
        MakeArray mk = new MakeArray();
        mk.ShowArray();

    }
}