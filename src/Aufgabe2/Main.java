package Aufgabe2;

public class Main {
    public static void main(String[] args)
    {
        Mensch mensch1 = new Mensch("Thomas","Dorfer",24);
        mensch1.Status();

        Student student1 = new Student("Thomas","Dorfer",24,1810653831,"Web.vzB2018");
        student1.Status();
    }
}
