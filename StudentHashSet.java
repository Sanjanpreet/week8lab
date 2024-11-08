import java.util.HashSet;

class StudentHashSet {
    private HashSet<Student> students = new HashSet<>();

    // here we will add students if there are not already present
    public void addStudent(Student student) {
        if (students.contains(student)) {
            System.out.println("Student with ID " + student.getId() + " is already in the system.");
        } else {
            students.add(student);
            System.out.println("Added student: " + student);
        }
    }

    // Display all students in the HashSet
    public void displayStudents() {
        System.out.println("HashSet of Students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
