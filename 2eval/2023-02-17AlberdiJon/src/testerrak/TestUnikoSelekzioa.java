package testerrak;
//https://es.wikipedia.org/wiki/Selecci%C3%B3n_de_f%C3%BAtbol_de_Euskadi#Plantilla

import java.util.ArrayList;
import java.util.Arrays;

import model.Atezaina;
import model.Entrenatzailea;
import model.Futbolaria;
import model.Kidea;
import model.Nongoa;
import model.Selekzioa;

public class TestUnikoSelekzioa {
   public static void main(String[] args) {

      ArrayList<Kidea> kideak = new ArrayList<>();
      kideak.add(new Atezaina(15, "Aiert", "DelaTorre", "2004-01-01", 20, 16, 5));
      kideak.add(new Atezaina(2, "Julen", "Galindo", "2004-01-01", 21, 52, 2));
      kideak.add(new Futbolaria(7, "Asier", "Vieira", "2004-01-01", 3));
      kideak.add(new Futbolaria(14, "Sandra", "Hidalgo", "2004-01-01", 4));
      kideak.add(new Futbolaria(5, "Edurne", "Murua", "2004-01-01", 5));
      kideak.add(new Entrenatzailea(13, "Idoia", "Madariaga", "1850-14-02", "IE1"));
      kideak.add(new Entrenatzailea(20, "Ruben", "San Martin", "1850-14-02", "IE2"));

      Selekzioa uniSel = new Selekzioa(Nongoa.uni, kideak);

      System.out.println("\nA)");
      uniSel.kideakBistaratu();

      System.out.println("\nB)");
      System.out.println("Selekzioko kideen izenak: " + Arrays.toString(uniSel.getKideenIzenak()) );

      System.out.println("\nC)");
      int ezabatuNahidena = 7;
      for (int i = 1; i < 3; i++) {
         if (uniSel.kideaEzabatu(ezabatuNahidena) == 1)
            System.out.println(ezabatuNahidena + " id-a zeukan kidea ezabatu da.");
         else
            System.out.println("Ez dago " + ezabatuNahidena + " id-a daukan kiderik.");
      }

      System.out.println("\nD)");
      uniSel.kideakBistaratu();

      System.out.println("\nE)");
      int esleitutakoIda = 0; // libre dagoen lehengoa
      esleitutakoIda = uniSel.kideBerria(new Entrenatzailea(0, "Aitor", "Zumelaga", "1850-14-02", "F3"));
      if (esleitutakoIda > 0)
         System.out.println("Kide berriari " + esleitutakoIda + " id-a esleitu zaio.");

      System.out.println("\nF)");
      uniSel.kideakBistaratu();

   }
}
