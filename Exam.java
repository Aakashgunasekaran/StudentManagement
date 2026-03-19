import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exam {
    private String examId;
    private String courseId;
    private LocalDate date;
    private int totalMarks;

    // Constructor
    public Exam(String examId, String courseId, LocalDate date, int totalMarks) {
        this.examId = examId;
        this.courseId = courseId;
        this.date = date;
        this.totalMarks = totalMarks;
    }

    // Set exam details
    public void setExamDetails(String examId, String courseId, LocalDate date, int totalMarks) {
        this.examId = examId;
        this.courseId = courseId;
        this.date = date;
        this.totalMarks = totalMarks;
        System.out.println("Exam details set successfully!");
    }

    // Display exam details
    public void displayExamDetails() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("\n========== EXAM DETAILS ==========");
        System.out.println("Exam ID: " + examId);
        System.out.println("Course ID: " + courseId);
        System.out.println("Date: " + date.format(formatter));
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("==================================\n");
    }

    // Update exam date
    public void updateExamDate(LocalDate newDate) {
        if (newDate != null) {
            LocalDate oldDate = this.date;
            this.date = newDate;
            System.out.println("Exam date updated from " + oldDate + " to " + newDate);
        } else {
            System.out.println("Error: Invalid date!");
        }
    }

    // Update total marks
    public void updateTotalMarks(int newMarks) {
        if (newMarks > 0) {
            int oldMarks = this.totalMarks;
            this.totalMarks = newMarks;
            System.out.println("Total marks updated from " + oldMarks + " to " + newMarks);
        } else {
            System.out.println("Error: Marks must be greater than 0!");
        }
    }

    // Get exam ID
    public String getExamId() {
        return examId;
    }

    // Get course ID
    public String getCourseId() {
        return courseId;
    }

    // Get date
    public LocalDate getDate() {
        return date;
    }

    // Get total marks
    public int getTotalMarks() {
        return totalMarks;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "examId='" + examId + '\'' +
                ", courseId='" + courseId + '\'' +
                ", date=" + date +
                ", totalMarks=" + totalMarks +
                '}';
    }
}