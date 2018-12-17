package Aufgabe3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        Auto auto1 = new Auto((short)4,"green",(short)200,(short)5,false,(short)4);
        Auto auto2 = new Auto((short)4,"black",(short)70,(short)5,false,(short)8);
        Auto auto3 = new Auto((short)4,"yellow",(short)65,(short)5,false,(short)4);
        Auto auto4 = new Auto((short)4,"pink",(short)230,(short)5,false,(short)8);
        Auto auto5 = new Auto((short)4,"red",(short)90,(short)5,false,(short)4);

        List<Auto> autos = new ArrayList<>();
        autos.add(auto1);
        autos.add(auto2);
        autos.add(auto3);
        autos.add(auto4);
        autos.add(auto5);
        Collections.sort(autos);

        for (Auto eintrag : autos)
        {
            System.out.println(eintrag.getPs());
        }
    }
}