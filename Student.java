import java.util.Objects;

class Student implements Comparable<Student> {
    private int id;
    private String name;
    private String email;

    // Constructor
    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    // Override hashCode and equals for HashSet uniqueness based on id
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return id == student.id;
    }

    // Override toString for easy display of student details
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', email='" + email + "'}";
    }

    // Implement compareTo for TreeSet sorting by name
    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }
}

