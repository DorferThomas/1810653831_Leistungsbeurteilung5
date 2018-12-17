package Aufgabe2;

public class Student extends Mensch{
    public String studiengang;
    public int martikelnummer;


    @Override
    public void Status(){
        System.out.println(getVorname() + " " + getNachname() + " ist " + getAlter() + " Jahre alt und Studiert " + getStudiengang() + " Martikelnummer: " + getMartikelnummer());
    }

















    public Student(String vorname, String nachname, int alter, int martikelnummer,String studiengang) {
        super(vorname, nachname, alter);
        this.martikelnummer = martikelnummer;
        this.studiengang = studiengang;
    }

    public String getStudiengang() {
        return studiengang;
    }

    public void setStudiengang(String studiengang) {
        this.studiengang = studiengang;
    }

    public int getMartikelnummer() {
        return martikelnummer;
    }

    public void setMartikelnummer(int martikelnummer) {
        this.martikelnummer = martikelnummer;
    }

}
