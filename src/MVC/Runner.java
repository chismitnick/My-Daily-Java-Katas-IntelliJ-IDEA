package MVC;

public class Runner {
    public static void main(String[] args) {

        //Fetch the student information
        Student model  = getStudentInfo();


        //create a view to display the student details on the console
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model,view);

        controller.showDetails();

        //Update the model data
       // model.setStudentNumber("2019876542");
        controller.getFirstName();
    }

    private static Student getStudentInfo(){
        Student student = new Student();
        student.setFirst_name("Willard");
        student.setLast_name("Katsande");
        student.setStudentNumber("1224425527");
        return  student;
    }
}


