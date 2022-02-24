package view;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class StartScreenView extends View {


    private TextField textField;
    private Button button;
    private Text text;
    private Parent root;

    public StartScreenView(){
        initialiseNodes();
        layoutNodes();
    }


    private void initialiseNodes() {
        textField = new TextField();
        textField.setMaxWidth(90);
        text = new Text("Enter your name");

        button = new Button("Start Game");
    }

    private void layoutNodes() {

        VBox vbox = new VBox();

        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(20);

        vbox.getChildren().addAll(text,textField,button);
        BorderPane.setAlignment(vbox, Pos.CENTER);
        root = vbox;
    }


    public TextField getTextField() {
        return textField;
    }

    public void setTextField(TextField textField) {
        this.textField = textField;
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }



    @Override
    public Parent getRoot() {
        return root;
    }
}
