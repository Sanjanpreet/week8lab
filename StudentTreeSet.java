import java.util.TreeSet;

class StudentTreeSet {
    private TreeSet<Student> students= new TreeSet<>();

    // Add student to TreeSet
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Added student to TreeSet: " + student);
    }

    // Display all students in alphabetical order by name
    public void displayStudents() {
        System.out.println("TreeSet of Students (sorted by name):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

