package dambat;

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
    TextField Zenbakia1;
    @FXML
    TextField Zenbakia2;

    @FXML
    private void eragiketaBotoia(){
        switch (ButtonEragiketa.getText()) {
            case "+":
                ButtonEragiketa.setText("-");
                break;
            case "-":
                ButtonEragiketa.setText("x");
                break;
            case "x":
                ButtonEragiketa.setText(":");
                break;
            case ":":
             ButtonEragiketa.setText("+");
                break;
        }
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

        karakterea = Zenbakia1.getText();
        zenbak1 = Integer.parseInt(karakterea);
        
        karakterea = Zenbakia2.getText();
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