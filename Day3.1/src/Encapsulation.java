public class Encapsulation {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student();

        // Set attributes using setter methods
        student.setName("John");
        student.setAge(20);

        // Access attributes using getter methods
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
    }
}
