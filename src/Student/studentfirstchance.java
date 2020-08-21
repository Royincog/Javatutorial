package Student;

public class studentfirstchance extends Student {
    public studentfirstchance(String studentName, int StudentId){
        identifyMarks = new FistChance();
        isfirstchance = true;
        studentName = super.studentName;
        StudentId = super.studentId;
    }
}
