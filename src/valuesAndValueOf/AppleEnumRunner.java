package valuesAndValueOf;

public class AppleEnumRunner {
    public static void main(String[] args) {
        //create object type from enum class
        Apple ap;

        System.out.println("This is a list of all the enumeration constants from the Apple enum ");

        // using values() method
        Apple []allApples = Apple.values();
        for(Apple a : allApples)
            System.out.println(a);

        System.out.println();

        //using  valueof() method
        ap = Apple.valueOf("Mediterranean");
        System.out.println("ap contains:" + ap);
    }

}
