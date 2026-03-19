public class Course {
    private String courseId;
    private String courseName;
    private int credits;
    private String instructor;

    // Constructor
    public Course(String courseId, String courseName, int credits, String instructor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
        this.instructor = instructor;
    }

    // Default Constructor
    public Course() {
    }

    // 1. setCourseDetails() - Set all course details at once
    public void setCourseDetails(String courseId, String courseName, int credits, String instructor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
        this.instructor = instructor;
        System.out.println("Course details set successfully!");
    }

    // 2. displayCourseDetails() - Display all course information
    public void displayCourseDetails() {
        System.out.println("\n========== COURSE DETAILS ==========");
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Credits: " + credits);
        System.out.println("Instructor: " + (instructor != null && !instructor.isEmpty() ? instructor : "Not Assigned"));
        System.out.println("=====================================\n");
    }

    // 3. updateCourseName() - Update course name
    public void updateCourseName(String newCourseName) {
        if (newCourseName != null && !newCourseName.trim().isEmpty()) {
            String oldName = this.courseName;
            this.courseName = newCourseName;
            System.out.println("Course name updated successfully from '" + oldName + "' to '" + newCourseName + "'");
        } else {
            System.out.println("Error: Course name cannot be empty!");
        }
    }

    // 4. updateInstructor() - Update instructor name
    public void updateInstructor(String newInstructor) {
        if (newInstructor != null && !newInstructor.trim().isEmpty()) {
            String oldInstructor = this.instructor;
            this.instructor = newInstructor;
            System.out.println("Instructor updated successfully from '" + oldInstructor + "' to '" + newInstructor + "'");
        } else {
            System.out.println("Error: Instructor name cannot be empty!");
        }
    }

    // 5. updateCredits() - Update course credits
    public void updateCredits(int newCredits) {
        if (newCredits > 0 && newCredits <= 6) {
            int oldCredits = this.credits;
            this.credits = newCredits;
            System.out.println("Credits updated successfully from " + oldCredits + " to " + newCredits);
        } else {
            System.out.println("Error: Credits must be between 1 and 6!");
        }
    }

    // 6. getCourseId() - Get course ID
    public String getCourseId() {
        return courseId;
    }

    // 7. getCourseName() - Get course name
    public String getCourseName() {
        return courseName;
    }
}
// 8.
