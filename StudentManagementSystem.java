public class StudentManagementSystem {
    private StudentHashSet studentHashSet = new StudentHashSet();
    private StudentTreeSet studentTreeSet = new StudentTreeSet();
    private StudentStack studentStack = new StudentStack();

    // Method to add a student to HashSet, TreeSet, and Stack
    public void addStudent(Student student) {
        studentHashSet.addStudent(student);
        studentTreeSet.addStudent(student);
        studentStack.pushStudent(student);
    }

    // Below we Display students from HashSet
    public void displayHashSetStudents() {
        studentHashSet.displayStudents();
    }

    // Here we will Display students from TreeSet
    public void displayTreeSetStudents() {
        studentTreeSet.displayStudents();
    }

    // Pop a student from the Stack
    public void popStudentFromStack() {
        studentStack.popStudent();
    }

    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();

        // This is for Sample students
        Student s1 = new Student(1, "Manpreet", "manpreetkaur@example.com");
        Student s2 = new Student(2, "Anchal", "anchalsharma@example.com");
        Student s3 = new Student(3, "Gautam", "gautamverma@example.com");

        // here we add the students as s1, s2, s3.....
        sms.addStudent(s1);
        sms.addStudent(s2);
        sms.addStudent(s3);
        sms.addStudent(s1); // Duplicate ID check

        // Display all students in HashSet and TreeSet
        sms.displayHashSetStudents();
        sms.displayTreeSetStudents();

        //this is to pop students from stack
        sms.popStudentFromStack();
    }
}
