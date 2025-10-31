package modul_6.praktikum_1;

public class InheritanceTest {
    public static void main(String[] args) {
        Student student = new Student("Abrar Astafaraiz", 19, "2024573010088");

        student.displayInfo();

        student.study();

        student.greet();

        // Polymorphism Student sebagai Person
        Person person = new Student("Rayyan", 19, "2024573010119");
        person.greet(); // Setelah Override
    }
}
