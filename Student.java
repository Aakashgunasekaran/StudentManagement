public class Student {
    private String studentId;
    private String name;
    private int age;
    private String department;
    private String email;
    private String phone;
    private java.util.List<String> enrolledCourses;

    // Constructor
    public Student(String studentId, String name, int age, String department, String email, String phone) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.department = department;
        this.email = email;
        this.phone = phone;
        this.enrolledCourses = new java.util.ArrayList<>();
    }

    // Default Constructor
    public Student() {
        this.enrolledCourses = new java.util.ArrayList<>();
    }

    // 1. setStudentDetails() - Set all student details at once
    public void setStudentDetails(String studentId, String name, int age, String department, String email, String phone) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.department = department;
        this.email = email;
        this.phone = phone;
        System.out.println("Student details set successfully!");
    }

    // 2. displayStudentDetails() - Display all student information
    public void displayStudentDetails() {
        System.out.println("\n========== STUDENT DETAILS ==========");
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Age Category: " + calculateAgeCategory());
        System.out.println("Enrolled Courses: " + (enrolledCourses.isEmpty() ? "None" : enrolledCourses));
        System.out.println("=====================================\n");
    }

    // 3. updateStudent() - Update multiple student details
    public void updateStudent(String name, int age, String department, String email, String phone) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.email = email;
        this.phone = phone;
        System.out.println("Student information updated successfully!");
    }

    // 4. getStudentId() - Get student ID
    public String getStudentId() {
        return studentId;
    }

    // 5. enrollCourse() - Enroll student in a course
    public void enrollCourse(String courseName) {
        if (enrolledCourses.contains(courseName)) {
            System.out.println("Error: Already enrolled in " + courseName);
        } else {
            enrolledCourses.add(courseName);
            System.out.println("Successfully enrolled in " + courseName);
        }
    }

    // 6. dropCourse() - Drop a course
    public void dropCourse(String courseName) {
        if (enrolledCourses.contains(courseName)) {
            enrolledCourses.remove(courseName);
            System.out.println("Successfully dropped from " + courseName);
        } else {
            System.out.println("Error: Not enrolled in " + courseName);
        }
    }

    // 7. updateEmail() - Update student email
    public void updateEmail(String newEmail) {
        if (newEmail != null && newEmail.contains("@")) {
            this.email = newEmail;
            System.out.println("Email updated successfully to: " + newEmail);
        } else {
            System.out.println("Error: Invalid email format!");
        }
    }

    // 8. updatePhone() - Update student phone number
    public void updatePhone(String newPhone) {
        if (newPhone != null && newPhone.length() >= 10) {
            this.phone = newPhone;
            System.out.println("Phone number updated successfully to: " + newPhone);
        } else {
            System.out.println("Error: Invalid phone number format!");
        }
    }

    // 9. calculateAgeCategory() - Calculate age category based on age
    public String calculateAgeCategory() {
        if (age < 18) {
            return "Minor";
        } else if (age >= 18 && age < 21) {
            return "Young Adult";
        } else if (age >= 21 && age < 25) {
            return "Adult";
        } else {
            return "Senior";
        }
    }

    // 10. toString() - String representation of student
    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", enrolledCourses=" + enrolledCourses +
                ", ageCategory='" + calculateAgeCategory() + '\'' +
                '}';
    }

    // Additional Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public java.util.List<String> getEnrolledCourses() {
        return enrolledCourses;
    }
}