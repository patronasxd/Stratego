package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;

/**
 * Author: Jan de Rijke
 */
public class ScreenReaderView extends BorderPane {
    public Button getReadButton() {
        return readButton;
    }

    public TextArea getTextArea() {
        return textArea;
    }

    private Button readButton;
    private TextArea textArea;
    public ScreenReaderView() {
        initialiseNodes();
        layoutNodes();
        addEventHandlers();
    }

    private void addEventHandlers() {
        readButton.setOnAction(event -> {
            //For now we just show an alert
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Not Now!");
            alert.setTitle("Screen Reader");
            alert.showAndWait();
        });
    }

    private void layoutNodes() {
        setCenter(textArea);
        setBottom(readButton);
        BorderPane.setAlignment(readButton, Pos.CENTER);
        BorderPane.setMargin(readButton,new Insets(10, 10, 10, 10));
    }

    private void initialiseNodes() {
        readButton = new Button("Read Aloud");
        textArea = new TextArea("Enter text to read");
    }
}
