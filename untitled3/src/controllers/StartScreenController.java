package controllers;


import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import starter.MainApplication;
import view.ChooseTeamView;
import view.StartScreenView;
import view.View;

import java.util.Optional;

public class StartScreenController extends Controller{

    private StartScreenView view;

    public StartScreenController() {
        this.view = new StartScreenView();

        view.getButton().setOnAction(actionEvent -> switchScene());



    }


    private void switchScene(){

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("Are you sure that is your name?");
        alert.setTitle("Confirmation");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            MainApplication.switchController(new ChooseTeamController());
        }




    }


    @Override
    public View getView() {
        return view;
    }
}
