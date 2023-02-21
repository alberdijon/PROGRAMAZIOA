package testerrak;
//https://es.wikipedia.org/wiki/Selecci%C3%B3n_de_f%C3%BAtbol_de_Euskadi#Plantilla

import java.util.ArrayList;

import model.Atezaina;
import model.Entrenatzailea;
import model.Futbolaria;
import model.Kidea;
import model.Nongoa;
import model.Selekzioa;

public class TestEuskalSelekzioa {
   public static void main(String[] args) {
        
      ArrayList<Kidea> kideak = new ArrayList<>();
      kideak.add(new Atezaina(1, "Aitor", "Fernández", "1990-01-01", 20,11,6));
      kideak.add(new Futbolaria(2, "Unai", "Bustinza", "1991-01-01", 2));
      kideak.add(new Futbolaria(3, "Mikel", "Balenziaga", "1992-01-01", 3));
      kideak.add(new Futbolaria(4, "Asier", "Illarramendi", "1990-01-01", 4));
      kideak.add(new Futbolaria(5, "Iñigo", "Martínez", "1990-01-01", 5));
      kideak.add(new Futbolaria(6, "Mikel", "San José", "1990-01-01", 6));
      kideak.add(new Futbolaria(7, "Gaizka", "Larrazabal", "1999-01-01", 7));
      kideak.add(new Futbolaria(8, "Manu", "García", "1998-02-01", 8));
      kideak.add(new Futbolaria(9, "Aritz", "Aduriz", "1997-05-02", 9));
      kideak.add(new Futbolaria(10, "Javier", "Eraso", "2000-03-01", 10));
      kideak.add(new Futbolaria(11, "Asier", "Villalibre", "1997-09-30", 9));
      kideak.add(new Futbolaria(12, "Aihen", "Muñoz", "2000-10-01", 12));
      kideak.add(new Atezaina(13, "Iago", "Herrerín", "1988-01-25",7,10,5));
      kideak.add(new Futbolaria(14, "Aritz", "Elustondo","2000-04-01", 14));
      kideak.add(new Futbolaria(15, "Jesús", "Areso","2000-04-01", 15));
      kideak.add(new Futbolaria(16, "Iñigo", "Vicente","2000-04-01", 23));
      kideak.add(new Futbolaria(17, "Daniel", "Vivian","2000-04-01", 17));
      kideak.add(new Entrenatzailea(18, "Javier", "Clemente", "1950-03-12", "FE1"));
      kideak.add(new Entrenatzailea(19, "Joseba", "Núñez", "", "FE2"));
      kideak.add(new Entrenatzailea(20, "Markel", "Lautadahandi", "1-1-1980", "FE3"));
    
      Selekzioa euskalSel = new Selekzioa(Nongoa.eus,kideak);  
      euskalSel.kideakBistaratu();

   } 
}
