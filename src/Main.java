import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Student student = new Student("ALi","Temirbekov","male", LocalDate.of(2002,2,4),new University("KGTU","Kyrgyzstan",LocalDate.of(1957,4,5)));
        Student student1 = new Student("Aslan","Sadiev","male", LocalDate.of(2005,2,2),new University("KGTU","Kyrgyzstan",LocalDate.of(1957,4,5)));
        Student student3 = new Student("Urmat","Toichikov","male", LocalDate.of(2009,1,4),new School("K.Myrzabekov","Kyrgyzstan",LocalDate.of(2000,9,5)));
        Student student4 = new Student("Salambek","Temir","male", LocalDate.of(2002,2,4),new School("KGTU","Kyrgyzstan",LocalDate.of(1957,4,5)));
        Student student5 = new Student("Lira","Raiymbekova","female", LocalDate.of(2002,2,4),new University("MUK","Kyrgyzstan",LocalDate.of(1957,4,5)));
        Student student6 = new Student("Jigit","Turumbekov","male", LocalDate.of(2003,2,4),new College("KNU","Kyrgyzstan",LocalDate.of(1957,4,5)));
        Student student7 = new Student("Aiturgan","Daiyrbekkova","female", LocalDate.of(2004,2,4),new College("KGTU","Kyrgyzstan",LocalDate.of(1957,4,5)));

        Student[] students = {student,student1,student3,student4,student5,student6,student7};


        info(students);



    }
    public static void info(Student [] students){
        for (Student st : students){
            System.out.println(st);
            st.getStudentsStudyEducationCenter();
            st.getStudentsStudyingYear();
        }
    }

}