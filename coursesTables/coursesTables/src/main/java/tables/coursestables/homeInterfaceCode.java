package tables.coursestables;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class homeInterfaceCode extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(homeInterfaceCode.class.getResource("homeView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 470);
        stage.setTitle("Home Page");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}