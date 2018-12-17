package Aufgabe1;

public class Mensch extends Säugetiere {

    @Override
    public String printAll() {
        //%d = Platzhalter für int
        //%s = Platzhalber für String
        return String.format("%d#%s#%s",getAlter(),getGeschlecht(),getName());
    }





    public Mensch(String name, int alter, String geschlecht) {
        super(name, alter, geschlecht);
    }
}
