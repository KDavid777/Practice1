package ua.kupaiev.hw7;

public class Student {
    public String firstName;
    public String lastName;
    public String group;
    public double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public Student() {
    }

    public int getScholarship() {
        int sum = 0;
        if (averageMark==5)
            sum=100;
        else
            sum=80;
        return sum ;
    }
}
