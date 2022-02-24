package view;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class ChooseTeamView extends View {

    private Button redButton;
    private Button blueButton;
    private Text text;
    private Parent root;

    public ChooseTeamView(){
        initialiseNodes();
        layoutNodes();
    }


    private void initialiseNodes() {
       redButton = new Button("Red");
       blueButton = new Button("Blue");
        redButton.setMaxWidth(200);
        redButton.setMaxHeight(200);
        redButton.setMinHeight(200);
        redButton.setMinWidth(200);
        blueButton.minHeight(200);
        blueButton.setMaxWidth(200);
        blueButton.setMaxHeight(200);
        blueButton.setMinWidth(200);
        text = new Text("STRATEGO");



    }

    private void layoutNodes() {

        HBox hBox1 = new HBox();
        HBox hbox = new HBox();
        VBox vBox = new VBox();

        hBox1.getChildren().add(text);
        hBox1.setAlignment(Pos.CENTER);
        hbox.setAlignment(Pos.CENTER);


        hbox.setSpacing(30);
        hbox.setTranslateX(30);
        hbox.setTranslateY(30);
        hbox.getChildren().addAll(redButton,blueButton);
        vBox.getChildren().addAll(hBox1,hbox);

        root = vBox;
    }


    public Button getRedButton() {
        return redButton;
    }

    public void setRedButton(Button redButton) {
        this.redButton = redButton;
    }

    public Button getBlueButton() {
        return blueButton;
    }

    public void setBlueButton(Button blueButton) {
        this.blueButton = blueButton;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public void setRoot(Parent root) {
        this.root = root;
    }

    @Override
    public Parent getRoot() {
        return root;
    }
}
