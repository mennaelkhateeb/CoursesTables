package tables.coursestables;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class demoController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}