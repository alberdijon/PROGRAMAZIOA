module dambat {
    requires javafx.controls;
    requires javafx.fxml;

    opens dambat to javafx.fxml;
    exports dambat;
}
