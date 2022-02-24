import com.sun.javafx.scene.control.InputField;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class StategoView extends GridPane
        /* layout type */ {
    // private Node attributes (controls)

    Button button;
    TextField textfield;

    public StategoView() {
        initialiseNodes();
        layoutNodes();
    }
    private void initialiseNodes() {
        button= new Button("repaint");
        textfield = new TextField();
        textfield.setMaxHeight(20);

        // create and configure controls
        // button = new Button("...")
        // label = new Label("...")
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public TextField getTextArea() {
        return textfield;
    }

    public void setTextArea(TextArea textArea) {
        this.textfield = textfield;
    }

    private void layoutNodes() {

        GridPane gridPane = new GridPane();
//        gridPane.add(textfield,0,0,2,2);
//        gridPane.add(button,1,0,5,2);

        gridPane.add(textfield,0,0);
        gridPane.add(button,1,0);


        getChildren().add(gridPane);
//        getChildren().add(button,1,0,1,1);
//        getChildren().add(textfield);



        // add/set … methods
        // Insets, padding, alignment, …
    }
    // package-private Getters
    // for controls used by Presenter
}
