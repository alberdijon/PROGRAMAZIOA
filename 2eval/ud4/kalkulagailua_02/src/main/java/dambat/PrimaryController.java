package dambat;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    Label erantzuna;
    @FXML
    Button ButtonEragiketa;
    @FXML
    TextField Textua1;
    @FXML
    TextField Textua2;

    @FXML
    private void eragiketaBotoia(){
        String karakterea;
        String [] operazioa = new String [4];
        operazioa[0] = "+";
        operazioa[1] = "-";
        operazioa[2] = "*";
        operazioa[3] = "/";

        karakterea = ButtonEragiketa.getText();

        for(int x = 0; x < operazioa.length; x++){
            if(karakterea.equals(operazioa[x])){
                karakterea = operazioa[x + 1];
                break;
            }
        }

        ButtonEragiketa.setText(karakterea);

    }

    @FXML
    private void berdinBotoia(){
        String ikurra;
        String karakterea;
        int zenbak1;
        int zenbak2;
        int erantzun;
        String [] operazioa = new String [4];
        operazioa[0] = "+";
        operazioa[1] = "-";
        operazioa[2] = "*";
        operazioa[3] = "/";

        ikurra = ButtonEragiketa.getText();

        karakterea = Textua1.getText();
        zenbak1 = Integer.parseInt(karakterea);
        
        karakterea = Textua2.getText();
        zenbak2 = Integer.parseInt(karakterea);

        if (ikurra.equals(operazioa[0])) {
            erantzun = zenbak1 + zenbak2;
        } else if (ikurra.equals(operazioa[1])) {
            erantzun = zenbak1 - zenbak2;
        } else if(ikurra.equals(operazioa[2])){
            erantzun = zenbak1 * zenbak2;  
        }else{
            erantzun = zenbak1 / zenbak2;
        }

        erantzuna.setText(String.valueOf(erantzun));

    }

}
