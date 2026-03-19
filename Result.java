public class Result {
    private String studentId;
    private String examId;
    private int marks;
    private String grade;

    // Constructor
    public Result(String studentId, String examId, int marks) {
        this.studentId = studentId;
        this.examId = examId;
        this.marks = marks;
        this.grade = calculateGrade(marks);
    }

    // Set result details
    public void setResultDetails(String studentId, String examId, int marks) {
        this.studentId = studentId;
        this.examId = examId;
        this.marks = marks;
        this.grade = calculateGrade(marks);
        System.out.println("Result recorded successfully!");
    }

    // Display result details
    public void displayResultDetails() {
        System.out.println("\n========== RESULT DETAILS ==========");
        System.out.println("Student ID: " + studentId);
        System.out.println("Exam ID: " + examId);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println("====================================\n");
    }

    // Calculate grade based on marks
    public String calculateGrade(int marks) {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // Update marks and recalculate grade
    public void updateMarks(int newMarks) {
        if (newMarks >= 0 && newMarks <= 100) {
            this.marks = newMarks;
            this.grade = calculateGrade(newMarks);
            System.out.println("Marks updated to: " + newMarks + ", Grade: " + grade);
        } else {
            System.out.println("Error: Marks must be between 0 and 100!");
        }
    }

    // Get student ID
    public String getStudentId() {
        return studentId;
    }

    // Get exam ID
    public String getExamId() {
        return examId;
    }

    // Get marks
    public int getMarks() {
        return marks;
    }

    // Get grade
    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Result{" +
                "studentId='" + studentId + '\'' +
                ", examId='" + examId + '\'' +
                ", marks=" + marks +
                ", grade='" + grade + '\'' +
                '}';
    }
}