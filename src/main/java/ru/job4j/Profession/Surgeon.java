package ru.job4j.Profession;

public class Surgeon extends Doctor {
    private String procedure;

    public String getProcedure() { return procedure; }

    public Surgeon() {
        super();
    }

    public Surgeon(String name, String surname, String education, String birthday, String diagnosis, String contraindication, String therapy, String procedure) {
        super(name, surname, education, birthday, diagnosis, contraindication, therapy);
        this.procedure = procedure;
    }
}
