package controllers;

import starter.MainApplication;
import view.ChooseTeamView;
import view.StartScreenView;
import view.View;

public class ChooseTeamController extends Controller{

    private ChooseTeamView view;

    public ChooseTeamController() {
        this.view = new ChooseTeamView();

        view.getBlueButton().setOnAction(actionEvent -> switchScene());
        view.getRedButton().setOnAction(actionEvent -> switchScene());

    }

    private void switchScene() {
        MainApplication.switchController(new SetupController());
    }

    @Override
    public View getView() {
        return view;
    }
}
