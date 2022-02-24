import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import javax.swing.text.LabelView;

public class HelloWord extends Application {

    public void start(Stage primaryStage){

        Label hellolabel = new Label("hello javafx");
        BorderPane root = new BorderPane(hellolabel);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
