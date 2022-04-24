public class Student {
    String name;
    String surname;
    long id;
    static int count;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String surname) {
        this(name);
        this.surname = surname;
    }

    public Student(String name, String surname, long id) {
        this(name,surname);
        this.id = id;
        count++;
    }

    public Student(Student student) {
        this(student.name,student.surname,student.id);
    }

    public static void toUpper(Student student) {
        student.name = student.name.toUpperCase();
        student.surname =student.surname.toUpperCase();
    }
}
