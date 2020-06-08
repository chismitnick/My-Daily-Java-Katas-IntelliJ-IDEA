package OOP;/* A simple java class to demonstrate the operations of interfaces
it highlights two keywords namely 'interface' and 'implements'
 */
//Written By csamiselo@github.com 2019


interface Call {

    //interface methods do not contain any implementation or method body
    void DisplayName(String p);
}

class Client implements Call {

    public void DisplayName(String s) {

        System.out.println("The string form the interface class is:" + "" + s);
    }
}


class AccountHolder {

    // Accessing Implementations Through Interface References
    public static void main(String[] args) {


        //variable c is declared to be of the interface type OOP.Call, yet it was
        //assigned an instance of OOP.Client. Although c can be used to access the DisplayName( )
        //method, it cannot access any other members of the OOP.Client class

        Call c = new Client();
        c.DisplayName("Wu-Tang is for the children");
    }
}
