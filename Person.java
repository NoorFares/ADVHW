import java.time.LocalDate;

abstract public class Person {
    //member fields
    private String id;
    private String name;
    private LocalDate birthDate;

    //constructor
    public Person(String id, String name, LocalDate birthDate){
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }
    //setters
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    //getters
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    //method to get the age of the student
    public int getCurrentAge(){
        return 2022-birthDate.getYear();
    }
    //override toString method to get the information of the student as a string
    public String toString(){
        return "ID: "+id+"\n"+"Name: "+name+"\n"+"Birthdate: "+birthDate+"\n";
    }
    //print the student information
    public void printInfo(){
        System.out.println(this); //internally, the program will call toString method
    }
    //override equals method to compare two students
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Person){
            Person student = (Person) obj;
            if(student.getId().equals(id) && student.getName().equals(name) && student.getBirthDate().equals(birthDate))
                return true;
            return false;
        }
        return false;
    }
}
