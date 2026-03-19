import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class MainApp {
    private StudentService studentService;
    private List<Course> courses;
    private List<Department> departments;
    private List<Enrollment> enrollments;
    private Scanner scanner;

    // Constructor
    public MainApp() {
        this.studentService = new StudentService();
        this.courses = new ArrayList<>();
        this.departments = new ArrayList<>();
        this.enrollments = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    // Main method
    public static void main(String[] args) {
        MainApp app = new MainApp();
        app.start();
    }

    // Start the application
    public void start() {
        System.out.println("\n========================================");
        System.out.println("   STUDENT MANAGEMENT SYSTEM");
        System.out.println("========================================\n");

        boolean running = true;
        while (running) {
            menu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    searchStudent();
                    break;
                case 5:
                    displayAllStudents();
                    break;
                case 6:
                    addCourse();
                    break;
                case 7:
                    enrollStudentInCourse();
                    break;
                case 8:
                    addDepartment();
                    break;
                case 9:
                    displaySystemStatus();
                    break;
                case 10:
                    System.out.println("\nThank you for using Student Management System!");
                    running = false;
                    break;
                default:
                    System.out.println("Error: Invalid choice! Please try again.");
            }
        }
        scanner.close();
    }

    // Display main menu
    public void menu() {
        System.out.println("\n========== MAIN MENU ==========");
        System.out.println("1. Add Student");
        System.out.println("2. Remove Student");
        System.out.println("3. Update Student");
        System.out.println("4. Search Student");
        System.out.println("5. Display All Students");
        System.out.println("6. Add Course");
        System.out.println("7. Enroll Student in Course");
        System.out.println("8. Add Department");
        System.out.println("9. Display System Status");
        System.out.println("10. Exit");
        System.out.println("===============================");
    }

    // Add student
    private void addStudent() {
        System.out.println("\n========== ADD STUDENT ==========");
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();

        if (studentService.searchStudent(studentId) != null) {
            System.out.println("Error: Student already exists!");
            return;
        }

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Department: ");
        String department = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Phone: ");
        String phone = scanner.nextLine();

        Student student = new Student(studentId, name, age, department, email, phone);
        studentService.addStudent(student);
    }

    // Remove student
    private void removeStudent() {
        System.out.println("\n========== REMOVE STUDENT ==========");
        System.out.print("Enter Student ID to remove: ");
        String studentId = scanner.nextLine();
        studentService.removeStudent(studentId);
    }

    // Update student
    private void updateStudent() {
        System.out.println("\n========== UPDATE STUDENT ==========");
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();

        Student student = studentService.searchStudent(studentId);
        if (student == null) {
            System.out.println("Error: Student not found!");
            return;
        }

        System.out.println("Current Details:");
        student.displayStudentDetails();

        System.out.print("Enter new Name (or press Enter to skip): ");
        String name = scanner.nextLine();
        if (name.trim().isEmpty()) name = student.getName();

        System.out.print("Enter new Age (or -1 to skip): ");
        int age = student.getAge();
        if (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            scanner.nextLine();
            if (input != -1) age = input;
        } else {
            scanner.nextLine();
        }

        System.out.print("Enter new Department (or press Enter to skip): ");
        String department = scanner.nextLine();
        if (department.trim().isEmpty()) department = student.getDepartment();

        System.out.print("Enter new Email (or press Enter to skip): ");
        String email = scanner.nextLine();
        if (email.trim().isEmpty()) email = student.getEmail();

        System.out.print("Enter new Phone (or press Enter to skip): ");
        String phone = scanner.nextLine();
        if (phone.trim().isEmpty()) phone = student.getPhone();

        studentService.updateStudent(studentId, name, age, department, email, phone);
    }

    // Search student
    private void searchStudent() {
        System.out.println("\n========== SEARCH STUDENT ==========");
        System.out.print("Enter Student ID to search: ");
        String studentId = scanner.nextLine();

        Student student = studentService.searchStudent(studentId);
        if (student != null) {
            student.displayStudentDetails();
        } else {
            System.out.println("Error: Student not found!");
        }
    }

    // Display all students
    private void displayAllStudents() {
        studentService.displayAllStudents();
    }

    // Add course
    private void addCourse() {
        System.out.println("\n========== ADD COURSE ==========");
        System.out.print("Enter Course ID: ");
        String courseId = scanner.nextLine();

        for (Course c : courses) {
            if (c.getCourseId().equals(courseId)) {
                System.out.println("Error: Course already exists!");
                return;
            }
        }

        System.out.print("Enter Course Name: ");
        String courseName = scanner.nextLine();
        System.out.print("Enter Credits: ");
        int credits = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Instructor: ");
        String instructor = scanner.nextLine();

        Course course = new Course(courseId, courseName, credits, instructor);
        courses.add(course);
        System.out.println("Course added successfully!");
    }

    // Enroll student in course
    private void enrollStudentInCourse() {
        System.out.println("\n========== ENROLL STUDENT IN COURSE ==========");
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();

        Student student = studentService.searchStudent(studentId);
        if (student == null) {
            System.out.println("Error: Student not found!");
            return;
        }

        System.out.print("Enter Course ID: ");
        String courseId = scanner.nextLine();

        Course course = null;
        for (Course c : courses) {
            if (c.getCourseId().equals(courseId)) {
                course = c;
                break;
            }
        }

        if (course == null) {
            System.out.println("Error: Course not found!");
            return;
        }

        System.out.print("Enter Semester: ");
        String semester = scanner.nextLine();

        Enrollment enrollment = new Enrollment(student, course, semester);
        enrollments.add(enrollment);
        student.enrollCourse(String.valueOf(course));
        System.out.println("Student enrolled successfully!");
    }

    // Add department
    private void addDepartment() {
        System.out.println("\n========== ADD DEPARTMENT ==========");
        System.out.print("Enter Department ID: ");
        String departmentId = scanner.nextLine();

        for (Department d : departments) {
            if (d.getDepartmentId().equals(departmentId)) {
                System.out.println("Error: Department already exists!");
                return;
            }
        }

        System.out.print("Enter Department Name: ");
        String departmentName = scanner.nextLine();
        System.out.print("Enter Head of Department: ");
        String headOfDepartment = scanner.nextLine();

        Department department = new Department(departmentId, departmentName, headOfDepartment);
        departments.add(department);
        System.out.println("Department added successfully!");
    }

    // Display system status
    private void displaySystemStatus() {
        System.out.println("\n========== SYSTEM STATUS ==========");
        System.out.println("Total Students: " + studentService.getTotalStudents());
        System.out.println("Total Courses: " + courses.size());
        System.out.println("Total Departments: " + departments.size());
        System.out.println("Total Enrollments: " + enrollments.size());
        System.out.println("===================================\n");
    }
}