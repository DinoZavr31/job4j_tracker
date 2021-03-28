package ru.job4j.pojo;
import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setLastName("Latypov ");
        student.setFirstName("Rinat ");
        student.setMiddleName("Nailevich ");
        student.setGroup("job4j");
        student.setCreated(new Date());
        System.out.println(student.getLastName() + student.getFirstName()
                + student.getMiddleName() + ": group - " + student.getGroup()
                + ", date - " + student.getCreated());
    }
}
