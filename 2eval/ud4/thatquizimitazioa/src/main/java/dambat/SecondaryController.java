package dambat;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SecondaryController {

    private int galderak = 0;
    private Zatikia zat1;
    private Zatikia zat2;
    private Zatikia erantzuna;
    private Zatikia zuzena;

    @FXML
    Label Zenbak1Glbl; 
    
    @FXML
    Label Zenbak1Blbl;

    @FXML
    Label ikurra;

    @FXML
    Label Zenbak2Glbl;

    @FXML
    Label Zenbak2Blbl;

    @FXML
    TextField erantzGTXTFL;

    @FXML
    TextField erantzBTXTFL;

    @FXML
    Button secondaryButton;

    @FXML
    Label zuzenak;

    @FXML
    Label okerrak;

    @FXML
    private void switchToFinal() throws IOException {
        String[] ikurrak = {"+", "-", "*", "/"};
        int zenbak;
        String textua;
        String textua2;
        if(galderak == 10){
            App.setRoot("final");
        }else if(Zenbak1Blbl.getText().equals("Hasi?")){

            Zenbak1Glbl.setText(Integer.toString(zenbak = (int)(Math.random()*9 + 1)));
            Zenbak1Blbl.setText(Integer.toString(zenbak = (int)(Math.random()*9 + 1)));
            Zenbak2Glbl.setText(Integer.toString(zenbak = (int)(Math.random()*9 + 1)));
            Zenbak2Blbl.setText(Integer.toString(zenbak = (int)(Math.random()*9 + 1)));
            ikurra.setText(ikurrak[zenbak = (int)(Math.random()*3 + 0)]);

            secondaryButton.setText("ZUZENDU");
            
        }else{

            textua = Zenbak1Glbl.getText();
            textua2 = Zenbak1Blbl.getText();
            zat1 = new Zatikia(Integer.valueOf(textua), Integer.valueOf(textua2));
            textua = Zenbak2Glbl.getText();
            textua2 = Zenbak2Blbl.getText();
            zat2 = new Zatikia(Integer.valueOf(textua), Integer.valueOf(textua2));
            textua = erantzGTXTFL.getText();
            textua2 = erantzBTXTFL.getText();
            erantzuna = new Zatikia(Integer.valueOf(textua), Integer.valueOf(textua2));

            if (ikurra.equals("+")) {
                
                zuzena = Zatikia.batu(zat1, zat2);

            }else if(ikurra.equals("-")) {

                zuzena = Zatikia.kendu(zat1, zat2);
                
            }else if(ikurra.equals("*")) {

                zuzena = Zatikia.biderkatu(zat1, zat2);
                
            }else {

                zuzena = Zatikia.zatitu(zat1, zat2);
                
            }

            if(zuzena.isBaliokidea(erantzuna)){

                zenbak = Integer.valueOf(zuzenak.getText());
                zenbak++;
                zuzenak.setText(Integer.toString(zenbak));

            }else{

                zenbak = Integer.valueOf(okerrak.getText());
                zenbak++;
                okerrak.setText(Integer.toString(zenbak));

            }

            Zenbak1Glbl.setText(Integer.toString(zenbak = (int)(Math.random()*9 + 1)));
            Zenbak1Blbl.setText(Integer.toString(zenbak = (int)(Math.random()*9 + 1)));
            Zenbak2Glbl.setText(Integer.toString(zenbak = (int)(Math.random()*9 + 1)));
            Zenbak2Blbl.setText(Integer.toString(zenbak = (int)(Math.random()*9 + 1)));
            ikurra.setText(ikurrak[zenbak = (int)(Math.random()*3 + 0)]);

            galderak++;

        }
    }
}