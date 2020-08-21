package Student;

public abstract class Student {
    int studentId;
    String studentName;
    String chance;
    boolean isfirstchance;
    int marks;
    IdentifyMarks identifyMarks;
    public void setIdentifyMarks(){
        identifyMarks.identifyMarks();
    }
}
