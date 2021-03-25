package ru.job4j.Profession;

public class Doctor extends Profession {
    private String diagnosis;
    private String contraindication;
    private String therapy;

    public String getDiagnosis() { return diagnosis; }
    public String getContraindication() { return contraindication; }
    public String getTherapy() { return therapy; }

    public Doctor() {
        super();
    }

    public Doctor(String name, String surname, String education, String birthday, String diagnosis, String contraindication, String therapy) {
        super(name, surname, education, birthday);
        this.diagnosis = diagnosis;
        this.contraindication = contraindication;
        this.therapy = therapy;
    }
}
