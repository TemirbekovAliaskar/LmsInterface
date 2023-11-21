import java.time.LocalDate;

public class Student implements Study{

    public String name;
    public String surname;
    public String gender;
    public LocalDate dateOfStart;
    EducationCenter educationCenter;

    public Student(String name, String surname, String gender, LocalDate dateOfStart, EducationCenter educationCenter) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.dateOfStart = dateOfStart;
        this.educationCenter = educationCenter;
    }

    @Override
    public void getStudentsStudyEducationCenter() {

        System.out.println(name+ " " + surname + " " + educationCenter);
    }

    @Override
    public void getStudentsStudyingYear() {

        System.out.println(name + " " + surname + " " + dateOfStart);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfStart=" + dateOfStart +
                ", educationCenter=" + educationCenter +
                '}';
    }
}
