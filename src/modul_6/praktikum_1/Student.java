package modul_6.praktikum_1;

public class Student extends Person {
    private String studentId;

    public Student(String name, int age, String number) {
        super(name, age);
        this.studentId = studentId;
    }

    public void study() {
        System.out.println(name + " is studying");
    }

    @Override
    public void greet() {
        System.out.println("Hello, I'm a student named " + name);
    }
}
