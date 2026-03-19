import java.io.Serializable;

public class Enrollment implements Serializable {
    private Student student;
    private Course course;
    private String semester;
    private String grade;

    // Constructor
    public Enrollment(Student student, Course course, String semester) {
        this.student = student;
        this.course = course;
        this.semester = semester;
        this.grade = "Not Assigned";
    }

    // Getters
    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public String getSemester() {
        return semester;
    }

    public String getGrade() {
        return grade;
    }

    // Setters
    public void setStudent(Student student) {
        this.student = student;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    // Display enrollment details
    public void displayEnrollmentDetails() {
        System.out.println("\n========== ENROLLMENT DETAILS ==========");
        System.out.println("Student: " + student.getName() + " (ID: " + student.getStudentId() + ")");
        System.out.println("Course: " + course.getCourseName() + " (ID: " + course.getCourseId() + ")");
        System.out.println("Semester: " + semester);
        System.out.println("Grade: " + grade);
        System.out.println("========================================\n");
    }

    // Update grade
    public void updateGrade(String newGrade) {
        if (newGrade != null && !newGrade.trim().isEmpty()) {
            this.grade = newGrade;
            System.out.println("Grade updated to: " + newGrade);
        } else {
            System.out.println("Error: Invalid grade!");
        }
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "student=" + student.getName() +
                ", course=" + course.getCourseName() +
                ", semester='" + semester + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}