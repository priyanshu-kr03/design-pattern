package builder;

public class StudentBuilder {
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

    public StudentBuilder setRoll(int roll) {
        this.roll = roll;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public StudentBuilder setFathersName(String fathersName){
        this.fathersName = fathersName;
        return this;
    }
    public StudentBuilder setStream(String stream) {
        this.stream = stream;
        return this;
    }

    public Student build() {
        return new Student(this);
    }


}
