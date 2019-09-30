
// A simple program to implement the working of a Stack data structure
//initialize top of tack and implement push and pop methods

//Written By csamiselo@github.com 2019


// Class defining an integer stack that can hold 8 items
class Stack {

    int[] stack = new int[10];
    int topofstack;

    // initialize the top of the stack to  -1 to indicate an empty stack using a constructor
    Stack() {
        topofstack = -1;
    }

    // Define method for push operation
    void push(int item) {

        if (topofstack == 9)
            System.out.println("The stack is full");
        else
            stack[++topofstack] = item;
    }

    //Define method for pop operation
    int pop() {
        if (topofstack < 0) {
            System.out.println("Stack not yet full");
            return 0;
        } else

            return stack[topofstack--];
    }
}

// Implementation of class to test stack methods
class SimpleStack {

    public static void main(String[] args) {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

// push some numbers onto the stack
        for (int i = 1; i < 10; i++) stack1.push(i);
        for (int i = 10; i < 20; i++) stack2.push(i);

//View numbers in the stack using the pop option
        System.out.println("The numbers in the first stack are:");
        for (int i = 0; i < 10; i++)
            System.out.println(stack1.pop());


        System.out.println("The numbers in the second stack are:");
        for (int i = 0; i < 10; i++)
            System.out.println(stack2.pop());
    }
}