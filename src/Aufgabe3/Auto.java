package Aufgabe3;

public class Auto extends Fahrzeug implements Comparable<Auto>{
    public Auto(short reifen, String farbe, short ps, short tueren, boolean gestartet, short geschwindigkeit) {
        super(reifen, farbe, ps, tueren, gestartet, geschwindigkeit);
    }
    public Auto() {
    }

    //Die Comparable Schnittstelle hat eine Methode compareTo(),
    //die eine negative, 0, eine positive zurückgibt
    //wenn der aktuelle Wert kleiner als, gleich oder größer als der Wert ist, mit dem wir jeweils vergleichen.
    @Override

    public int compareTo(Auto param) {
        if (param.getPs()>this.getPs())
        {
            return +1;
        }else
            if (param.getPs()<this.getPs())
        {
            return-1;
        }
            else
            {
                return 0;
            }
    }

}
