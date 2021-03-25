package ru.job4j.Profession;

public class Dentist extends Doctor {
    private String procedure;

    public String getProcedure() { return procedure;}

    public Dentist(){
        super();
    }
    public Dentist(String name, String surname, String education, String birthday, String diagnosis, String contraindication, String therapy, String procedure) {
        super(name, surname, education, birthday, diagnosis, contraindication, therapy);
        this.procedure = procedure;
    }
}
