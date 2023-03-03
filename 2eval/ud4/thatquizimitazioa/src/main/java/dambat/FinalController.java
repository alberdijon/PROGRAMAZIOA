package dambat;

import java.io.IOException;
import javafx.fxml.FXML;

public class FinalController {
    
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}
