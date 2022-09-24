import java.time.LocalDate;
import java.util.ArrayList;

public class Supervisor extends Person{
    //member fields
    private ArrayList<Student> students;

    //constructor
    public Supervisor(String id, String name, LocalDate birthDate){
        super(id, name, birthDate);
        students = new ArrayList<Student>();
    }
    //setters
    public void setStudents(ArrayList<Student> students){
        this.students = students;
    }
    //getters
    public ArrayList<Student> getStudents() {
        return students;
    }
    //add student
    public void addStudent(Student student){
        if(!students.contains(student))
            students.add(student);
    }
    //remove student
    public void removeStudent(Student student){
        if(students.contains(student))
            students.remove(student);
    }
}