package testerrak;

import model.Atezaina;
import model.Futbolaria;
import model.Kidea;

public class TestFutbolaria {
    public static void main(String[] args) {

        Kidea k1 = new Futbolaria(1, "Asier", "Villalibre", "1997-09-30", 9);
        System.out.println(k1);
        k1.entrenatu();

        Kidea k2 = new Atezaina(2, "Iago", "Herrerín", "1988-01-25",7, 10,5);
        System.out.println(k2);
        k2.entrenatu();

    }
}
