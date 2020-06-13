package Generics.GenericMethods;
//The comparable interface is used to declare objects that can be ordered
//an upper bound of Comparable ensures that isIn( )
// can be used only with objects that are capable of
//being compared
public class GenericMethod {
    //type parameters are declared before the return type of the method.
    static <T extends Comparable<T>,V extends  T>boolean isIn(T t, V[]vs){
        for (int i = 0; i< vs.length;i++)
            if(t.equals(vs[i]))  return true;
            return false;
    }

    public static void main(String[] args) {
        //create an integer object
        Integer integer[] = {12,13,1,4,1,5,16};
        if(isIn(12,integer))
            System.out.println("The number 12 is in the array");

        //create a string object
        String s[] = {"My","Name","Is","Java"};
        if(isIn("My",s))
            System.out.println("The word My is in the string array");
    }
}
