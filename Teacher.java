public class Teacher {
    private String teacherId;
    private String name;
    private String subject;
    private String email;

    // Constructor
    public Teacher(String teacherId, String name, String subject, String email) {
        this.teacherId = teacherId;
        this.name = name;
        this.subject = subject;
        this.email = email;
    }

    // Default constructor
    public Teacher() {
    }

    // Set teacher details
    public void setTeacherDetails(String teacherId, String name, String subject, String email) {
        this.teacherId = teacherId;
        this.name = name;
        this.subject = subject;
        this.email = email;
        System.out.println("Teacher details set successfully!");
    }

    // Display teacher details
    public void displayTeacherDetails() {
        System.out.println("\n========== TEACHER DETAILS ==========");
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("Email: " + email);
        System.out.println("=====================================\n");
    }

    // Update teacher name
    public void updateName(String newName) {
        if (newName != null && !newName.trim().isEmpty()) {
            String oldName = this.name;
            this.name = newName;
            System.out.println("Teacher name updated from " + oldName + " to " + newName);
        } else {
            System.out.println("Error: Name cannot be empty!");
        }
    }

    // Update subject
    public void updateSubject(String newSubject) {
        if (newSubject != null && !newSubject.trim().isEmpty()) {
            String oldSubject = this.subject;
            this.subject = newSubject;
            System.out.println("Subject updated from " + oldSubject + " to " + newSubject);
        } else {
            System.out.println("Error: Subject cannot be empty!");
        }
    }

    // Update email
    public void updateEmail(String newEmail) {
        if (newEmail != null && newEmail.contains("@")) {
            String oldEmail = this.email;
            this.email = newEmail;
            System.out.println("Email updated from " + oldEmail + " to " + newEmail);
        } else {
            System.out.println("Error: Invalid email format!");
        }
    }

    // Get teacher ID
    public String getTeacherId() {
        return teacherId;
    }

    // Get teacher name
    public String getName() {
        return name;
    }

    // Get subject
    public String getSubject() {
        return subject;
    }

    // Get email
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId='" + teacherId + '\'' +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}