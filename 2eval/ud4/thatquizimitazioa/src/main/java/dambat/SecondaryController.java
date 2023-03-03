package dambat;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToFinal() throws IOException {
        App.setRoot("final");
    }
}