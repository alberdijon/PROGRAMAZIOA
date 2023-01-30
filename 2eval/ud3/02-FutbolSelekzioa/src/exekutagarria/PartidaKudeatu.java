package exekutagarria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import enumak.Demarkazioa;
import model.Entrenador;
import model.Futbolista;
import model.IntegranteSeleccion;
import model.Masajista;
import model.Partida;

public class PartidaKudeatu {
    
    public static ArrayList<IntegranteSeleccion> selekzioa = new ArrayList<>();
    private static Partida[] partidak = new Partida[20];

    public static void main(String[] args) {

        selekzioOsoaSortu();
        

    }


    public static void selekzioOsoaSortu() {

        selekzioa.add(new Futbolista(1, 0, Demarkazioa.POR, "Aitor", 30, "Fernandez"));
        selekzioa.add(new Futbolista(2, 0, Demarkazioa.DEF, "Unai", 29, "Bustinza"));
        selekzioa.add(new Futbolista(3, 0, Demarkazioa.DEF, "Mikel", 33, "Balenziaga"));
        selekzioa.add(new Futbolista(4, 0, Demarkazioa.MED, "Asier", 31, "Illarramendi"));
        selekzioa.add(new Futbolista(5, 0, Demarkazioa.DEF, "Iñigo", 30, "Martinez"));
        selekzioa.add(new Futbolista(6, 0, Demarkazioa.MED, "Mikel", 32, "San Jose"));
        selekzioa.add(new Futbolista(7, 0, Demarkazioa.DEF, "Gaizka", 24, "Larrazabal"));
        selekzioa.add(new Futbolista(8, 0, Demarkazioa.MED, "Manu", 35, "Garcia"));
        selekzioa.add(new Futbolista(9, 0, Demarkazioa.DEL, "Aritz", 40, "Aduriz"));
        selekzioa.add(new Futbolista(10, 0, Demarkazioa.MED, "Javier", 31, "Eraso"));
        selekzioa.add(new Futbolista(11, 0, Demarkazioa.DEL, "Asier", 23, "Villalibre"));
        selekzioa.add(new Futbolista(12, 0, Demarkazioa.DEF, "Aihen", 24, "Muñoz"));
        selekzioa.add(new Futbolista(13, 0, Demarkazioa.POR, "Iago", 34, "Herrerín"));
        selekzioa.add(new Futbolista(14, 0, Demarkazioa.DEF, "Aritz", 27, "Elustondo"));
        selekzioa.add(new Futbolista(15, 0, Demarkazioa.DEF, "Jesús", 22, "Areso"));
        selekzioa.add(new Futbolista(16, 0, Demarkazioa.DEL, "Iñigo", 24, "Vicente"));
        selekzioa.add(new Futbolista(17, 0, Demarkazioa.DEF, "Daniel", 22, "Vivian"));
        selekzioa.add(new Entrenador("Euskal selekzioa", 1, "Francisco", 40, "Padalino"));  
        selekzioa.add(new Entrenador("Euskal selekzioa", 2, "Joseba", 40, "Núñez"));  
        selekzioa.add(new Entrenador("Euskal selekzioa", 3, "Markel", 40, "Lautadahandi")); 
        selekzioa.add(new Masajista("Fisioterapeuta", 21, 4, "Iñaki", 41, "Sertxiberrieta"));
        selekzioa.add(new IntegranteSeleccion(5,"Ander", "Etxeburu", 21)); 

    }


}
