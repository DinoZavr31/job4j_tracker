package ru.job4j.Profession;

public class Programmer extends Ingineer {
    private String completing;

    public String getCompleting() { return completing; }

    public Programmer(){
        super();
    }
    public Programmer(String name, String surname, String education, String birthday, String planning, String calculation, String test, String completing) {
        super(name, surname, education, birthday, planning, calculation, test);
        this.completing = completing;
    }
}
