import java.util.*;

public class Department {
    private String departmentId;
    private String departmentName;
    private String headOfDepartment;
    private List<Student> students;
    private List<Course> courses;

    // Constructor
    public Department(String departmentId, String departmentName, String headOfDepartment) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.headOfDepartment = headOfDepartment;
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    // Set department details
    public void setDepartmentDetails(String departmentId, String departmentName, String headOfDepartment) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.headOfDepartment = headOfDepartment;
        System.out.println("Department details set successfully!");
    }

    // Display department details
    public void displayDepartmentDetails() {
        System.out.println("\n========== DEPARTMENT DETAILS ==========");
        System.out.println("Department ID: " + departmentId);
        System.out.println("Department Name: " + departmentName);
        System.out.println("Head of Department: " + headOfDepartment);
        System.out.println("Total Students: " + students.size());
        System.out.println("Total Courses: " + courses.size());
        System.out.println("========================================\n");
    }

    // Add student to department
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            System.out.println("Student " + student.getName() + " added to department " + departmentName);
        } else {
            System.out.println("Error: Student already exists in department!");
        }
    }

    // Remove student from department
    public void removeStudent(String studentId) {
        for (Student s : students) {
            if (s.getStudentId().equals(studentId)) {
                students.remove(s);
                System.out.println("Student " + s.getName() + " removed from department");
                return;
            }
        }
        System.out.println("Error: Student not found!");
    }

    // Add course to department
    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            System.out.println("Course " + course.getCourseName() + " added to department " + departmentName);
        } else {
            System.out.println("Error: Course already exists in department!");
        }
    }

    // Remove course from department
    public void removeCourse(String courseId) {
        for (Course c : courses) {
            if (c.getCourseId().equals(courseId)) {
                courses.remove(c);
                System.out.println("Course " + c.getCourseName() + " removed from department");
                return;
            }
        }
        System.out.println("Error: Course not found!");
    }

    // Update head of department
    public void updateHeadOfDepartment(String newHead) {
        if (newHead != null && !newHead.trim().isEmpty()) {
            String oldHead = this.headOfDepartment;
            this.headOfDepartment = newHead;
            System.out.println("Head of Department updated from " + oldHead + " to " + newHead);
        } else {
            System.out.println("Error: Invalid head name!");
        }
    }

    // Get department ID
    public String getDepartmentId() {
        return departmentId;
    }

    // Get department name
    public String getDepartmentName() {
        return departmentName;
    }

    // Get head of department
    public String getHeadOfDepartment() {
        return headOfDepartment;
    }

    // Get list of students
    public List<Student> getStudents() {
        return students;
    }

    // Get list of courses
    public List<Course> getCourses() {
        return courses;
    }

    // Display all students in department
    public void displayAllStudents() {
        System.out.println("\n========== STUDENTS IN " + departmentName + " ==========");
        if (students.isEmpty()) {
            System.out.println("No students in this department");
        } else {
            for (Student s : students) {
                System.out.println(s.getStudentId() + " - " + s.getName());
            }
        }
        System.out.println("=============================================\n");
    }

    // Display all courses in department
    public void displayAllCourses() {
        System.out.println("\n========== COURSES IN " + departmentName + " ==========");
        if (courses.isEmpty()) {
            System.out.println("No courses in this department");
        } else {
            for (Course c : courses) {
                System.out.println(c.getCourseId() + " - " + c.getCourseName());
            }
        }
        System.out.println("=================================================\n");
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId='" + departmentId + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", headOfDepartment='" + headOfDepartment + '\'' +
                ", totalStudents=" + students.size() +
                ", totalCourses=" + courses.size() +
                '}';
    }
}