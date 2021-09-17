package ua.kupaiev.hw7;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        Student student = new Student("Nikita", "Bronks", "BIBMI", 5);
        Aspirant aspirant = new Aspirant("Samuel","Wilson","BIBMI",4, "naychRab1");
        Student aspirant2 = new Aspirant("Jack","Davies","BIBMI",5, "naychRab2");
        Student[] students = {student, aspirant,aspirant2};
        for (int i = 0; i < students.length; i++) {
            System.out.println("Cтипендия студента: " + students[i].lastName + " "+ students[i].getScholarship());
        }
    }
}
