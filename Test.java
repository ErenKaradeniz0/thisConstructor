package SecondTermWeek7;

public class Test {

    public static void main(String[] args) {
        Student student = new Student("Eren", "Karadeniz", 200101070);
        Student student1 = new Student(student);
        Student.toUpper(student1);
        System.out.println("number of students  : " + Student.count);
        System.out.println("Name Surname    ID   ");
        System.out.println(student.name + " " + student.surname + " " + student.id);
        System.out.println(student1.name + " " + student1.surname + " " + student1.id);
    }
}
