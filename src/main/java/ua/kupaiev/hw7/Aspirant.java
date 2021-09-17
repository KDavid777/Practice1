package ua.kupaiev.hw7;

public class Aspirant extends Student{
    String naychnayaRab;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String naychnayaRab) {
        super(firstName, lastName, group, averageMark);
        this.naychnayaRab = naychnayaRab;
    }

    @Override
    public int getScholarship() {
        int sum = 0;
        if (averageMark==5)
            sum=200;
        else
            sum=180;
        return sum ;
    }
}
