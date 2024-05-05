package builder;

public class Student {
    private int roll;
    private String name;
    private String fathersName;
    private String stream;

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public String getFathersName() {
        return fathersName;
    }

    public String getStream() {
        return stream;
    }

    Student(StudentBuilder studentBuilder) {
        this.roll = studentBuilder.getRoll();
        this.name = studentBuilder.getName();
        this.fathersName = studentBuilder.getFathersName();
        this.stream = studentBuilder.getStream();
    }

    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

}
