public class Main {
    static class Student implements Cloneable {
        String name;
        public Student clone() throws CloneNotSupportedException {
            return (Student) super.clone();
        }

    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Student[] students = new Student[3];
        for (Student student : students) System.out.println(student);
        System.out.println("===");
        Student studentOne = new Student(); studentOne.name = "Peter"; //создаем строку
        Student studentTwo = (Student) studentOne.clone();
        students[0] = studentOne; //помещаем указатель на строку в массив
        for (Student student : students) {
            if (student == null) continue;
            System.out.println(student.name);
        }
        System.out.println("===");
        studentOne.name = "Paul";
        System.out.println(studentOne.name);
        System.out.println(students[0].name);
        System.out.println(studentTwo.name);

    }
}
