package MVC;
/**
 * This is the StudentView Class
 * it sits in between the Model and StudentController class
 *
 * */

public class StudentView {
    public void printStudentInfo(String studentNumber, String first_name, String last_name){

        System.out.println("Student details are as follows");
        System.out.println("Student Number :" + studentNumber);
        System.out.println("First Name :" + first_name);
        System.out.println("Last Name :" + last_name);
    }
}
