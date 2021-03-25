package ru.job4j.Profession;

public class Ingineer extends Profession {
    private String planning;
    private String calculation;
    private String test;

    public String getPlanning() { return planning; }
    public String getCalculation() { return calculation; }
    public String getTest() { return test; }

    public Ingineer(String name, String surname, String education, String birthday, String planning, String calculation, String test) {
        super(name, surname, education, birthday);
        this.planning = planning;
        this.calculation = calculation;
        this.test = test;
    }

}
