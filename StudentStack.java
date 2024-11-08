import java.util.Stack;

class StudentStack {
    private Stack<Student> stack = new Stack<>();

    // Push a student onto the stack
    public void pushStudent(Student student) {
        stack.push(student);
        System.out.println("Pushed student onto stack: " + student);
    }

    // here we will display and pop student that we added  on last
    public void popStudent() {
        if (!stack.isEmpty()) {
            Student student = stack.pop();
            System.out.println("Popped student from stack: " + student);
        } else {
            System.out.println("Stack is empty.");
        }
    }
}
