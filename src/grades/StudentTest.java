package grades;

public class StudentTest {

    public static void messageFormat(Student studentVar) {
        if(studentVar.getGrades().isEmpty()) {
            System.out.format("%s %s%n", studentVar.getName(), studentVar.getGrades());
        } else {
            System.out.format("%s %s %.2f%n", studentVar.getName(), studentVar.getGrades(), studentVar.getGradeAverage());
        }
    }


    public static void main(String[] args) {

        Student cesar = new Student("Cesar");
        messageFormat(cesar);
        cesar.addGrade(89);
        cesar.addGrade(78);
        cesar.addGrade(93);
        messageFormat(cesar);

        Student luis = new Student("Luis");
        messageFormat(luis);
        luis.addGrade(93);
        luis.addGrade(94);
        luis.addGrade(77);
        messageFormat(luis);

        Student sam = new Student("Sam");
        messageFormat(sam);
        sam.addGrade(93);
        sam.addGrade(94);
        sam.addGrade(77);
        messageFormat(sam);



    }
}
