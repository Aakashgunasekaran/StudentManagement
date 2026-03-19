import java.util.*;

public class StudentService {
    private List<Student> students;

    // Constructor
    public StudentService() {
        this.students = new ArrayList<>();
    }

    // Add student
    public void addStudent(Student student) {
        if (searchStudent(student.getStudentId()) == null) {
            students.add(student);
            System.out.println("Student " + student.getName() + " added successfully!");
        } else {
            System.out.println("Error: Student already exists!");
        }
    }

    // Remove student
    public void removeStudent(String studentId) {
        Student student = searchStudent(studentId);
        if (student != null) {
            students.remove(student);
            System.out.println("Student " + student.getName() + " removed successfully!");
        } else {
            System.out.println("Error: Student not found!");
        }
    }

    // Update student
    public void updateStudent(String studentId, String name, int age, String department, String email, String phone) {
        Student student = searchStudent(studentId);
        if (student != null) {
            student.updateStudent(name, age, department, email, phone);
            System.out.println("Student updated successfully!");
        } else {
            System.out.println("Error: Student not found!");
        }
    }

    // Search student by ID
    public Student searchStudent(String studentId) {
        for (Student s : students) {
            if (s.getStudentId().equals(studentId)) {
                return s;
            }
        }
        return null;
    }

    // Search students by name
    public List<Student> searchStudentByName(String name) {
        List<Student> foundStudents = new ArrayList<>();
        for (Student s : students) {
            if (s.getName().toLowerCase().contains(name.toLowerCase())) {
                foundStudents.add(s);
            }
        }
        return foundStudents;
    }

    // Get all students
    public List<Student> getAllStudents() {
        return students;
    }

    // Display all students
    public void displayAllStudents() {
        System.out.println("\n========== ALL STUDENTS ==========");
        if (students.isEmpty()) {
            System.out.println("No students found!");
        } else {
            for (Student s : students) {
                System.out.println(s.getStudentId() + " - " + s.getName() + " (" + s.getDepartment() + ")");
            }
        }
        System.out.println("==================================\n");
    }

    // Get total number of students
    public int getTotalStudents() {
        return students.size();
    }

    // Clear all students
    public void clearAllStudents() {
        students.clear();
        System.out.println("All students removed!");
    }
}