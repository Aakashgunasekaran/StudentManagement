import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Attendance {
    private String studentId;
    private String courseId;
    private LocalDate date;
    private String status; // Present, Absent, Late

    // Constructor
    public Attendance(String studentId, String courseId, LocalDate date, String status) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.date = date;
        this.status = status;
    }

    // Set attendance details
    public void setAttendanceDetails(String studentId, String courseId, LocalDate date, String status) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.date = date;
        this.status = status;
        System.out.println("Attendance recorded successfully!");
    }

    // Display attendance details
    public void displayAttendanceDetails() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("\n========== ATTENDANCE DETAILS ==========");
        System.out.println("Student ID: " + studentId);
        System.out.println("Course ID: " + courseId);
        System.out.println("Date: " + date.format(formatter));
        System.out.println("Status: " + status);
        System.out.println("========================================\n");
    }

    // Mark attendance
    public void markAttendance(String newStatus) {
        if (newStatus.equals("Present") || newStatus.equals("Absent") || newStatus.equals("Late")) {
            this.status = newStatus;
            System.out.println("Attendance marked as: " + newStatus);
        } else {
            System.out.println("Error: Invalid status! Use Present, Absent, or Late");
        }
    }

    // Update date
    public void updateDate(LocalDate newDate) {
        if (newDate != null) {
            this.date = newDate;
            System.out.println("Date updated to: " + newDate);
        } else {
            System.out.println("Error: Invalid date!");
        }
    }

    // Get student ID
    public String getStudentId() {
        return studentId;
    }

    // Get course ID
    public String getCourseId() {
        return courseId;
    }

    // Get date
    public LocalDate getDate() {
        return date;
    }

    // Get status
    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "studentId='" + studentId + '\'' +
                ", courseId='" + courseId + '\'' +
                ", date=" + date +
                ", status='" + status + '\'' +
                '}';
    }
}