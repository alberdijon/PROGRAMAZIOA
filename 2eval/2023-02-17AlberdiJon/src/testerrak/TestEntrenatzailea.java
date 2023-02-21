package testerrak;

import model.Entrenatzailea;
import model.Kidea;

public class TestEntrenatzailea {
    public static void main(String[] args) {

        Kidea k1 = new Entrenatzailea(1, "Javier", "Clemente", "1950-03-12", "FE1");
        System.out.println(k1);
        k1.entrenatu();

        Kidea k2 = new Entrenatzailea(2, "Joseba", "Nuñez", "45-26-2025", "FE2");
        System.out.println(k2);
    }
}
