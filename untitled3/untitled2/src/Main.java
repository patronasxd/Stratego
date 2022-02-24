
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Screen Reader");
        primaryStage.setWidth(300);
        primaryStage.setHeight(450);
        primaryStage.setScene(new Scene(new ScreenReaderView()));
        primaryStage.show();
    }

}
