public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Кавалёў", 40, false),
                new Student("Дубовец", 18, true),
                new Student("Рыбник", 19, true)
        };

        int studentsWithDebts = Student.calculateStudentsWithDebts(students);

        System.out.println("Количество студентов с задоженностями: " + studentsWithDebts);
    }
}
