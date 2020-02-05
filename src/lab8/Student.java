package lab8;

public class Student extends Person {

    private String stdid;
    private String program;

    public Student(String id, String name,
                   String stdid,String program) {
        super(id, name);
        this.stdid = stdid;
        this.stdid = program;
    }
    //getter and setter

    public String getStdid() {
        return stdid;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
    // to String

    @Override
    public String toString() {
        return "Student{" +
                "stdid='" + stdid + '\'' +
                ", program='" + program + '\'' +
                '}';
    }
}
