package MVC;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentNumber(String studentNumber) {
        model.setStudentNumber(studentNumber);
    }

    public String getstudentNumber() {
        return model.getStudentNumber();
    }

    public void setFirstName(String first_name) {
        model.setFirst_name(first_name);
    }

    public String getFirstName() {
        return model.getFirst_name();
    }

    public void setLastName(String last_name) {
        model.setLast_name(last_name);
    }

    public String getLastName(){
      return  model.getLast_name();
    }

    public void showDetails(){
        view.printStudentInfo(model.getStudentNumber(),model.getFirst_name(),model.getLast_name());
    }

}
